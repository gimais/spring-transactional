package com.maisuradze.transactions.storage.repository;

import com.maisuradze.transactions.storage.model.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, String> {
}
