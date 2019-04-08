package hello;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * interface for hibernate.
 */
public interface StatisticsRepository
        extends CrudRepository<Statistics, Integer> {
    /**
     * Query to findAllStatistics.
     * @return list.
     */
    @Query(value = "SELECT * from statistics", nativeQuery = true)
    List<Statistics> findAllStatistics();

    /**
     * get by date.
     * @param date
     * @return Statistics obj.
     */
    @Query(value = "SELECT * FROM statistics WHERE date = ?1 and type = ?2",
            nativeQuery = true)
    Statistics findStatisticByDateAndType(String date, String type);

    /**
     * get by name.
     * @param username
     * @return list.
     */
    @Query(value = "SELECT * FROM statistics WHERE username = ?1",
            nativeQuery = true)
    List<Statistics> findStatisticsByUsername(String username);

    /**
     *
     * @param username
     * @param type
     * @return list.
     */
    @Query(value = "SELECT * FROM statistics WHERE username = ?1 AND type = ?2",
            nativeQuery = true)
    List<Statistics> findStatisticsByUsernameAndType(String username, String type);

    /**
     * update.
     * @param score
     * @param username
     */
    @Modifying
    @Transactional
    @Query(value = "UPDATE statistics SET score = ?1 WHERE username = ?2 and type = ?3 and date = ?4",
            nativeQuery = true)
    void updateStatistic(Integer score, String username, String type, String date);

}
