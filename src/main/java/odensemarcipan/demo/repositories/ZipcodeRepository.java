package odensemarcipan.demo.repositories;

import odensemarcipan.demo.models.Zipcode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZipcodeRepository extends JpaRepository<Zipcode,Integer>{
}
