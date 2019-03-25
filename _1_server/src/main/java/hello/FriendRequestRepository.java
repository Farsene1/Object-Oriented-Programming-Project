package hello;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface FriendRequestRepository extends CrudRepository<FriendRequest, Integer> {

    @Query(value = "SELECT sender from requests where receiver = ?1 AND accepted = false", nativeQuery = true)
    List<String> findAllRequestsFor(String username);

    @Modifying
    @Transactional
    @Query(value = "UPDATE requests SET accepted = ?1 WHERE sender = ?2 AND receiver = ?3",
            nativeQuery = true)
    void respond(boolean response, String username1, String username2);
}
