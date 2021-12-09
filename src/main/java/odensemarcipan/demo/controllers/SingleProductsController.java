package odensemarcipan.demo.controllers;

import odensemarcipan.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SingleProductsController {

    @Autowired
    ProductRepository productRepository;


    @GetMapping("/singleproduct/bagemarcipan")
    public String showBageMarcipan() {
        return "singleProduct-16";
    }

    @GetMapping("/singleproduct/bronze-stoev")
    public String showBronzeStoev() {
        return "singleProduct-8";
    }

    @GetMapping("/singleproduct/chokolade-dark200g")
    public String showChocolateDark() {
        return "singleProduct-7";
    }

    @GetMapping("/singleproduct/chokolade-milk200g")
    public String showChocolateMilk() {
        return "singleProduct-6";
    }

    @GetMapping("/singleproduct/guld-stoev")
    public String showGuldStoev() {
        return "singleProduct-10";
    }

    @GetMapping("/singleproduct/karamel-fudge")
    public String showCaramelFudge() {
        return "singleProduct-12";
    }

    @GetMapping("/singleproduct/marcipan200g")
    public String showMarcipan200() {
        return "singleProduct-2";
    }

}
