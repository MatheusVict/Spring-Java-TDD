package br.com.tddjava.tddjava.modules.courses.repository;

import br.com.tddjava.tddjava.modules.courses.services.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CourseRepository extends JpaRepository<Course, UUID> {
  public Course findByName(String name);
}