package Lesson4_3;
/*Напишите регулярку, которая найдет в строке aba aba a!a abba
adca abea строки abba adca abea по шаблону: буква a,
 2 любых символа, буква a.*/
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise432 {

    public static void main(String[] args) {

        String text = "Regular Expressions or Regex is an API for defining String patterns that can be used for searching, manipulating and editing a text. It is widely used to define a constraint on strings such as a password. Regular Expressions are provided under java.util.regex package.";
        Pattern pattern = Pattern.compile("\\b[sS][a-zA-Z]*[sS]\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println(text.substring(start, end) );

        }
    }
}
