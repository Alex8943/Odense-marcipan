package odensemarcipan.demo.controllers;

import odensemarcipan.demo.models.ShoppingCart;
import odensemarcipan.demo.repositories.ProductRepository;
import odensemarcipan.demo.repositories.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Products {

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
    public String singleProduct(@PathVariable int id){
        return "/single-products/singleProduct-"+id;
    }


    @PostMapping("/products")
    public void addToShoppingCart(@ModelAttribute ShoppingCart shoppingCart){
        shoppingCartRepository.save(shoppingCart);
    }


}
