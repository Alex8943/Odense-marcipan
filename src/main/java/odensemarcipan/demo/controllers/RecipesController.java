package odensemarcipan.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecipesController {

    @GetMapping("/recipes/overview")
    public String showReciepesOverview(){
        return "recipes-overview";
    }

    @GetMapping("/grise")
    public String showGrise(){
        return "single-recipes/recipes-grise";
    }

    @GetMapping("/hasselnoedder")
    public String showHasselNoedder(){
        return "single-recipes/recipes-hasselnoedder";
    }

    @GetMapping("/julegave")
    public String showJuleGave(){
        return "single-recipes/recipes-julegave";
    }

    @GetMapping("/julekugler")
    public String showJuleKugler(){
        return "single-recipes/recipes-julekugler";
    }

    @GetMapping("/julesmaekager")
    public String showJuleSmaeKager(){
        return "single-recipes/recipes-julesmaekager";
    }

    @GetMapping("/kokos")
    public String showKokos(){
        return "single-recipes/recipes-kokos";
    }

    @GetMapping("/kransekage")
    public String showKranseKage(){
        return "single-recipes/recipes-kransekage";
    }

    @GetMapping("/troefler")
    public String showTroefler(){
        return "single-recipes/recipes-troefler";
    }

    @GetMapping("/vanilje")
    public String showvanilje(){
        return "single-recipes/recipes-vanilje";
    }
}
