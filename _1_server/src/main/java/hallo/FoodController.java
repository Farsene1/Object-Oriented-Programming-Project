package hallo;

import hello.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * rest controller for food.
 */
@RestController
@RequestMapping("/food")
public class FoodController {

    /**
     * repo.
     */
    @Autowired
    private FoodRepository foodRepository;

    /**
     * @param food
     * @return all food for a user.
     */
    @RequestMapping("/add")
    public List<Food> add(@RequestBody Food food) {
        this.foodRepository.save(food);
        return this.foodRepository.findFoodByUser(food.getUsername());
    }

    /**
     * @param user
     * @return all food for a user.
     */
    @RequestMapping("/getall")
    public List<Food> getAll(@RequestBody User user) {
        return this.foodRepository.findFoodByUser(user.getUsername());
    }
}
