package roketaPackages.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import roketaPackages.model.Collaborators;


@Repository
public interface CollaboratorRepository extends CrudRepository<Collaborators, Long>{

}
