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
        return "/single-products/bagemarcipan-3";
    }

    @GetMapping("/singleproduct/bronze-stoev")
    public String showBronzeStoev() {
        return "/single-products/Bronze-stoev";
    }

    @GetMapping("/singleproduct/chokolade-dark200g")
    public String showChocolateDark() {
        return "/single-products/chokolade-dark200g";
    }

    @GetMapping("/singleproduct/chokolade-milk200g")
    public String showChocolateMilk() {
        return "/single-products/chokolade-milk200g";
    }

    @GetMapping("/singleproduct/guld-stoev")
    public String showGuldStoev() {
        return "/single-products/guld-stoev-5g";
    }

    @GetMapping("/singleproduct/karamel-fudge")
    public String showCaramelFudge() {
        return "/single-products/karamel-fudge";
    }

    @GetMapping("/singleproduct/marcipan200g")
    public String showMarcipan200() {
        return "/single-products/marcipan200g";
    }

}
