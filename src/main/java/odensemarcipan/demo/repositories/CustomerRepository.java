package odensemarcipan.demo.repositories;

import odensemarcipan.demo.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{


}