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
public class OrderLine implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "orderline_id")
    private List<Orders> orders;

    private OrderLine(){}

    public OrderLine(Builder builder){
        this.orders = builder.orders;
    }

    public Long getId() {
        return id;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    //Builder starts here

    public static class Builder{

        private Long id;
        private List<Orders> orders;

        public Builder(){}

        public Builder(List<Orders> orders){
            this.orders = orders;
         }

        public Builder id(Long id){
            this.id = id;
            return this;
        }

        public Builder order(List<Orders> orders){
            this.orders = orders;
            return this;
        }

        public Builder copy(OrderLine orderLine){
            this.id = orderLine.id;
            this.orders = orderLine.orders;
            return this;
        }

        public OrderLine build() {
            return new OrderLine(this);
        }
    }
}
