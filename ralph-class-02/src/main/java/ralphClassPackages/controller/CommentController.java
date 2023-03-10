package ralphClassPackages.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ralphClassPackages.model.Comment;
import ralphClassPackages.repository.CommentRepository;

@RestController
@RequestMapping("/comment")
public class CommentController {
	
	@Autowired
	private CommentRepository commentRepository;
	
	
	@GetMapping("/listAll")
	public Iterable<Comment> list(){
		return commentRepository.findAll();
		
	}
	
	@PostMapping("/register")
	public Comment register(@RequestBody Comment obj) {
		return commentRepository.save(obj);
	}
	
	

}
