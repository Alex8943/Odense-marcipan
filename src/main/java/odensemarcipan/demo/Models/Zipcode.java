package odensemarcipan.demo.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Data
@Table(name = "zipcodes")
@Entity
@Getter @Setter
public class Zipcode {

    @Id
    private int id;

    @Column
    private int zipcode;

    @OneToMany(mappedBy = "zipcode",fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
    private List<Zipcode> savedZipcode;



}
