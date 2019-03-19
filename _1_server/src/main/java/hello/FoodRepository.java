package hello;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FoodRepository extends CrudRepository<Food, Integer> {
    @Query(value = "SELECT * from food", nativeQuery = true)
    List<Food> findAllFood();

    @Query(value = "SELECT * from food WHERE username = ?1", nativeQuery = true)
    List<Food> findFoodByUser(String username);
}
