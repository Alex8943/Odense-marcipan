package odensemarcipan.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @Column
    private String picturePath;

    @OneToMany(mappedBy = "id", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Product> savedProduct;

}