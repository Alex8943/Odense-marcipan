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
    private int amount;

    @Column
    private boolean isBought;

    @ManyToOne
    @JoinColumn(name = "productId",nullable = false)
    @JsonIgnore
    private Product product;

    @OneToOne
    @JoinColumn(name = "customerId",nullable = true, referencedColumnName = "id")
    @JsonIgnore
    private Customer customer;


}
