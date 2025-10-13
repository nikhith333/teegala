package com.example.project.module;

import jakarta.persistence.*;

@Entity
@Table(name = "college")
public class College {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String collegeName;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private String adminName;

    public College() {}

    public College(Long id, String collegeName, String location, String adminName) {
        this.id = id;
        this.collegeName = collegeName;
        this.location = location;
        this.adminName = adminName;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCollegeName() { return collegeName; }
    public void setCollegeName(String collegeName) { this.collegeName = collegeName; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getAdminName() { return adminName; }
    public void setAdminName(String adminName) { this.adminName = adminName; }

    @Override
    public String toString() {
        return "College [id=" + id + ", collegeName=" + collegeName + ", location=" + location + ", adminName=" + adminName + "]";
    }
}
