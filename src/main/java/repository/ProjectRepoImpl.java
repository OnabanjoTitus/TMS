package repository;

import model.Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProjectRepoImpl implements ProjectRepo{
List<Project> projectList= new ArrayList<>();

    @Override
    public Optional<Project> findById(Long id) {
        return projectList.stream().filter(p -> p.getId().equals(id)).findFirst();
    }

    @Override
    public Project save(Project project) {
       Project existingProject= findById(project.getId()).orElse(null);
       if  (existingProject==null){
           projectList.add(project) ;
       }else {
           projectList.remove(existingProject);
           save(project);
       }

        return project;
    }
}
