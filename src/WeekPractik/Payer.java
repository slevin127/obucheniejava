package WeekPractik;

public class Payer {
    String surname;
    String name;
    String address;
    String cardNumber;

    public Payer(String surname, String name, String address, String cardNumber) {
        this.surname = surname;
        this.name = name;
        this.address = address;
        this.cardNumber = cardNumber;
    }



    public String toString() {
        return "{Payer: " + surname + " " + name + ", address: " + address + ", card: " + cardNumber + "}";
    }
}
 class Main1 {
    public static void main(String[] args) {
        Payer payer = new Payer("Иванов", "Иван", "г. Москва, ул. Ленина, д. 10", "1234-5678-9012-3456");
        System.out.println(payer);
    }
}
