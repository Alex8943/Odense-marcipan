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
    @Column
    private int id;


    @ManyToOne
    @JoinColumn(name = "productId",nullable = false)
    private Product product;


    @OneToOne
    @JoinColumn(name = "customerId",nullable = false, referencedColumnName = "id")
    private Customer customer;


}
