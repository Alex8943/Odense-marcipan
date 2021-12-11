package odensemarcipan.demo.repositories;

import odensemarcipan.demo.models.Product;
import odensemarcipan.demo.models.Zipcode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ZipcodeRepository extends JpaRepository<Zipcode,Integer>{

    @Query(value = "SELECT id, city_name, zipcode FROM zipcodes WHERE zipcode = ?", nativeQuery = true)
    Zipcode findByZipcode(String zipcode);
}
