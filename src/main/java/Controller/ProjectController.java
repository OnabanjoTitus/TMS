package Controller;


import Service.ProjectService;
import model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


@RequestMapping(value = "/projects")
@RestController
public class ProjectController {
    private final ProjectService projectService;

    @Autowired
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
