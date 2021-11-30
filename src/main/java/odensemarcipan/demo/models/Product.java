package odensemarcipan.demo.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import java.util.List;

@Data
@Table(name = "products")
@Entity
@Getter @Setter
public class Product {

    @Id
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private double price;

    @Column
    private String category;

    @OneToMany(mappedBy = "id", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Product> savedProduct;

}