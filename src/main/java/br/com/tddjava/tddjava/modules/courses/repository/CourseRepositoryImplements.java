package br.com.tddjava.tddjava.modules.courses.repository;

import br.com.tddjava.tddjava.modules.courses.services.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseRepositoryImplements implements  ICourseRepository{

  @Autowired
  CourseRepository courseRepository;

  @Override
  public Course findByName(String name) {
    return this.courseRepository.findByName(name);
  }

  @Override
  public Course save(Course course) {
    return this.courseRepository.save(course);
  }
}
