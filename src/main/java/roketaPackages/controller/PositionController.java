package roketaPackages.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import roketaPackages.model.Position;
import roketaPackages.repository.PositionRepository;


@RestController
@RequestMapping("/position")
public class PositionController {

	@Autowired
	private PositionRepository positionRepository;

	@GetMapping("/list")
	public Iterable<Position> select() {
		return positionRepository.findAll();
	}

	@PostMapping("/register")
	public Position register(@RequestBody Position obj) {
		return positionRepository.save(obj);
	}
	
	

}
