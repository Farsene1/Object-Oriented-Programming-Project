package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SolarPanelsController {

    @Autowired
    private SolarPanelsRepository solarPanelsRepository;

    @RequestMapping("/addpanel")
    public String addPanel(@RequestBody String username) {

    }
}
