package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transport")
public class TransportController {

    @Autowired
    private TransportRepository transportRepository;

    /**
     * default method.
     * @return default method.
     */
    @RequestMapping("/default")
    public String add(){
        System.out.println("transport added");
        return "transport added";
    }

    /**
     * add transport to the database.
     * @param transport
     * @return list.
     */
    @RequestMapping("/add")
    public List<Transport> addTransport(@RequestBody Transport transport){
        this.transportRepository.save(transport);
        return this.transportRepository.findTransportByUser(transport.getUsername());
    }

    /**
     *
     * @param user
     * @return list.
     */
    @RequestMapping("/all")
    public List<Transport> getAll(@RequestBody User user){
        return this.transportRepository.findAllTransport();
    }

}
