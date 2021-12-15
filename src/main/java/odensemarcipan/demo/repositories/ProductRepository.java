package odensemarcipan.demo.repositories;

import odensemarcipan.demo.models.Product;
import odensemarcipan.demo.models.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    @Query(value = "SELECT products.name, products.price, products.id, products.category, products.picture_path, shopping_cart.amount  FROM products INNER JOIN shopping_cart ON products.id = shopping_cart.product_id WHERE shopping_cart.is_bought IS FALSE", nativeQuery = true)
    List<Product> findByIsBought();

    @Query(value = "SELECT SUM(products.price) FROM products INNER JOIN shopping_cart ON products.id = shopping_cart.product_id WHERE shopping_cart.is_bought IS FALSE", nativeQuery = true)
    Integer findSumByIsBoughtIsFalse();

    @Query(value = "SELECT SUM(shopping_cart.amount) FROM products INNER JOIN shopping_cart ON products.id = shopping_cart.product_id WHERE shopping_cart.is_bought IS FALSE", nativeQuery = true)
    Integer findTotalAmountByIsFalse();

}
