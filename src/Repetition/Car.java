package Repetition;

 class Car {
     private static String brand = "Toyota";


         public void run() {
             System.out.println(brand + " is running");
         }
     }

 class Main3 {

     public static void main(String[] args) {
         Car ferst = new Car();
         ferst.run();
     }
}