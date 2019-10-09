package io.spring.dao;

import io.spring.entities.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, Integer > {

}
