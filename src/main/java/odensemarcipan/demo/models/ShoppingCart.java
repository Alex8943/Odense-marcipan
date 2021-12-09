package odensemarcipan.demo.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Table(name = "shopping_cart")
@Entity
@Getter @Setter
public class ShoppingCart {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private int amount;

    @ManyToOne
    @JoinColumn(name = "productId",nullable = false)
    private Product product;

    @OneToOne
    @JoinColumn(name = "customerId",nullable = true, referencedColumnName = "id")
    private Customer customer;


}
