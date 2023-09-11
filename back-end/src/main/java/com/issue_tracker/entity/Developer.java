package com.issue_tracker.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@ToString(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "developer")
public class Developer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false, length = 20)
    private String contact;

    @OneToMany(mappedBy = "developer")
    private List<Issue> issueList = new ArrayList<>();

    public Developer(String name, String email, String contact) {
        this.name = name;
        this.email = email;
        this.contact = contact;
    }
}
