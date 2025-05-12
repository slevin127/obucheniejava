package lesson11.StudentList;

import java.util.HashMap;

public class StudentStorage {
    private HashMap<String, Student> storage;

    public StudentStorage() {
        storage = new HashMap<>();
    }

    public void addStudent(String data) {
       try {


           String[] components = data.split("\\s+");
           String name = components[0] + " " + components[1];
           storage.put(name, new Student(name, components[3], components[2]));
       } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("Введен не верный формат ");
       }
       }

    public void listStudent() {
        storage.values().forEach(System.out::println);
    }

    public void removeStudent(String name) {
        storage.remove(name);
    }

    public Student getStudentByName(String name) {
        return storage.get(name);
    }

    public int getCount() {
        return storage.size();
    }
}