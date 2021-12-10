package odensemarcipan.demo.controllers;

import odensemarcipan.demo.models.ShoppingCart;
import odensemarcipan.demo.repositories.ProductRepository;
import odensemarcipan.demo.repositories.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ShoppingCarts {

    @Autowired
    ShoppingCartRepository shoppingCartRepository;
    @Autowired
    ProductRepository productRepository;

    @PostMapping("/single-products/add-to-cart/{id}")
    public String addToShoppingCart(@RequestParam int id, @ModelAttribute ShoppingCart shoppingCart){

        ShoppingCart shoppingcart = new ShoppingCart();
        shoppingcart.setProduct(productRepository.getById(id));
        shoppingCartRepository.save(shoppingCart);

        return "redirect:/products/singleProducts-"+id;
    }

    @GetMapping("/showshoppincart")
    public String showShoppingCart(){
        return "/shoplist";
    }
}
