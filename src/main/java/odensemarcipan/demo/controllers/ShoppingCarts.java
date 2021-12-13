package odensemarcipan.demo.controllers;

import odensemarcipan.demo.models.Customer;
import odensemarcipan.demo.models.Product;
import odensemarcipan.demo.models.ShoppingCart;
import odensemarcipan.demo.models.Zipcode;
import odensemarcipan.demo.repositories.CustomerRepository;
import odensemarcipan.demo.repositories.ProductRepository;
import odensemarcipan.demo.repositories.ShoppingCartRepository;
import odensemarcipan.demo.repositories.ZipcodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

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
        model.addAttribute("product",productRepository.findByIsBought());
        model.addAttribute("customer",new Customer());
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
        customer.setId(0);
        shoppingCartRepository.setIsBoughtFalse();
        customerRepository.save(customer);
        return"redirect:/frontpage";
    }
}
