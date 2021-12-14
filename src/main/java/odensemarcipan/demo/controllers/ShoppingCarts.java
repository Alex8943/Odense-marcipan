package odensemarcipan.demo.controllers;

import odensemarcipan.demo.models.*;
import odensemarcipan.demo.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ShoppingCarts {

    @Autowired
    ShoppingCartRepository shoppingCartRepository;
    @Autowired
    ProductRepository productRepository;
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    ZipcodeRepository zipcodeRepository;


    @GetMapping("/showshoppincart")
    public String showShoppingCart(Model model){
        model.addAttribute("products",productRepository.findByIsBought());
        model.addAttribute("customer",new Customer());
        if(productRepository.findSumByIsBoughtIsFalse()!=null) {
            model.addAttribute("totalPrice", productRepository.findSumByIsBoughtIsFalse());
        }
        return "/shoplist";
    }

    @PostMapping("/showshoppincart")
    public String showShoppingCart(HttpServletRequest httpServletRequest){
        Customer customer = new Customer();
        customer.setName(httpServletRequest.getParameter("name"));
        customer.setAddress(httpServletRequest.getParameter("address"));
        customer.setZipcode(zipcodeRepository.findByZipcode(httpServletRequest.getParameter("zipcode")));
        customer.setPhoneNumber(Integer.parseInt(httpServletRequest.getParameter("phoneNumber")));
        customer.setEmail(httpServletRequest.getParameter("email"));
        customer.setId(customerRepository.findMaxId()+1);
        customerRepository.save(customer);
        shoppingCartRepository.setCustomerId(customerRepository.findMaxId());
        shoppingCartRepository.setIsBoughtToTrue();

        return"redirect:/frontpage";
    }
}
