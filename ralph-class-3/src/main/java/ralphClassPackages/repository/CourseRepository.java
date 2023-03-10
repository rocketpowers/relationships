package ralphClassPackages.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ralphClassPackages.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
