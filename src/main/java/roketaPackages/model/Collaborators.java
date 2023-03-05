package roketaPackages.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Collaborators {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long code;

	private String name;

	@OneToOne
	@JoinColumn(name = "code_position", referencedColumnName = "code")
	private Position position;

	

	

}
