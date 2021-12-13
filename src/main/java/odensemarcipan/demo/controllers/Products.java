package odensemarcipan.demo.controllers;

import jdk.internal.access.JavaNetHttpCookieAccess;
import odensemarcipan.demo.models.Product;
import odensemarcipan.demo.models.ShoppingCart;
import odensemarcipan.demo.repositories.ProductRepository;
import odensemarcipan.demo.repositories.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class Products{


    @Autowired
    ShoppingCartRepository shoppingCartRepository;
    @Autowired
    ProductRepository productRepository;



   @GetMapping("/products/chocolate")
   public String chocolateOverview(){
       return "/product-overview/chocolat-products";
   }

       @GetMapping("/products/decoration")
   public String decorationOverview(){
       return "/product-overview/decoration-products";
   }

   @GetMapping("/products/marcipan")
   public String marcipanOverview(){
       return "/product-overview/marcipan-products";
   }

   @GetMapping("/products/nougat")
   public String nougatOverview(){
       return "/product-overview/nougat-products";
   }

    @GetMapping("/products/{id}")
    public String singleProduct(@RequestParam int id,Model model){
        model.addAttribute("products",productRepository.findAll());

        return "/single-products/singleProduct-"+id;
    }

    @PostMapping("/single-products/add-to-cart/")
    public String addToShoppingCart(@RequestParam int id, @ModelAttribute ShoppingCart shoppingCart){
        System.out.println("yeet");
        ShoppingCart shoppingcart = new ShoppingCart();
        shoppingcart.setProduct(productRepository.getById(id));
        shoppingCartRepository.save(shoppingCart);

        return "redirect:/products/singleProducts-"+id;
    }







}
