package repository;

import model.Project;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig
class ProjectRepoImplTest {
    private final ProjectRepo projectRepo;
    @Autowired
    public ProjectRepoImplTest(ProjectRepo projectRepo) {
        this.projectRepo = projectRepo;
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