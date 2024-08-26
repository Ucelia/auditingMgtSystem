
package model;

import java.io.Serializable;

/**
 *
 * @author Celia
 */
public class User implements Serializable{
    private String email;
    private String password;
    private String roles;

    public User() {
    }

    public User(String email) {
        this.email = email;
    }

    public User(String email, String password, String roles) {
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
    
    
    
}
