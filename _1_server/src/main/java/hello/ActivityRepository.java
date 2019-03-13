package hello;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface ActivityRepository extends CrudRepository<Activity, Integer> {
//    @Query(value = "SELECT * from activity", nativeQuery = true)
//    List<Activity> findAllActivities();
//
//    @Query(value = "SELECT carbonFootprint FROM activity AS a WHERE a.userID = '" + userID + "'", nativeQuery = true)
//    List<Activity> findWaterFootprintByUser(Integer userID);
//
//    @Query(value = "SELECT carbonFootprint FROM activity AS a WHERE a.user.userID = userID", nativeQuery = true)
//    List<Activity> findFoodFootprintByUser(Integer userID);
//
//    @Query(value = "SELECT carbonFootprint FROM activity AS a WHERE a.user.userID = u", nativeQuery = true)
//    List<Activity> findTransportFootprintByUser(Integer userID);
//
//    @Query(value = "UPDATE activity SET category = ?1 and carbonFootprint = ?1 WHERE userID = ?2", nativeQuery = true)
//    void updateActivity(User user);
}
