package hello;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * interface for hibernate.
 */
public interface ActivityRepository extends CrudRepository<Activity, Integer> {

    /**
     * returns all the activities.
     *
     * @return all the activities.
     */
    @Query(value = "SELECT * from activities", nativeQuery = true)
    List<Activity> findAllActivities();

    /**
     * the activies.
     *
     * @param username username parameter.
     * @return the activity objects for a specific user.
     */
    @Query(value = "SELECT * from activities WHERE username = ?1",
            nativeQuery = true)
    List<Activity> findActivitiesByUser(String username);

    /**
     * the total.
     *
     * @param username username parameter.
     * @param date     date parameter.
     * @return the toatal foorprint for one day.
     */
    @Query(value = "SELECT SUM(footprint) FROM activities"
            + " WHERE username=?1 AND date=?2", nativeQuery = true)
    Integer totalFootprint(String username, String date);

    /**
     * summing for every category score.
     *
     * @param username username parameter.
     * @param date     date parameter.
     * @param category category parameter.
     * @return sum by category for user.
     */
    @Query(value = "SELECT SUM(footprint) FROM activities"
            + " WHERE username=?1 AND date=?2 AND category = ?3",
            nativeQuery = true)
    Integer totalScoreByCategory(String username,
                                 String date, Integer category);

    //    /**
    //     * @return total food footprint of a single user on a specific day.
    //     */
    //    @Query(value = "SELECT SUM(footprint) FROM activities
    //    WHERE username=?1 AND date=?2 AND category=1", nativeQuery = true)
    //    Integer totalFoodFootprint(String username, String date);
    //
    //    /**
    //     * @return total transport footprint of a single user on a specific day.
    //     */
    //    @Query(value = "SELECT SUM(footprint) FROM activities WHERE username=?1
    //    AND date=?2 AND category=2", nativeQuery = true)
    //    Integer totalTransportFootprint(String username, String date);
    //
    //    /**
    //     * @return total electricity footprint of a single user on a specific day.
    //     */
    //    @Query(value = "SELECT SUM(footprint) FROM activities WHERE username=?1
    //    AND date=?2 AND category=3", nativeQuery = true)
    //    Integer totalElectricityFootprint(String username, String date);

}

