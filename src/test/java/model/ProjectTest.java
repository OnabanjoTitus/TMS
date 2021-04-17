package model;

import org.apache.catalina.core.ApplicationContext;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
@SpringJUnitConfig
class ProjectTest {
    Project project;
    @BeforeEach
    void setUp() {
        project= new Project(1L,"my first project", LocalDate.now());
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkForId(){
        assertEquals(1L,project.getId());
    }
    @Test
    void checkForName(){
        assertEquals("my first project",project.getName());
    }
}