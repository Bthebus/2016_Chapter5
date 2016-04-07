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
public class Orders implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String orderDate;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "order_id")
    private List<Item> item;

    private Orders(){}

    public Orders(Builder builder){
        this.id = builder.id;
        this.orderDate = builder.orderDate;
        this.item = builder.item;
    }

    public Long getId() {
        return id;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public List<Item> getItem(){
        return item;
    }

    // Builder starts here
    public static class Builder{
        private Long id;
        private String orderDate;
        private List<Item> item;

        public Builder(){}

        public Builder(String orderDate, List<Item> item){
            this.orderDate = orderDate;
            this.item = item;
        }

        public Builder id(Long id){
            this.id = id;
            return this;
        }

        public Builder orderDate(String orderDate){
            this.orderDate = orderDate;
            return this;
        }

        public Builder item (List<Item> item)
        {
            this.item = item;
            return this;
        }

        public Builder copy(Orders orders){
            this.id = orders.id;
            this.orderDate = orders.orderDate;
            this.item = orders.item;
            return this;
        }

        public Orders build(){
            return new Orders(this);
        }
    }
}
