package com.maisuradze.transactions.storage.repository;

import com.maisuradze.transactions.storage.model.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<CourseEntity, String> {
}
