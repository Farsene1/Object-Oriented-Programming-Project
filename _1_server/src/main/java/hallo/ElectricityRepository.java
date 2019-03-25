package hallo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * interface for database.
 */
public interface ElectricityRepository extends CrudRepository<Electricity, Integer> {
    /**
     * @return all objects.
     */
    @Query(value = "SELECT * from electricity", nativeQuery = true)
    List<Electricity> findAllElectricity();

    /**
     * @param username
     * @return objects for a user.
     */
    @Query(value = "SELECT * from electricity WHERE username = ?1", nativeQuery = true)
    List<Electricity> findElectricityByUser(String username);
}

