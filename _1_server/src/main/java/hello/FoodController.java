package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodRepository foodRepository;

    @RequestMapping("/add")
    public List<Food> add(@RequestBody Food food){
        this.foodRepository.save(food);
        return this.foodRepository.findFoodByUser(food.getUsername());
    }

    @RequestMapping("/getall")
    public List<Food> getAll(@RequestBody User user){
        return this.foodRepository.findFoodByUser(user.getUsername());
    }
}
