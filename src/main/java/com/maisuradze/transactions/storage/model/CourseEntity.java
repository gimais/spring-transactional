package com.maisuradze.transactions.storage.model;

import com.maisuradze.transactions.storage.helper.AbstractEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "courses")
public class CourseEntity extends AbstractEntity {

	private String name;

	private short credit;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "course")
	@ToString.Exclude
	private List<ClassroomEntity> classrooms;

	public CourseEntity(String name, short credit) {
		this.name = name;
		this.credit = credit;
	}

}
