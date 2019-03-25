package hallo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TransportRepository extends CrudRepository<Transport, Integer> {
    @Query(value = "SELECT * from transport", nativeQuery = true)
    List<Transport> findAllTransport();

    @Query(value = "SELECT * from transport WHERE username = ?1", nativeQuery = true)
    List<Transport> findTransportByUser(String username);
}
