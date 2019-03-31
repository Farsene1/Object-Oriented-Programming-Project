package hello;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
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
     *
     * @param username
     * @return list.
     */
    @Query(value = "SELECT * from users where username = ?1",
            nativeQuery = true)
    List<User> findUserByUsername(@Param("username") String username);

    // TO BE TESTED - 3 for simplicity; it is going to be 10 in the future!;

    /**
     * leaderboard.
     *
     * @return top list.
     */
    @Query(value = "SELECT * from users order by polar_score desc limit 3",
            nativeQuery = true)
    List<User> getTopTen();

    /**
     * Query to update a users attributes.
     * @param electricity
     * @param food
     * @param polarScore
     * @param transport
     * @param username
     */
    @Modifying
    @Transactional
    @Query(value = "UPDATE users SET food = ?1, transport = ?2"
            + ", electricity = ?3, polar_score = ?4 "
            + "WHERE username = ?5", nativeQuery = true)
    void updateActivity(Integer food, Integer transport, Integer electricity,
                        Integer polarScore, String username);

    /**
     * SET BADGE.
     *
     * @param badge
     * @param username
     */
    @Modifying
    @Transactional
    @Query(value = "UPDATE users SET badge = ?1 WHERE username = ?2",
            nativeQuery = true)
    void updateBadge(Integer badge, String username);

}
