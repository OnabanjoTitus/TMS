package repository;

import model.Project;

import java.util.Optional;

public interface ProjectRepo {
    Optional<Project> findById(Long id);
    Project save(Project project);
}
