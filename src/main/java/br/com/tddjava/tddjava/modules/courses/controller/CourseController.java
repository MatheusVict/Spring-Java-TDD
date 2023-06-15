package br.com.tddjava.tddjava.modules.courses.controller;

import br.com.tddjava.tddjava.modules.courses.repository.CourseRepositoryImplements;
import br.com.tddjava.tddjava.modules.courses.services.CreateCourseService;
import br.com.tddjava.tddjava.modules.courses.services.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CourseController {
  @Autowired
  private CourseRepositoryImplements repositoryImplements;

  @PostMapping
  public Course createCourse(@RequestBody Course course) {
    CreateCourseService createCourseService = new CreateCourseService(repositoryImplements);
    return createCourseService.execute(course);
  }
}
