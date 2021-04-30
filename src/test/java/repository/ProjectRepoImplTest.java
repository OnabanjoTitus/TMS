package repository;

import Service.ProjectService;
import Service.ProjectServiceImpl;
import model.Project;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig
class ProjectRepoImplTest {
    @Autowired
    private final ProjectService projectService;
    @Autowired
    public ProjectRepoImplTest(ProjectService projectService) {
        this.projectService=projectService;
    }


    @Test
    void checkIfSaved(){
        Project newProject =new Project(1L,"first", LocalDate.now());
         assertNotNull(projectRepo.save(newProject));
    }
    @Test
    void checkThatItCanBeFetched(){
        Project newProject =new Project(1L,"first", LocalDate.now());
        projectRepo.save(newProject);
        assertEquals(newProject,projectRepo.findById(1L).get());
    }
}