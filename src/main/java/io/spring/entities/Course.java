package io.spring.entities;

import javax.persistence.*;

@Entity
public class Course {

    @Id
    @GeneratedValue //autoincrements primary key, however it creates a sequence table in db
    private int courseId;
    private String name;
    private double price;
    @ManyToOne
    private Topic topic;

    public Course() {

    }

    public Course(int courseId, String name, String desc, double price, int topicId) {
        this.courseId = courseId;
        this.name = name;
        this.price = price;
        this.topic = new Topic(topicId,"","",0);
    }

    public int getCourseId() { return courseId; }

    public void setCourseId(int courseId) { this.courseId = courseId; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}
