package br.com.tddjava.tddjava.modules.courses.services;

import br.com.tddjava.tddjava.modules.courses.repository.CourseRepository;
import br.com.tddjava.tddjava.modules.courses.repository.ICourseRepository;
import br.com.tddjava.tddjava.modules.courses.services.entities.Course;
import org.springframework.stereotype.Service;

@Service
public class CreateCourseService {

  private ICourseRepository courseRepository;

  public CreateCourseService(ICourseRepository courseRepository) {
    this.courseRepository = courseRepository;
  }

  public Course execute(Course course) {
    Course existedCourse = this.courseRepository.findByName(course.getName());

    if(existedCourse != null) {
      throw new Error("Curso já existente");
    }

    return this.courseRepository.save(course);
  }
}
