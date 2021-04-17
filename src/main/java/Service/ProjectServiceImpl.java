package Service;

import model.Project;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import repository.ProjectRepo;

import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService{
    private ProjectRepo projectRepo;

    private static final Logger LOG = LoggerFactory.getLogger(ProjectServiceImpl.class);
    @Autowired
    public ProjectServiceImpl(@Qualifier("ProjectRepoImpl") ProjectRepo projectRepo) {
        this.projectRepo = projectRepo;
    }

    @Override

    public Optional<Project> findById(Long id) {
        LOG.debug("Project Service >> Finding Project By Id {}",id);
        return projectRepo.findById(id);
    }

    @Override
    public Project save(Project project) {
        LOG.debug("Project Service >> Saving Project {}",project);
        return projectRepo.save(project);
    }
}
