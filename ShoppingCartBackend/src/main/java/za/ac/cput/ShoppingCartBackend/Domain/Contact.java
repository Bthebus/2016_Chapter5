package za.ac.cput.ShoppingCartBackend.Domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-04-01
 */
@Embeddable
public class Contact implements IContact, Serializable {

    private String email;
    private String telephone;
    private String cellphone;

    private Contact(){}

    public Contact(Builder builder){
        email = builder.email;
        cellphone = builder.cellphone;
        telephone = builder.telephone;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getTelephone() {
        return telephone;
    }

    @Override
    public String getCellPhone() {
        return cellphone;
    }

    //Builder starts here
    public static class Builder {

        private String email;
        private String telephone;
        private String cellphone;

        public Builder() {
        }

        public Builder(String email, String telephone, String cellphone) {
            this.email = email;
            this.telephone = telephone;
            this.cellphone = cellphone;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder cellphone(String cellphone) {
            this.cellphone = cellphone;
            return this;
        }

        public Builder telephone(String telephone) {
            this.telephone = telephone;
            return this;
        }

        public Builder copy(Contact contact) {
            this.email = contact.email;
            this.cellphone = contact.cellphone;
            this.telephone = contact.telephone;
            return this;
        }

        public Contact build() {
            return new Contact(this);
        }
    }
}
