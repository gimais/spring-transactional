package com.maisuradze.transactions.storage.repository;

import com.maisuradze.transactions.storage.model.LecturerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LecturerRepository extends JpaRepository<LecturerEntity, String> {
}
