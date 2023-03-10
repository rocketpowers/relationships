package ralphClassPackages.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ralphClassPackages.model.Post;
import ralphClassPackages.repository.PostRepository;

@RestController
@RequestMapping("/post")
public class PostController {

	@Autowired
	private PostRepository postRepository;
	
	@GetMapping("/listall")
	public Iterable<Post> list(){
		return postRepository.findAll();
	}
	@PostMapping("/register")
	public Post register (@RequestBody Post obj) {
		return postRepository.save(obj);
	}

}
