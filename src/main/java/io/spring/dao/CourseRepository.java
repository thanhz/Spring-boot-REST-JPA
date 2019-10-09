package io.spring.dao;

import io.spring.entities.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, Integer > {

    List<Course> findByTopicId(int id);
}
