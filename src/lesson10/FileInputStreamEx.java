package lesson10;
/*
Класс FileInputStreamEx демонстрирует работу с байтовым потоком через FileInputStream.
 Он считывает содержимое текстового файла asciitable.txt побайтно и считает
 количество цифр от 1 до 9, присутствующих в файле.
 */

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {
    public static void main(String[] args) throws IOException {

        String filName = "asciitable.txt";

        FileInputStream fis = new FileInputStream(filName);
        int i;
        int count = 0;
        while ((i = fis.read()) != -1) {
            if (i >= '1' && i <= '9') {
                count++;
            }

        }
        fis.close();
        System.out.println(count);
    }

}
