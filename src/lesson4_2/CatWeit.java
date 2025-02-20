package lesson4_2;
 public class CatWeit {

     public static void main(String[] args) {
         Cat bigCat = new Cat(5500, "Murka", 2, "Black");
         Cat smallCat = new Cat(1000, "Kuzya", 1, "White");
         Cat angryCat = new Cat(2000,"Zliuca", 2, "Ginger");
         bigCat.setName("Pushok");
         angryCat.setColor("Grey");
         System.out.println("The name of big cat is " + bigCat.getName());
         System.out.println("The name of small cat is " + smallCat.getName());
         System.out.println("The color angry cat is " + angryCat.getColor());
         System.out.println();
     }
 }