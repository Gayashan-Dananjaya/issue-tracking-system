package com.issue_tracker.entity;

import com.issue_tracker.util.Priority;
import com.issue_tracker.util.Status;
import com.issue_tracker.util.Type;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@ToString(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "issue")
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(name = "submitter_name", nullable = false)
    private String submitterName;

    @Column(name = "submitter_email")
    private String submitterEmail;

    @Column(name = "publish_time", nullable = false)
    private LocalDateTime publishTime;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "project_id", nullable = false)
    private Project project;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "developer_id", nullable = false)
    private Developer developer;

    @Column(nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private Type type;

    @Column(nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private Priority priority;

    @Column(nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private Status status;

    @OneToMany(mappedBy = "issue", cascade = {CascadeType.ALL}, orphanRemoval = true)
    private List<History> issueHistory = new ArrayList<>();

    public Issue(String title, String submitterName, String submitterEmail, LocalDateTime publishTime, Project project, Developer developer, Type type, Priority priority, Status status) {
        this.title = title;
        this.submitterName = submitterName;
        this.submitterEmail = submitterEmail;
        this.publishTime = publishTime;
        this.project = project;
        this.developer = developer;
        this.type = type;
        this.priority = priority;
        this.status = status;
    }
}
