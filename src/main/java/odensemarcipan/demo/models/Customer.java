package odensemarcipan.demo.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Data
@Table(name = "customers")
@Entity
@Getter @Setter
public class Customer {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private String address;

    @Column
    private String email;

    @Column
    private long phoneNumber;

    @ManyToOne
    @JoinColumn(name = "zipcode", nullable = false)
    private Zipcode zipcode;

    @OneToMany(mappedBy = "id", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Product> savedProduct;

}
