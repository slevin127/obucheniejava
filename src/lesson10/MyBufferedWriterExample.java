package lesson10;
/*
Класс MyBufferedWriterExample демонстрирует, как использовать BufferedWriter для записи
многострочного текста в файл. Он создаёт файл test2.txt и записывает в него две строки текста,
каждая — на своей строке.
Использует BufferedWriter вместо FileOutputStream для символьной (а не байтовой) записи.
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class MyBufferedWriterExample {

    public static void main(String[] args) throws IOException {

        BufferedWriter writer = new BufferedWriter (new FileWriter("test2.txt"));


        writer.write("Hello world,");
        writer.newLine();
        writer.write("It’s me!");
        writer.close();
    }
}

