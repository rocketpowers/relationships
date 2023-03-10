package ralphClassPackages.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ralphClassPackages.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
