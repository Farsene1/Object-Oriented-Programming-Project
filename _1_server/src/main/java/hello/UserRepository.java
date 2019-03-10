package hello;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

/**
 * User repository extending to crud repository.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
    /**
     * Query to findAllUsers.
     */
    @Query(value = "SELECT * from users", nativeQuery = true)
   List<User> findAllUsers();
    /**
     * Query to find a specific user by username.
     * @param username
     */
    @Query(value = "SELECT * from users where username = ?1",
            nativeQuery = true)
    List<User> findUserByUsername(String username);
    /**
     * Query to update a users attributes.
     */
    @Query(value = "UPDATE users SET water_footprint = ?2, "
            + "food_footprint= ?3, transport_footprint = ?4, "
            + "polar_score = ?5, date = ?6 WHERE username = ?1",
            nativeQuery = true)
    List<User> updateActivity(String username, Integer water, Integer food, Integer transport, Integer score, Date date);
}
