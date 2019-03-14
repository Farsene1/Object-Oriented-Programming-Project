package hello;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

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
    List<User> findUserByUsername(@Param("username") String username);
    /**
     * Query to update a users attributes.
     */
    @Query(value = "UPDATE users SET water_footprint = ?2, "
            + "food_footprint= ?3, transport_footprint = ?4, "
            + "polar_score = ?5, date = ?6 WHERE username = ?1",
            nativeQuery = true)
    List<User> updateActivity(@Param("username")String username,
                              @Param("water")Integer water,
                              @Param("food")Integer food,
                              @Param("transport")Integer transport,
                              @Param("score")Integer score,
                              @Param("date")Date date);
}
