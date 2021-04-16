package Service;

import model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import repository.ProjectRepo;
import repository.ProjectRepoImpl;

import java.util.Optional;

public class ProjectServiceImpl implements ProjectService{

    @Autowired
    private ProjectRepo projectRepo;

    @Override
    public Optional<Project> findById(Long id) {
        return projectRepo.findById(id);
    }

    @Override
    public Project save(Project project) {
        return projectRepo.save(project);
    }
}
