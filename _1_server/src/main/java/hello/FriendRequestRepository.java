package hello;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface FriendRequestRepository extends CrudRepository<FriendRequest, Integer> {

    @Query(value = "SELECT username1 from requests where username2 = ?1 AND accepted = false", nativeQuery = true)
    List<String> findAllRequestsFor(String username);

    @Modifying
    @Transactional
    @Query(value = "UPDATE requests SET accepted = ?1 WHERE username1 = ?2 AND username2 = ?3",
            nativeQuery = true)
    void respond(boolean response, String username1, String username2);
}
