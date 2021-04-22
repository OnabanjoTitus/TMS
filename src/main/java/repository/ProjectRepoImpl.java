package repository;

import model.Project;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProjectRepoImpl {
    List<Project> projectList = new ArrayList<>();

    public ProjectRepoImpl() {
        super();
    }

}
