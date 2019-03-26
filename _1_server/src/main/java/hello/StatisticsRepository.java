package hello;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * interface for hibernate.
 */
public interface StatisticsRepository extends CrudRepository<Statistics, Integer> {

    /**
     * @return total food footprint of a single user on a specific day.
     */
    @Query(value = "SELECT SUM(footprint) FROM activities WHERE username=?1 AND date=?2 AND category=1", nativeQuery = true)
    Integer totalFoodFootprint(String username, String date);

    /**
     * @return total transport footprint of a single user on a specific day.
     */
    @Query(value = "SELECT SUM(footprint) FROM activities WHERE username=?1 AND date=?2 AND category=2", nativeQuery = true)
    Integer totalTransportFootprint(String username, String date);

    /**
     * @return total electricity footprint of a single user on a specific day.
     */
    @Query(value = "SELECT SUM(footprint) FROM activities WHERE username=?1 AND date=?2 AND category=3", nativeQuery = true)
    Integer totalElectricityFootprint(String username, String date);

    /**
     * @return total footprint of a single user on a specific day.
     */
    @Query(value = "SELECT SUM(footprint) FROM activities WHERE username=?1 AND date=?2", nativeQuery = true)
    Integer totalFootprint(String username, String date);

}