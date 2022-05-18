package com.maisuradze.transactions.storage.helper;

import lombok.Getter;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import java.util.UUID;

@Getter
@MappedSuperclass
public abstract class AbstractEntity {

	@Id
	private String id;

	@PrePersist
	public void setId() {
		this.id = UUID.randomUUID().toString();
	}

	@Override
	public boolean equals(Object o) {
		if(!(o instanceof AbstractEntity)) return false;
		return this.id.equals(((AbstractEntity) o).id);
	}

}
