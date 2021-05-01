package Controller;


import Service.ProjectService;
import model.Project;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
@RequestMapping(value = "/projects")
@RestController
public class ProjectController {
    private ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping(value= "/{id}")
    public Project findOne(@PathVariable Long id){
        return projectService.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
    @PostMapping
    public void create(@RequestBody @Validated @ModelAttribute("project") Project project, BindingResult bindingResult){
        projectService.save(project);
    }
}
