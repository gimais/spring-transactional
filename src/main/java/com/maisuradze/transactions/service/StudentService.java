package com.maisuradze.transactions.service;

import com.maisuradze.transactions.storage.model.CourseEntity;
import com.maisuradze.transactions.storage.repository.ClassroomRepository;
import com.maisuradze.transactions.storage.repository.CourseRepository;
import com.maisuradze.transactions.storage.repository.LecturerRepository;
import com.maisuradze.transactions.storage.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService {

	private final PlatformTransactionManager platformTransactionManager;

	private final TransactionDefinition transactionDefinition;

	private final StudentRepository studentRepository;

	private final CourseService courseService;

	private final ClassroomRepository classroomRepository;

	private final LecturerRepository lecturerRepository;

	@Autowired
	public StudentService(
			PlatformTransactionManager platformTransactionManager,
			TransactionDefinition transactionDefinition,
			StudentRepository studentRepository, CourseService courseService,
			ClassroomRepository classroomRepository, LecturerRepository lecturerRepository) {
		this.platformTransactionManager = platformTransactionManager;
		this.transactionDefinition = transactionDefinition;
		this.studentRepository = studentRepository;
		this.courseService = courseService;
		this.classroomRepository = classroomRepository;
		this.lecturerRepository = lecturerRepository;
	}


	@Scheduled(fixedDelay = 1000)
	public void init() {
		courseService.createCourseJob();
	}


//	@Scheduled(fixedDelay = 10000)
//	public void createStudentJob() {
//		studentRepository.save(new StudentEntity("Irakli", "Maisurdze", "571 209 911"));
//	}

//	@Scheduled(fixedDelay = 10000)
//	public void createLectureJob() {
//		lecturerRepository.save(new LecturerEntity("Leqtor", "Qala"));
//	}

//	@Scheduled(fixedDelay = 10000)
//	public void createClassroomJob() {
//		int room = 51;
//		CourseEntity course = courseRepository.findAll().get(0);
//		LecturerEntity lecture = lecturerRepository.findAll().get(0);
//		List<StudentEntity> students = studentRepository.findAll();
//
//		ClassroomEntity entity = classroomRepository.save(new ClassroomEntity(room, course, lecture, students));
//
//		System.out.println(entity);
//	}


}
