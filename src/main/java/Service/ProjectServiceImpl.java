package Service;

import model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import repository.ProjectRepo;

import java.util.Optional;

@Component
public class ProjectServiceImpl implements ProjectService{

    private final ProjectRepo projectRepo;

    @Autowired
    public ProjectServiceImpl(ProjectRepo projectRepo) {
        this.projectRepo = projectRepo;
    }


//    @Autowired
//    public ProjectServiceImpl(ProjectRepo projectRepo) {
//        this.projectRepo = projectRepo;
//    }

    @Override

    public Optional<Project> findById(Long id) {
//        LOG.debug("Project Service >> Finding Project By Id {}",id);
        return projectRepo.findById(id);
    }

    @Override
    public void save(Project project) {
//        LOG.debug("Project Service >> Saving Project {}",project);
        projectRepo.save(project);
    }
}
