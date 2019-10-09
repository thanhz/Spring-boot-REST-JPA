package io.spring.controllers;

import io.spring.entities.Course;
import io.spring.entities.Topic;
import io.spring.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/topics/{topicId}/courses")
    public List<Course> getAllCourses(@PathVariable int topicId) {
        return courseService.getAllCourses(topicId);
    }

    @GetMapping("/topics/{topicId}/courses/{id}")
    public Optional<Course> getCourse(@PathVariable int id) {
        return courseService.getCourse(id);
    }

    @PostMapping("/topics/{topicId}/courses")
    public void addCourse(@RequestBody Course course, @PathVariable int topicId) {
        course.setTopic(new Topic(topicId, "", "", 0));
        courseService.addCourse(course);
    }

    @PutMapping("/topics/{topicId}/courses/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable int topicId, @PathVariable int id) { //We do not need an id in the path for updating because save() checks for existing id
        course.setTopic(new Topic(topicId, "", "", 0));
        courseService.updateTopic(course);
    }

    @DeleteMapping("/topics/{topicId}/courses/{id}")
    public void deleteCourse(@PathVariable int id) {
        courseService.deleteCourse(id);
    }
}
