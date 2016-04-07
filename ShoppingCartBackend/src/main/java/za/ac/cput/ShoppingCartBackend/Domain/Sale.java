package za.ac.cput.ShoppingCartBackend.Domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-04-01
 */
@Entity
public class Sale implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "sale_id")
    private List<Orders> orders;

    private Sale(){}

    public Sale(Builder builder){
        this.id = builder.id;
        this.orders = builder.orders;
    }

    public Long getId() {
        return id;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    //Builder Starts here

    public static class Builder{
        private Long id;
        private List<Orders> orders;

        public Builder(){}

        public Builder(List<Orders> orders){
            this.orders = orders;
        }

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder order(List<Orders> orders){
            this.orders = orders;
            return this;
        }

        public Builder copy(Sale sale){
            this.id = sale.id;
            this.orders = sale.orders;
            return this;
        }

        public Sale build(){
            return new Sale(this);
        }
    }
}
