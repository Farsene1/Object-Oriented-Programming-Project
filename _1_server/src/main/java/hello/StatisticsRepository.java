package hello;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

/**
 * interface for hibernate.
 */
public interface StatisticsRepository extends CrudRepository<Statistics, Integer> {

    /**
     * @return all the activities.
     */
    @Query(value = "SELECT * from activities", nativeQuery = true)
    List<Activity> findAllActivities();

    /**
     * @param username
     * @return the activity objects for a specific user.
     */
    @Query(value = "SELECT * from activities WHERE username = ?1",
            nativeQuery = true)
    List<Activity> findActivitiesByUser(String username);

}