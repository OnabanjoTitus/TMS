package Service;

import model.Project;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Component
public interface ProjectService {
    Optional<Project> findById(Long id);
    void save(Project project);
}
