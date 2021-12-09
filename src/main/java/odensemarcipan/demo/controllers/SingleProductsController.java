package odensemarcipan.demo.controllers;

import odensemarcipan.demo.models.Product;
import odensemarcipan.demo.models.ShoppingCart;
import odensemarcipan.demo.repositories.ProductRepository;
import odensemarcipan.demo.repositories.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class SingleProductsController {

    @Autowired
    ProductRepository productRepository;
    @Autowired
    ShoppingCartRepository shoppingCartRepository;

    @GetMapping("/singleproduct/bagemarcipan")
    public String showBageMarcipan(Model model) {
        model.addAttribute("product", new ShoppingCart());
        return "/single-products/singleProduct-16";
    }

    @PostMapping("/singleproduct/bagemarcipan")
    public String addBageMarcipanToCart(HttpServletRequest request) {
        Product product=productRepository.getById(16);
        ShoppingCart shoppingCart = new ShoppingCart();
        if(request.getParameter("amount")!=null){
            shoppingCart.setAmount(Integer.parseInt(request.getParameter("amount")));
        }
        shoppingCart.setProduct(product);
        shoppingCartRepository.save(shoppingCart);
        return "redirect:/singleproduct/bagemarcipan";
    }

    @GetMapping("/singleproduct/bronze-stoev")
    public String showBronzeStoev(Model model) {
        model.addAttribute("product", new ShoppingCart());
        return "/single-products/singleProduct-8";
    }

    @PostMapping("/singleproduct/bronze-stoev")
    public String addBronzeToCart(HttpServletRequest request) {
        Product product=productRepository.getById(8);
        ShoppingCart shoppingCart = new ShoppingCart();
        if(request.getParameter("amount")!=null){
            shoppingCart.setAmount(Integer.parseInt(request.getParameter("amount")));
        }
        shoppingCart.setProduct(product);
        shoppingCartRepository.save(shoppingCart);
        return "redirect:/singleproduct/bronze-stoev";
    }

    @GetMapping("/singleproduct/chokolade-dark200g")
    public String showChocolateDark(Model model) {
        model.addAttribute("product", new ShoppingCart());
        return "/single-products/singleProduct-7";
    }

    @PostMapping("/singleproduct/chokolade-dark200g")
    public String addDarkToCart(HttpServletRequest request) {
        Product product=productRepository.getById(7);
        ShoppingCart shoppingCart = new ShoppingCart();
        if(request.getParameter("amount")!=null){
            shoppingCart.setAmount(Integer.parseInt(request.getParameter("amount")));
        }
        shoppingCart.setProduct(product);
        shoppingCartRepository.save(shoppingCart);
        return "redirect:/singleproduct/chokolade-dark200g";
    }

    @GetMapping("/singleproduct/chokolade-milk200g")
    public String showChocolateMilk(Model model) {
        model.addAttribute("product", new ShoppingCart());
        return "/single-products/singleProduct-6";
    }

    @PostMapping("/singleproduct/chokolade-milk200g")
    public String addToCart(HttpServletRequest request){
        Product product=productRepository.getById(6);
        ShoppingCart shoppingCart = new ShoppingCart();
        if(request.getParameter("amount")!=null){
            shoppingCart.setAmount(Integer.parseInt(request.getParameter("amount")));
        }
        shoppingCart.setProduct(product);
        shoppingCartRepository.save(shoppingCart);
        return "redirect:/singleproduct/chokolade-milk200g";
    }

    @GetMapping("/singleproduct/guld-stoev")
    public String showGuldStoev(Model model) {
        model.addAttribute("product", new ShoppingCart());
        return "/single-products/singleProduct-10";
    }

    @PostMapping("/singleproduct/guld-stoev")
    public String addGuldToCart(HttpServletRequest request) {
        Product product=productRepository.getById(10);
        ShoppingCart shoppingCart = new ShoppingCart();
        if(request.getParameter("amount")!=null){
            shoppingCart.setAmount(Integer.parseInt(request.getParameter("amount")));
        }
        shoppingCart.setProduct(product);
        shoppingCartRepository.save(shoppingCart);
        return "redirect:/singleproduct/guld-stoev";
    }

    @GetMapping("/singleproduct/karamel-fudge")
    public String showCaramelFudge(Model model) {
        model.addAttribute("product", new ShoppingCart());
        return "/single-products/singleProduct-12";
    }

    @PostMapping("/singleproduct/karamel-fudge")
    public String addCaramelFudge(HttpServletRequest request) {
        Product product=productRepository.getById(12);
        ShoppingCart shoppingCart = new ShoppingCart();
        if(request.getParameter("amount")!=null){
            shoppingCart.setAmount(Integer.parseInt(request.getParameter("amount")));
        }
        shoppingCart.setProduct(product);
        shoppingCartRepository.save(shoppingCart);
        return "redirect:/singleproduct/karamel-fudge";
    }

    @GetMapping("/singleproduct/marcipan200g")
    public String showMarcipan200(Model model) {
        model.addAttribute("product", new ShoppingCart());
        return "/single-products/singleProduct-2";
    }

    @PostMapping("/singleproduct/marcipan200g")
    public String addMarcipan200(HttpServletRequest request) {
        Product product=productRepository.getById(2);
        ShoppingCart shoppingCart = new ShoppingCart();
        if(request.getParameter("amount")!=null){
            shoppingCart.setAmount(Integer.parseInt(request.getParameter("amount")));
        }
        shoppingCart.setProduct(product);
        shoppingCartRepository.save(shoppingCart);
        return "redirect:/singleproduct/marcipan200g";
    }

    @GetMapping("/singleproduct/marcipan400g")
    public String showMarcipan400g(Model model) {
        model.addAttribute("product", new ShoppingCart());
        return "/single-products/singleProduct-1";
    }

    @PostMapping("/singleproduct/marcipan400g")
    public String addMarcipan400g(HttpServletRequest request){
        Product product=productRepository.getById(1);
        ShoppingCart shoppingCart = new ShoppingCart();
        if(request.getParameter("amount")!=null){
            shoppingCart.setAmount(Integer.parseInt(request.getParameter("amount")));
        }
        shoppingCart.setProduct(product);
        shoppingCartRepository.save(shoppingCart);
        return "redirect:/singleproduct/marcipan400g";
    }

    @GetMapping("/singleproduct/marcipan-saltkaramel")
    public String showMarcipanSaltCaramel(Model model) {
        model.addAttribute("product", new ShoppingCart());
        return "/single-products/singleProduct-3";
    }

    @PostMapping("/singleproduct/marcipan-saltkaramel")
    public String addMarcipanSaltCaramel(HttpServletRequest request){
        Product product=productRepository.getById(3);
        ShoppingCart shoppingCart = new ShoppingCart();
        if(request.getParameter("amount")!=null){
            shoppingCart.setAmount(Integer.parseInt(request.getParameter("amount")));
        }
        shoppingCart.setProduct(product);
        shoppingCartRepository.save(shoppingCart);
        return "redirect:/singleproduct/marcipan-saltkaramel";
    }

    @GetMapping("/singleproduct/marcipan-lakrids")
    public String showMarcipanLaqrids(Model model){
        model.addAttribute("product", new ShoppingCart());
        return "/single-products/singleProduct-4";
    }

    @PostMapping("/singleproduct/marcipan-lakrids")
    public String addMarcipanLaqrids(HttpServletRequest request){
        Product product=productRepository.getById(4);
        ShoppingCart shoppingCart = new ShoppingCart();
        if(request.getParameter("amount")!=null){
            shoppingCart.setAmount(Integer.parseInt(request.getParameter("amount")));
        }
        shoppingCart.setProduct(product);
        shoppingCartRepository.save(shoppingCart);
        return "redirect:/singleproduct/marcipan-lakrids";
    }

    @GetMapping("/singleproduct/marcipan-kokos")
    public String showMarcipanCoconut(Model model){
        model.addAttribute("product", new ShoppingCart());
        return "/single-products/singleProduct-5";
    }

    @PostMapping("/singleproduct/marcipan-kokos")
    public String addMarcipanCoconut(HttpServletRequest request){
        Product product=productRepository.getById(5);
        ShoppingCart shoppingCart = new ShoppingCart();
        if(request.getParameter("amount")!=null){
            shoppingCart.setAmount(Integer.parseInt(request.getParameter("amount")));
        }
        shoppingCart.setProduct(product);
        shoppingCartRepository.save(shoppingCart);
        return "redirect:/singleproduct/marcipan-kokos";
    }

    @GetMapping("/singleproduct/rosa-stoev")
    public String showRosaStoev(Model model){
        model.addAttribute("product", new ShoppingCart());
        return "/single-products/singleProduct-9";
    }

    @PostMapping("/singleproduct/rosa-stoev")
    public String addRosaStoev(HttpServletRequest request){
        Product product=productRepository.getById(9);
        ShoppingCart shoppingCart = new ShoppingCart();
        if(request.getParameter("amount")!=null){
            shoppingCart.setAmount(Integer.parseInt(request.getParameter("amount")));
        }
        shoppingCart.setProduct(product);
        shoppingCartRepository.save(shoppingCart);
        return "redirect:/singleproduct/rosa-stoev";
    }

    @GetMapping("/singleproduct/nougat")
    public String showNougat(Model model){
        model.addAttribute("product", new ShoppingCart());
        return "/single-products/singleProduct-11";
    }

    @PostMapping("/singleproduct/nougat")
    public String addNougat(HttpServletRequest request){
        Product product=productRepository.getById(11);
        ShoppingCart shoppingCart = new ShoppingCart();
        if(request.getParameter("amount")!=null){
            shoppingCart.setAmount(Integer.parseInt(request.getParameter("amount")));
        }
        shoppingCart.setProduct(product);
        shoppingCartRepository.save(shoppingCart);
        return "redirect:/singleproduct/nougat";
    }

    @GetMapping("/singleproduct/chokolade-spaner")
    public String showChocolateSpaner(Model model){
        model.addAttribute("product", new ShoppingCart());
        return "/single-products/singleProduct-13";
    }

    @PostMapping("/singleproduct/chokolade-spaner")
    public String addChocolateSpaner(HttpServletRequest request){
        Product product=productRepository.getById(13);
        ShoppingCart shoppingCart = new ShoppingCart();
        if(request.getParameter("amount")!=null){
            shoppingCart.setAmount(Integer.parseInt(request.getParameter("amount")));
        }
        shoppingCart.setProduct(product);
        shoppingCartRepository.save(shoppingCart);
        return "redirect:/singleproduct/chokolade-spaner";
    }

    @GetMapping("/singleproduct/lakrids-knas")
    public String showLakridsKnas(Model model){
        model.addAttribute("product", new ShoppingCart());
        return "/single-products/singleProduct-14";
    }

    @PostMapping("/singleproduct/lakrids-knas")
    public String addLakridsKnas(HttpServletRequest request){
        Product product=productRepository.getById(14);
        ShoppingCart shoppingCart = new ShoppingCart();
        if(request.getParameter("amount")!=null){
            shoppingCart.setAmount(Integer.parseInt(request.getParameter("amount")));
        }
        shoppingCart.setProduct(product);
        shoppingCartRepository.save(shoppingCart);

        /*switch (request.getParameter("redirect")){
            case "pig":
                return "redirect:/single-recipes/recipes-grise";
            case "nut":
                return "redirect:/single-recipes/recipes-hasselnoedder";
        }*/
        return "redirect:/singleproduct/lakrids-knas";
    }

    @GetMapping("/singleproduct/ruby-knapper")
    public String showRubyKnaps(Model model){
        model.addAttribute("product", new ShoppingCart());
        return "/single-products/singleProduct-15";
    }

    @PostMapping("/singleproduct/ruby-knapper")
    public String addRubyKnaps(HttpServletRequest request){
        Product product=productRepository.getById(15);
        ShoppingCart shoppingCart = new ShoppingCart();
        if(request.getParameter("amount")!=null){
            shoppingCart.setAmount(Integer.parseInt(request.getParameter("amount")));
        }
        shoppingCart.setProduct(product);
        shoppingCartRepository.save(shoppingCart);
        return "redirect:/singleproduct/ruby-knapper";
    }

    @GetMapping("/singleproduct/figur-marcipan")
    public String showFigurMarcipan(Model model){
        model.addAttribute("product", new ShoppingCart());
        return "/single-products/singleProduct-17";
    }
    @PostMapping("/singleproduct/figur-marcipan")
    public String addFigurMarcipan(HttpServletRequest request){
        Product product=productRepository.getById(17);
        ShoppingCart shoppingCart = new ShoppingCart();
        if(request.getParameter("amount")!=null){
            shoppingCart.setAmount(Integer.parseInt(request.getParameter("amount")));
        }
        shoppingCart.setProduct(product);
        shoppingCartRepository.save(shoppingCart);
        return "redirect:/singleproduct/figur-marcipan";
    }
}
