package OOP.exercis6_2_4;


import java.util.Arrays;
import java.util.HashSet;

class Main {
     public static void main(String[] args) {
         int[] numbers = {50, 26, 45, 53, 24, 47, 44, 53, 99};
         int max = numbers[0];
         int target = 45;
         boolean found = false;
        //Поиск максимального элемента
         for (int i = 1; i < numbers.length; i++) {
             if (numbers[i] > max) {
                 max = numbers[i];
                 System.out.println(numbers[i]);
             }
          }
         //Проверка, есть ли число в массиве
         for (int num : numbers) {
             if (num == target) {
                 found = true;
                 break;
             }
         }
         //Сумма всех элементов массива
         int sum = 0;
         for (int num : numbers) {
             sum += num;
         }
         //Массив без дубликатов
         HashSet<Integer> set = new HashSet<>();
         for (int num : numbers) {
             set.add(num);
                      }
         int[] results = set.stream().mapToInt(i -> i).toArray();


         System.out.println(found ? "Элемент найден" : "Элемент не найден");
         System.out.println("dlinna masiva " + numbers.length);
         System.out.println("Summa " + sum);
         System.out.println("Masif bes dublikatov" + Arrays.toString(results));
     }
 }
