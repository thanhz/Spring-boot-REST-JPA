package io.spring.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Topic {

    @Id
    @GeneratedValue
    private int id;
    private String name;
/*    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "topic")
    private Set<Course> courses = new HashSet<>();*/

    public Topic() {

    }

    public Topic(int id, String name, String desc, double price) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

/*    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }*/
}
