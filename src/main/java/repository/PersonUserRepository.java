package repository;

import model.PersonUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonUserRepository extends JpaRepository<PersonUser, String> {
}
