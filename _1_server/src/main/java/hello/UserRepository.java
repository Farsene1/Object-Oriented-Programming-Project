package hello;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

import javax.transaction.Transactional;



/**
 * User repository extending to crud repository.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
    /**
     * query to find all users.
     *
     * @return list
     */
    @Query(value = "SELECT * from users", nativeQuery = true)
    List<User> findAllUsers();

    /**
     * Query to find a specific user by username.
     *
     * @param username username parameter.
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
    @Query(value = "SELECT * from users order by polar_score desc limit 10",
            nativeQuery = true)
    List<User> getTopTen();

    /**
     * Query to update a users attributes.
     *
     * @param electricity electricity.
     * @param food        food param.
     * @param polarScore  score
     * @param transport   transport
     * @param username    and the username.
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
     * @param badge    badge parameter.
     * @param username username parameter.
     */
    @Modifying
    @Transactional
    @Query(value = "UPDATE users SET badge = ?1 WHERE username = ?2",
            nativeQuery = true)
    void updateBadge(Integer badge, String username);

    /**
     * sets the solar_panel attribute.
     *
     * @param username username.
     * @param solar    boolean.
     */
    @Modifying
    @Transactional
    @Query(value = "UPDATE users SET solar_panels = ?2 WHERE username = ?1",
            nativeQuery = true)
    void addSolarPanels(String username, boolean solar);

    /**
     * finds usernames with regex.
     *
     * @param regex for finding usernames.
     * @return list of usernames.
     */
    @Query(value = "SELECT username from users where username"
            + " LIKE CONCAT(:regex,'%')", nativeQuery = true)
    List<String> findByRegex(@Param("regex") String regex);
}
