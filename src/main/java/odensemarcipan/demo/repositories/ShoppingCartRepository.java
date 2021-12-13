package odensemarcipan.demo.repositories;

import odensemarcipan.demo.models.Product;
import odensemarcipan.demo.models.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart,Integer>{
    @Modifying
    @Transactional
    @Query(value = "UPDATE shopping_cart SET is_bought = TRUE WHERE is_bought IS FALSE", nativeQuery = true)
    void setIsBoughtToTrue();

    @Modifying
    @Transactional
    @Query(value = "UPDATE shopping_cart SET customer_id = ? WHERE is_bought is false", nativeQuery = true)
    void setCustomerId(int id);
}
