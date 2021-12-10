package odensemarcipan.demo.repositories;

import odensemarcipan.demo.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {
/*
    @Query(value = "SELECT products.name, products.price FROM products INNER JOIN shopping_cart ON products.id = shopping_cart.product_id WHERE shopping_cart.is_bought = false", nativeQuery = true)
    List<Product> finde;

 */
}
