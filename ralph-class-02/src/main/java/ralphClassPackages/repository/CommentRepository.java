package ralphClassPackages.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ralphClassPackages.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
