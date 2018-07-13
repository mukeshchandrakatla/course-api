package com.mukesh.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = Arrays.asList(new Topic("spring","spring framework","spring framework description"),
			new Topic("java","corejava","corejava description"),
			new Topic("javascript","javascript es","javascript description")
			);
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	public Topic getTopic(String id) {
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
}
