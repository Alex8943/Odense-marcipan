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

    @GetMapping("/products/{id}")
    public String producthtml(@PathVariable int id){
        return "singleProduct-"+id;
    }

    @PostMapping("/products")
    public void addToShoppingCart(@ModelAttribute ShoppingCart shoppingCart){
        shoppingCartRepository.save(shoppingCart);
    }


}
