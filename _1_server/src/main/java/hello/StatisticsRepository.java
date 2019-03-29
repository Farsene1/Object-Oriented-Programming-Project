package hello;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
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

    @Query(value = "SELECT * FROM statistics WHERE date = ?1", nativeQuery = true)
    Statistics findStatisticByDate(String date);

    @Query(value = "SELECT * FROM statistics WHERE username = ?1", nativeQuery = true)
    List<Statistics> findStatisticsByUsername(String username);

    @Modifying
    @Transactional
    @Query(value = "UPDATE statistics SET score = ?1 WHERE username = ?2", nativeQuery = true)
    void updateStatistic(Integer score, String username);

}