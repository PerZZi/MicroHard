package opytha.microhard.models;
import jakarta.persistence.*;
import opytha.microhard.models.enums.Roles;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String email, password, user_name, user_lastname;

    @Enumerated(value = EnumType.STRING)
    private Roles rol = Roles.USER;

    public User() {
    }

    public User(String email, String password, String user_name, String user_lastname) {
        this.email = email;
        this.password = password;
        this.user_name = user_name;
        this.user_lastname = user_lastname;
    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getUser_lastname() {
        return user_lastname;
    }

    public Roles getRol() {
        return rol;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setUser_lastname(String user_lastname) {
        this.user_lastname = user_lastname;
    }

    public void setRol(Roles rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_lastname='" + user_lastname + '\'' +
                ", rol=" + rol +
                '}';
    }
}

