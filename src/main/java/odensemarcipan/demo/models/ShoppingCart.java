package odensemarcipan.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Data
@Table(name = "shopping_cart")
@Entity
@Getter @Setter @RequiredArgsConstructor
public class ShoppingCart {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private boolean isBought;

    @Column
    private int amount;

    @ManyToOne
    @JoinColumn(name = "productId",nullable = false)
    @JsonIgnore
    private Product product;

    @ManyToOne
    @JoinColumn(name = "customerId")
    @JsonIgnore
    private Customer customer;


}
