package com.maisuradze.transactions.storage.model;

import com.maisuradze.transactions.storage.helper.AbstractEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "students")
public class StudentEntity extends AbstractEntity {

	private String firstName;

	private String lastName;

	private String phone;

	private LocalDate registered;

	@ManyToMany(fetch = FetchType.LAZY)
	private List<ClassroomEntity> classrooms;

	public StudentEntity(String firstName, String lastName, String phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.registered = LocalDate.now();
	}
}
