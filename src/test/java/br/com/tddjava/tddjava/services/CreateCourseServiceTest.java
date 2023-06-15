package br.com.tddjava.tddjava.services;

import br.com.tddjava.tddjava.modules.courses.repository.CourseInMemoryRepository;
import br.com.tddjava.tddjava.modules.courses.repository.CourseRepository;
import br.com.tddjava.tddjava.modules.courses.services.CreateCourseService;
import br.com.tddjava.tddjava.modules.courses.services.entities.Course;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CreateCourseServiceTest {

  @Test
  public void should_be_able_to_create_a_new_course() {

    Course course = new Course();
    course.setDescription("Course description test");
    course.setName("Course");
    course.setWorkload(100);

    CourseInMemoryRepository repository = new CourseInMemoryRepository();

    CreateCourseService createCourseService = new CreateCourseService(repository);
    Course createdCourse = createCourseService.execute(course);

    assertNotNull(createdCourse.getId());

  }

  @org.junit.Test(expected = Error.class)
  public void should_not_be_able_to_create_a_new_course_if_exists() {
    Course course = new Course();
    course.setDescription("Not created course");
    course.setName("Course");
    course.setWorkload(100);

    CourseInMemoryRepository repository = new CourseInMemoryRepository();

    CreateCourseService createCourseService = new CreateCourseService(repository);
    createCourseService.execute(course);
    createCourseService.execute(course);
  }
}
