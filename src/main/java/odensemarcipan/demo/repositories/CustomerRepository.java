package odensemarcipan.demo.repositories;

import odensemarcipan.demo.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{

    @Query(value = "SELECT MAX(id) FROM customers", nativeQuery = true)
    Integer findMaxId();

}