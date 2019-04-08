package hello;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * friendship table.
 */
public interface FriendshipRepository extends CrudRepository<Friendship, Integer> {

    /**
     * get.
     * @param username
     * @return friends list.
     */
    @Query(value = "SELECT username2 FROM friendships WHERE username1 = ?1", nativeQuery = true)
    List<String> getAllFriends(String username);
}
