package com.maisuradze.transactions.storage.repository;

import com.maisuradze.transactions.storage.model.ClassroomEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomRepository extends JpaRepository<ClassroomEntity, String> {
}
