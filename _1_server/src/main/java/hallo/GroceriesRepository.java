package hallo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GroceriesRepository extends CrudRepository<Groceries, Integer> {
    @Query(value = "SELECT * from groceries", nativeQuery = true)
    List<Groceries> findAllGroceries();

    @Query(value = "SELECT * from groceries WHERE username = ?1", nativeQuery = true)
    List<Groceries> findGroceriesByUser(String username);
}
