package Service;

import model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import repository.ProjectRepo;

import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService{
    private ProjectRepo projectRepo;

    @Autowired
    public ProjectServiceImpl(@Qualifier("ProjectRepoImpl") ProjectRepo projectRepo) {
        this.projectRepo = projectRepo;
    }

    @Override
    public Optional<Project> findById(Long id) {
        return projectRepo.findById(id);
    }

    @Override
    public Project save(Project project) {
        return projectRepo.save(project);
    }
}
