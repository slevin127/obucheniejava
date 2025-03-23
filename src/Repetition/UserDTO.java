package Repetition;


import java.util.Scanner;

public class UserDTO extends User {
    private String username;
    private String role;

    public UserDTO(String role, String username) {
        this.role = role;
        this.username = username;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void setEmail(String email, Scanner sc) {
        super.setEmail(email, sc);
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        if (!role.equalsIgnoreCase("admin") && !role.equalsIgnoreCase("user")) {
            throw new IllegalArgumentException("Role must be either ADMIN or USER");
        }
        this.role = role.toUpperCase(); // Можно нормализовать
    }
    @Override
    public String toString() {
        return "UserDTO [username=" + username + ", email=" + getEmail() + ", role=" + role + "]";
    }
}
