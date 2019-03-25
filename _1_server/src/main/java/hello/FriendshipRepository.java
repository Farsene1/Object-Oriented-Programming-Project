package hello;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FriendshipRepository extends CrudRepository<Friendship, Integer> {

    @Query(value = "SELECT receiver FROM friendships WHERE sender = ?1", nativeQuery = true)
    List<String> getAllFriends(String username);
}
