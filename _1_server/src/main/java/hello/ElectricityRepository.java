package hello;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ElectricityRepository extends CrudRepository<Electricity, Integer> {
    @Query(value = "SELECT * from electricity", nativeQuery = true)
    List<Electricity> findAllElectricity();

    @Query(value = "SELECT * from electricity WHERE username = ?1", nativeQuery = true)
    List<Electricity> findElectricityByUser(String username);
}

