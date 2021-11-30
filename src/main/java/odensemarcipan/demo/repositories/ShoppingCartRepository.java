package odensemarcipan.demo.repositories;

import odensemarcipan.demo.models.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart,Integer>{
}
