package hello;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * interface for hibernate.
 */
public interface StatisticsRepository extends CrudRepository<Statistics, Integer> { }