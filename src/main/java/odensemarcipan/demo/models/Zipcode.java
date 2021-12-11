package odensemarcipan.demo.models;

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
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column
    private int zipcode;

    @Column
    private String cityName;

    @OneToMany(mappedBy = "zipcode",fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
    private List<Zipcode> savedZipcode;



}
