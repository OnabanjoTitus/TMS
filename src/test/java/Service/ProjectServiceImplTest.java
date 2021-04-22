package Service;

import model.Project;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
@SpringJUnitConfig
class ProjectServiceImplTest {

    private ProjectService projectService;
    @Autowired
    public ProjectServiceImplTest(ProjectService projectService) {
        this.projectService = projectService;
    }

    @Test
    void checkIfSaved(){
        Project newProject =new Project(1L,"first", LocalDate.now());
        projectService.save(newProject);
        assertEquals(newProject,projectService.findById(1L).get());
    }
    @Test
    void checkThatItCanBeFetched(){
        Project newProject =new Project(1L,"first", LocalDate.now());
        projectService.save(newProject);
        assertEquals(newProject,projectService.findById(1L).get());
    }
}