package odensemarcipan.demo.controllers;

import odensemarcipan.demo.models.Product;
import odensemarcipan.demo.repositories.ProductRepository;
import odensemarcipan.demo.repositories.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    ShoppingCartRepository shoppingCartRepository;
    @Autowired
    ProductRepository productRepository;

    @GetMapping("/frontpage")
    public String showIndex(Model model){
        model.addAttribute("product", productRepository.findByIsBought());
        if(productRepository.findSumByIsBoughtIsFalse()!=null) {
            model.addAttribute("totalPrice", productRepository.findSumByIsBoughtIsFalse());
        }
        return "/index";
    }
}
