package com.maisuradze.transactions.service;

import com.maisuradze.transactions.storage.model.CourseEntity;
import com.maisuradze.transactions.storage.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CourseService {

	private final CourseRepository courseRepository;

	private final OtherService otherService;

	@Autowired
	public CourseService(CourseRepository courseRepository, OtherService otherService) {
		this.courseRepository = courseRepository;
		this.otherService = otherService;
	}

	@Transactional
	public void createCourseJob() {
		String name = "Math-first-insert";
		courseRepository.save(new CourseEntity(name, (short) 6));

		createCourseJobA();

		throw new RuntimeException();
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void createCourseJobA() {
		String name = "Math-meore-scda";
		courseRepository.save(new CourseEntity(name, (short) 6));
	}

}
