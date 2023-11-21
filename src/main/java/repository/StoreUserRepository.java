package repository;

import model.StoreUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreUserRepository extends JpaRepository<StoreUser, String> {
}
