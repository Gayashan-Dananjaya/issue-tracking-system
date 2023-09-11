package com.issue_tracker.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@ToString(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "project_name", nullable = false)
    private String projectName;
    @Column(name = "client_name", nullable = false)
    private String clientName;
    private Integer duration;
    private LocalDate submission;

    @OneToMany(mappedBy = "project", cascade = {CascadeType.REMOVE}, orphanRemoval = true)
    private List<Issue> issueList = new ArrayList<>();
}
