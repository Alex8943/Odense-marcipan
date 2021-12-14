package odensemarcipan.demo.controllers;

import odensemarcipan.demo.models.ShoppingCart;
import odensemarcipan.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class RecipesController {

    @Autowired
    ProductRepository productRepository;


    @GetMapping("/recipes/overview")
    public String showReciepesOverview(){
        return "recipes-overview";
    }

    @GetMapping("/grise")
    public String showGrise(Model model){
        model.addAttribute("products", productRepository.findByIsBought());
        if(productRepository.findSumByIsBoughtIsFalse()!=null) {
            model.addAttribute("totalPrice", productRepository.findSumByIsBoughtIsFalse());
        }
        return "/single-recipes/recipes-grise";
    }

    @GetMapping("/hasselnoedder")
    public String showHasselNoedder(Model model){
        model.addAttribute("products", productRepository.findByIsBought());
        if(productRepository.findSumByIsBoughtIsFalse()!=null) {
            model.addAttribute("totalPrice", productRepository.findSumByIsBoughtIsFalse());
        }
        return "/single-recipes/recipes-hasselnoedder";
    }

    @GetMapping("/julegave")
    public String showJuleGave(Model model){
        model.addAttribute("product", productRepository.findByIsBought());
        if(productRepository.findSumByIsBoughtIsFalse()!=null) {
            model.addAttribute("totalPrice", productRepository.findSumByIsBoughtIsFalse());
        }
        return "/single-recipes/recipes-julegave";
    }

    @GetMapping("/julekugler")
    public String showJuleKugler(Model model){
        model.addAttribute("products", productRepository.findByIsBought());
        if(productRepository.findSumByIsBoughtIsFalse()!=null) {
            model.addAttribute("totalPrice", productRepository.findSumByIsBoughtIsFalse());
        }
        return "/single-recipes/recipes-julekugler";
    }

    @GetMapping("/julesmaekager")
    public String showJuleSmaeKager(Model model){
        model.addAttribute("products", productRepository.findByIsBought());
        if(productRepository.findSumByIsBoughtIsFalse()!=null) {
            model.addAttribute("totalPrice", productRepository.findSumByIsBoughtIsFalse());
        }
        return "/single-recipes/recipes-julesmaekager";
    }

    @GetMapping("/kokos")
    public String showKokos(Model model){
        model.addAttribute("products", productRepository.findByIsBought());
        if(productRepository.findSumByIsBoughtIsFalse()!=null) {
            model.addAttribute("totalPrice", productRepository.findSumByIsBoughtIsFalse());
        }
        return "/single-recipes/recipes-kokos";
    }

    @GetMapping("/kransekage")
    public String showKranseKage(Model model){
        model.addAttribute("products", productRepository.findByIsBought());
        if(productRepository.findSumByIsBoughtIsFalse()!=null) {
            model.addAttribute("totalPrice", productRepository.findSumByIsBoughtIsFalse());
        }
        return "/single-recipes/recipes-kransekage";
    }

    @GetMapping("/troefler")
    public String showTroefler(Model model){
        model.addAttribute("products", productRepository.findByIsBought());
        if(productRepository.findSumByIsBoughtIsFalse()!=null) {
            model.addAttribute("totalPrice", productRepository.findSumByIsBoughtIsFalse());
        }
        return "/single-recipes/recipes-troefler";
    }

    @GetMapping("/vanilje")
    public String showvanilje(Model model){
        model.addAttribute("products", productRepository.findByIsBought());
        if(productRepository.findSumByIsBoughtIsFalse()!=null) {
            model.addAttribute("totalPrice", productRepository.findSumByIsBoughtIsFalse());
        }
        return "/single-recipes/recipes-vanilje";
    }
}
