package lesson10;
/*
Класс FileOutputStreamEx демонстрирует базовую работу с байтовым выходным
потоком в Java. Он создаёт файл test.txt (или перезаписывает, если такой файл уже
существует) и записывает в него строку "Hello FileOutputStream world".
 */
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx  {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("test.txt");
       // fos.write("Hello FileOutputStream world".getBytes());// в одну строку
        // Создаём многострочную строку
        String text = "Hello world,\nIt’s me!";

        // Преобразуем в байты и записываем
        fos.write(text.getBytes());
        fos.close();
    }
}
