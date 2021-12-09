package odensemarcipan.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/frontpage")
    public String showIndex(){
        return "/index.html";
    }
}
