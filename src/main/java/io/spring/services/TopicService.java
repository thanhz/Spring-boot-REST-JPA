package io.spring.services;

import io.spring.dao.TopicRepository;
import io.spring.entities.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics(){
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return  topics;
    }

    public Optional<Topic> getTopic(int id){
        return topicRepository.findById(id);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic, int id) { //We do not need an id in the path for updating because save() checks for existing id
        if(getTopic(id).isPresent()) {
            topicRepository.save(topic);
        } else {
            System.out.println("Topic does not exist");
        }
    }

    public void deleteTopic(int id) {
        topicRepository.deleteById(id);
    }

    public boolean existsById(int id) { //Helper method
        return topicRepository.existsById(id);
    }
}
