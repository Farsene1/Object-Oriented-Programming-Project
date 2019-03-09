package hello;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {

    @Query(value = "SELECT * from users", nativeQuery = true)
    public List<User> findAllUsers();

    @Query(value = "SELECT * from users where username ->> ?1", nativeQuery = true)
    public User findUserByUsername(String username);
}
