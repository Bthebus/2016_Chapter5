package za.ac.cput.ShoppingCartBackend.Domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-04-01
 */
@Entity
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Embedded
    private Name name;
    @Embedded
    private Contact contactInformation;
    @Embedded
    private Address address;
    @NotNull
    @Embedded
    private User user;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_id")
    private List<Orders> orders;


    private Customer(){}

    public Customer(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.contactInformation = builder.contactInformation;
        this.address = builder.address;
        this.user = builder.user;
        this.orders = builder.orders;
    }

    public Long getId() {
        return id;
    }

    public Name getName() {
        return name;
    }

    public Contact getContactInformation() {
        return contactInformation;
    }

    public Address getAddress() {
        return address;
    }

    public User getUser() {
        return user;
    }

    public List<Orders> getOrders(){
        return orders;
    }
    //Builder starts here
    public static class Builder{
        private Long id;
        private Name name;
        private Contact contactInformation;
        private Address address;
        private User user;
        private List<Orders> orders;

        public Builder() {
        }

        public Builder(Name name, Contact contactInformation, Address address, User user, List<Orders> orders) {
            this.name = name;
            this.contactInformation = contactInformation;
            this.address = address;
            this.user = user;
            this.orders = orders;
        }

        public Builder id(Long id){
            this.id = id;
            return this;
        }

        public Builder name(Name name){
            this.name = name;
            return this;
        }

        public Builder contactInformation(Contact contactInformation){
            this.contactInformation = contactInformation;
            return this;
        }

        public Builder address(Address address){
            this.address = address;
            return this;
        }

        public Builder user(User user)
        {
            this.user = user;
            return this;
        }

        public Builder order(List<Orders> orders)
        {
            this.orders = orders;
            return this;
        }


        public Builder copy(Customer customer){
            this.id = customer.id;
            this.name = customer.name;
            this.contactInformation = customer.contactInformation;
            this.address = customer.address;
            this.user = customer.user;
            this.orders = customer.orders;
            return this;
        }

        public Customer build(){
            return new Customer(this);
        }
    }
}
