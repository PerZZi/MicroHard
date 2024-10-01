package opytha.microhard.dtos;
import opytha.microhard.models.enums.Roles;

public class UserDTO {
    private long id;
    private String email, password, user_name, user_lastname;
    private Roles rol = Roles.USER;

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
}
