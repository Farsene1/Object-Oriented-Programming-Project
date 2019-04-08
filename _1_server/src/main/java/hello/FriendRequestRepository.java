package hello;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 *  table for requests.
 */
public interface FriendRequestRepository extends
        CrudRepository<FriendRequest, Integer> {

    /**
     * get.
     * @param username
     * @return list.
     */
    @Query(value = "SELECT * from requests "
            + "where receiver = ?1 AND accepted = false", nativeQuery = true)
    List<FriendRequest> findAllRequestsFor(String username);

    /**
     * update.
     * @param response
     * @param username1
     * @param username2
     */
    @Modifying
    @Transactional
    @Query(value = "UPDATE requests SET accepted = ?1"
            + " WHERE sender = ?2 AND receiver = ?3",
            nativeQuery = true)
    void respond(boolean response, String username1, String username2);
}
