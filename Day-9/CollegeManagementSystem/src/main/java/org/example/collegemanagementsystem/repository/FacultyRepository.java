package org.example.collegemanagementsystem.repository;

import org.example.collegemanagementsystem.entity.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
}