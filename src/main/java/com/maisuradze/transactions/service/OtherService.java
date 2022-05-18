package com.maisuradze.transactions.service;

import com.maisuradze.transactions.storage.model.CourseEntity;
import com.maisuradze.transactions.storage.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OtherService {

	private final CourseRepository courseRepository;

	@Autowired
	public OtherService(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	@Transactional
	public void createCourseJobA() {
		String name = "Math-second-insert";
		courseRepository.save(new CourseEntity(name, (short) 6));
	}

}
