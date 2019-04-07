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
     *
     * @return list.
     */
    @Query(value = "SELECT * from statistics", nativeQuery = true)
    List<Statistics> findAllStatistics();

    /**
     * get by date.
     *
     * @param date date parameter.
     * @param type type parameter.
     * @return Statistics obj.
     */
    @Query(value = "SELECT * FROM statistics WHERE date = ?1 and type = ?2",
            nativeQuery = true)
    Statistics findStatisticByDateAndType(String date, String type);

    /**
     * get by name.
     *
     * @param username get by username.
     * @return list.
     */
    @Query(value = "SELECT * FROM statistics WHERE username = ?1",
            nativeQuery = true)
    List<Statistics> findStatisticsByUsername(String username);

    /**
     * find statistics by username and type.
     *
     * @param username username parameter
     * @param type     type parameter.
     * @return list.
     */
    @Query(value = "SELECT * FROM statistics "
            + "WHERE username = ?1 AND type = ?2", nativeQuery = true)
    List<Statistics> findStatisticsByUsernameAndType(String username,
                                                     String type);

    /**
     * updates the statistic.
     *
     * @param score    to be set.
     * @param username condition.
     * @param type     condition.
     * @param date     condition.
     */
    @Modifying
    @Transactional
    @Query(value = "UPDATE statistics SET score = ?1 "
            + "WHERE username = ?2 and type = ?3 and date = ?4",
            nativeQuery = true)
    void updateStatistic(Integer score, String username,
                         String type, String date);

}
