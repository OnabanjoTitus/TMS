package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.lang.NonNull;

import java.time.LocalDate;
import java.util.Objects;
@EntityScan
public class Project {
    @Id
    private Long id;
    @NonNull
    private String name;
    private LocalDate dateCreated;

    public Project() {
    }

    public Project(Project project){
       this(project.getId(), project.getName(),project.getDateCreated());
    }
    public Project(@JsonProperty("Id") Long id, @JsonProperty("name") String name,@JsonProperty("date") LocalDate dateCreated) {
        this.id = id;
        this.name = name;
        this.dateCreated = dateCreated;
    }

    public Project(String testname, LocalDate now) {
    this.name=testname;
    this.dateCreated= now;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }


}
