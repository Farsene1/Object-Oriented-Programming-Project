package hello;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface ActivityRepository extends CrudRepository<Activity, Integer> {
    // this one looks fine
    @Query(value = "SELECT * from activity", nativeQuery = true)
    List<Activity> findAllActivities();

    // 2) there is a problem here. you select by category 1(food in this case)
    //  --- and  by user(should be username) and also provide an argument to the method username
    // ---- user = ?1 takes the first argument of the method
    @Query(value = "SELECT carbonFootprint from activity where category = 1 and user = ?1", nativeQuery = true)
    List<Activity> findFoodFootprintOfUser();

    // 1)the user field in the database is not atomic, you can store username which is still unique in the users table
    @Query(value = "UPDATE activity SET category = ?1 and carbonFootprint = ?1 WHERE user = ?2", nativeQuery = true)
    void updateActivity(Integer category, Integer carbonFootprint, User user);
}
