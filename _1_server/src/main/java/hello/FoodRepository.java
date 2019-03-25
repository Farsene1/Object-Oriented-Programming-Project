package hello;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * interface for a database.
 */
public interface FoodRepository extends CrudRepository<Food, Integer> {
    /**
     * @return al food.
     */
    @Query(value = "SELECT * from food", nativeQuery = true)
    List<Food> findAllFood();

    /**
     * @param username
     * @return all food for a user.
     */
    @Query(value = "SELECT * from food WHERE username = ?1", nativeQuery = true)
    List<Food> findFoodByUser(String username);
}
