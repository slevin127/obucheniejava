package Repetition;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Random;
import java.util.Scanner;

@Getter
@Entity

public abstract class User   {
    @Setter
    @Id
    private int id;
    private String email;
    private String password;

    public User() {

    }

    public void setEmail(String email, Scanner sc) {

        while (true) if (email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            this.email = email;
            break;
        } else {
            System.out.println("Invalid email");
            email = sc.nextLine();
        }
    }

    public void setPassword(String password, Scanner sc) {
        while (true) {
            if (password.length() < 10) {
                this.password = password;
                break;
            } else {
                System.out.println("Password must be at least 10 characters");
                password = sc.nextLine();
            }

        }
    }

    public void randomId() {
        Random r = new Random();
        this.id = r.nextInt(1000);

    }

    public void print() {
        System.out.println("Email: " + getEmail());
        System.out.println("Password: " + getPassword());
        System.out.println("ID: " + getId());
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}

class Main {
    public static void main(String[] args) {
        UserDTO user0001 = new UserDTO("user", "Grisha");
        Scanner sc = new Scanner(System.in);
        UserDTO user0002 = new UserDTO("admin", "Valera");

        System.out.println("Enter your email address: ");
        user0001.setEmail(sc.nextLine(), sc);

        System.out.println("Enter your password: " + user0001);
        user0001.setPassword(sc.nextLine(), sc);
        sc.close();
        System.out.println(user0002);
        user0001.randomId();
        System.out.println(user0001);


    }

}



