package br.com.tddjava.tddjava.modules.courses.repository;

import br.com.tddjava.tddjava.modules.courses.services.entities.Course;

public interface ICourseRepository {
  public Course findByName(String name);
  public Course save(Course course);
}
