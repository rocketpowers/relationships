package ralphClassPackages.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long code;

	private String student;

	@ManyToMany
	@JoinTable(
	
	name="auxTable",
	joinColumns = {@JoinColumn(name="codeStudent", referencedColumnName = "code")},
	inverseJoinColumns = {@JoinColumn(name="codeCurse", referencedColumnName = "code")}
	)
	private List<Course> courses = new ArrayList<>();
	
	

}
