package za.ac.cput.ShoppingCartBackend.Domain;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-04-01
 */
@Embeddable
public class User implements Serializable{

    @NotNull
    @Size(min=5, max = 10)
    private String username;
    @NotNull
    @Size(min=5, max = 10)
    private String password;

    private User() {
    }

    public User(Builder builder){
        this.username = builder.username;
        this.password = builder.password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    //builder starts here
    public static class Builder{
        private String username;
        private String password;

        public Builder()
        {}

        public Builder(String username, String password)
        {
            this.username = username;
            this.password = password;
        }

        public Builder username(String username){
            this.username = username;
            return this;
        }

        public Builder password(String password){
            this.password = password;
            return this;
        }

        public Builder copy(User user){
            this.username = user.username;
            this.password = user.password;
            return this;
        }

        public User build()
        {
            return  new User(this);
        }
    }
}
