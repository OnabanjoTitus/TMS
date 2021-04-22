package Controller;


import Service.ProjectService;
import model.Project;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return projectService.findById(id).get();
    }
}
