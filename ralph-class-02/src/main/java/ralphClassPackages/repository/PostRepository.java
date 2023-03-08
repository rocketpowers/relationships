package ralphClassPackages.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ralphClassPackages.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
	

}
