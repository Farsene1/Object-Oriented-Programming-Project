package hello;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * interface for hibernate.
 */
public interface StatisticsRepository extends CrudRepository<Statistics, Integer> {
    /**
     * Query to findAllStatistics.
     */
    @Query(value = "SELECT * from statistics", nativeQuery = true)
    List<Statistics> findAllStatistics();
}