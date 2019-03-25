package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/groceries")
public class GroceriesController {

    @Autowired
    private GroceriesRepository groceriesRepository;

    @RequestMapping("/add")
    public List<Groceries> add(@RequestBody Groceries groceries) {
        this.groceriesRepository.save(groceries);
        return this.groceriesRepository.findGroceriesByUser(groceries.getUsername());
    }

    @RequestMapping("/getall")
    public List<Groceries> getAll(@RequestBody User user) {
        return this.groceriesRepository.findGroceriesByUser(user.getUsername());
    }
}
