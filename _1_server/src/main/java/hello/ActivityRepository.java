package hello;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface ActivityRepository extends CrudRepository<Activity, Integer> {
    @Query(value = "SELECT * from activity", nativeQuery = true)
    List<Activity> findAllActivities();

    @Query(value = "SELECT carbonFootprint FROM activity AS a WHERE a.userId = :userId AND category = 1", nativeQuery = true)
    List<Activity> findWaterFootprintByUser(Integer userId);

    @Query(value = "SELECT carbonFootprint FROM activity AS a WHERE a.userId = :userId AND category = 2", nativeQuery = true)
    List<Activity> findFoodFootprintByUser(Integer userId);

    @Query(value = "SELECT carbonFootprint FROM activity AS a WHERE a.userId = :userId AND category = 3", nativeQuery = true)
    List<Activity> findTransportFootprintByUser(Integer userId);
}
