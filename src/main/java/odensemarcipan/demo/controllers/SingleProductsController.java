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
        return "/single-products/singleProduct-16";
    }

    @GetMapping("/singleproduct/bronze-stoev")
    public String showBronzeStoev() {
        return "/single-products/singleProduct-8";
    }

    @GetMapping("/singleproduct/chokolade-dark200g")
    public String showChocolateDark() {
        return "/single-products/singleProduct-7";
    }

    @GetMapping("/singleproduct/chokolade-milk200g")
    public String showChocolateMilk() {
        return "/single-products/singleProduct-6";
    }

    @GetMapping("/singleproduct/guld-stoev")
    public String showGuldStoev() {
        return "/single-products/singleProduct-10";
    }

    @GetMapping("/singleproduct/karamel-fudge")
    public String showCaramelFudge() {
        return "/single-products/singleProduct-12";
    }

    @GetMapping("/singleproduct/marcipan200g")
    public String showMarcipan200() {
        return "/single-products/singleProduct-2";
    }

    @GetMapping("/singleproduct/marcipan400g")
    public String showMarcipan400g(){
        return "/single-products/singleProduct-1";
    }

    @GetMapping("/singleproduct/marcipan-saltkaramel")
    public String showMarcipanSaltCaramel(){
        return "/single-products/singleProduct-3";
    }

    @GetMapping("/singleproduct/marcipan-lakrids")
    public String showMarcipanLaqrids(){
        return "/single-products/singleProduct-4";
    }

    @GetMapping("/singleproduct/marcipan-kokos")
    public String showMarcipanCoconut(){
        return "/single-products/singleProduct-5";
    }

    @GetMapping("/singleproduct/rosa-stoev")
    public String showRosaStoev(){
        return "/single-products/singleProduct-9";
    }

    @GetMapping("/singleproduct/nougat")
    public String showNougat(){
        return "/single-products/singleProduct-11";
    }

    @GetMapping("/singleproduct/chokolade-spaner")
    public String showChocolateSpaner(){
        return "/single-products/singleProduct-13";
    }

    @GetMapping("/singleproduct/lakrids-knas")
    public String showLaqridsKnas(){
        return "/single-products/singleProduct-14";
    }

    @GetMapping("/singleproduct/ruby-knapper")
    public String showRubyKnaps(){
        return "/single-products/singleProduct-15";
    }
}
