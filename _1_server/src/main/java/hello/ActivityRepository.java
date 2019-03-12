package hello;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface ActivityRepository extends CrudRepository<Activity, Integer> {
    @Query(value = "SELECT * from activity", nativeQuery = true)
    List<Activity> findAllActivities();

    @Query(value = "SELECT carbonFootprint from activity where category = 1 and user = ?1", nativeQuery = true)
    List<Activity> findFoodFootprintOfUser();

    @Query(value = "UPDATE activity SET category = ?1 and carbonFootprint = ?1 WHERE user = ?2", nativeQuery = true)
    void updateActivity(Integer category, Integer carbonFootprint, User user);
}
