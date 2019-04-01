package hello;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface SolarPanelsRepository extends CrudRepository<SolarPanels, Integer> {

    @Query(value = "SELECT * FROM solarpanels WHERE username = ?1", nativeQuery = true)

}
