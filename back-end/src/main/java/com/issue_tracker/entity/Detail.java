package com.issue_tracker.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@ToString(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "detail")
public class Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 510, nullable = false)
    private String about;

    @Column(length = 20, nullable = false)
    private String contact1;

    @Column(length = 20)
    private String contact2;

    public Detail(String about, String contact1, String contact2) {
        this.about = about;
        this.contact1 = contact1;
        this.contact2 = contact2;
    }
}
