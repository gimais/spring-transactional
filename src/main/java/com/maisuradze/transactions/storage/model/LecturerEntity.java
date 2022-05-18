package com.maisuradze.transactions.storage.model;

import com.maisuradze.transactions.storage.helper.AbstractEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "lectures")
public class LecturerEntity extends AbstractEntity {

	private String firstName;

	private String lastName;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "lecture")
	private List<ClassroomEntity> classrooms;

	public LecturerEntity(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
