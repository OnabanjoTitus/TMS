package Service;

import model.Project;

import java.util.Optional;

public interface ProjectService {
    Optional<Project> findById(Long id);
    Project save(Project project);
}
