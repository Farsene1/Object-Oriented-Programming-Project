package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * this is the restcontroller class that controls the received activities.
 */
@RestController
public class ActivityController {

    /**
     * autowiring the repository.
     */
    @Autowired
    ActivityRepository activityRepository;

    /**
     *
     * @param activity
     * @return response to the client
     */
    @RequestMapping("/activity/send/meal")
    public String getMeal(@RequestBody Activity activity){

    }

    /**
     *
     * @param activity
     * @return response to the client
     */
    @RequestMapping("/activity/send/water")
    public String getWater(@RequestBody Activity activity){

    }

    /**
     *
     * @param activity
     * @return response to the client
     */
    @RequestMapping("/activity/send/transport")
    public String getTransport(@RequestBody Activity activity){

    }
}