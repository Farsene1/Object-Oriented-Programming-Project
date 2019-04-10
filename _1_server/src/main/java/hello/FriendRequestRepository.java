package hello;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import javax.transaction.Transactional;



/**
 * table for requests.
 */
public interface FriendRequestRepository extends
        CrudRepository<FriendRequest, Integer> {

    /**
     * get.
     *
     * @param username username parameter.
     * @return list.
     */
    @Query(value = "SELECT * from requests "
            + "where receiver = ?1 AND accepted = false", nativeQuery = true)
    List<FriendRequest> findAllRequestsFor(String username);

    /**
     * get.
     *
     * @param username username parameter.
     * @return list.
     */
    @Query(value = "SELECT * from requests "
            + "where sender = ?1 AND accepted = false", nativeQuery = true)
    List<FriendRequest> findAllRequestsSentBy(String username);

    /**
     * update.
     *
     * @param response  response parameter.
     * @param username1 username 1 parameter.
     * @param username2 username 2 parameter.
     */
    @Modifying
    @Transactional
    @Query(value = "UPDATE requests SET accepted = ?1"
            + " WHERE sender = ?2 AND receiver = ?3",
            nativeQuery = true)
    void respond(boolean response, String username1, String username2);
}
