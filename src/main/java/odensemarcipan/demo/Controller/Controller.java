package odensemarcipan.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    private String index(){
        return "index";
    }
}
