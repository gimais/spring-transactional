package com.maisuradze.transactions.storage.model;

import com.maisuradze.transactions.storage.helper.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "classrooms")
public class ClassroomEntity extends AbstractEntity {

	private int room;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "course_id")
	private CourseEntity course;

	@ManyToOne(fetch = FetchType.EAGER)
	private LecturerEntity lecture;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "classrooms")
	private List<StudentEntity> students;

}
