package ralphClassPackages;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ralphClassPackages.model.Course;
import ralphClassPackages.model.Student;
import ralphClassPackages.repository.CourseRepository;
import ralphClassPackages.repository.StudentRepository;

@SpringBootApplication
public class RalphClass02Application {

	public static void main(String[] args) {
		SpringApplication.run(RalphClass02Application.class, args);
	}
	
	@Bean
	public CommandLineRunner mappingDemo(StudentRepository ar, CourseRepository cr) {
	    return args -> {

	        // Criar um aluno
	        Student student = new Student();
	        student.setStudent("Ralf");

	        // Cadastrar na tabela alunos
	        ar.save(student);

	        // Criar três cursos
	        Course c1 = new Course();
	        c1.setCourse("Java - Spring Boot");

	        Course c2 = new Course();
	        c2.setCourse("Python - Flask");

	        Course c3 = new Course();
	        c3.setCourse("PHP - Laravel");

	        // Cadastrar os cursos na tabela cursos
	        cr.saveAll(Arrays.asList(c1, c2, c3));

	        // Adicionar os primeiro e o terceiro curso no aluno
	        student.getCourses().addAll(Arrays.asList(c1, c3));

	        // Atualizar a lista de cursos do aluno
	        ar.save(student);
	    };
	}
	
	

}
