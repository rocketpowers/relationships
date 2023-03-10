package ralphClassPackages.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long code;

	private String course;

	@ManyToMany(mappedBy = "courses" )
	private List<Student> students = new ArrayList<>();

}
