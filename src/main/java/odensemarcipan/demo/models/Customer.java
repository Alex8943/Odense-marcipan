package odensemarcipan.demo.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Table(name = "customers")
@Entity
@Getter @Setter
public class Customer {

    @Id
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

    @OneToOne(mappedBy = "customer",fetch = FetchType.LAZY)
    private ShoppingCart shoppingCart;

}
