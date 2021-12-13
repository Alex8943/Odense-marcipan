package odensemarcipan.demo.repositories;

import odensemarcipan.demo.models.BoughtProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoughtProductRepository extends JpaRepository<BoughtProduct,Integer> {

}
