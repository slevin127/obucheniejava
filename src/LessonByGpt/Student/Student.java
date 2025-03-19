package LessonByGpt.Student;

 class Student {
    private int age;
    private String name;

    public Student(int age, String name) {
      setAge(age);
      setName(name);
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 14){
            System.out.println("Возраст студента не может быть меньше 14 лет");
            return;
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Имя не может быть пустым");
            return;
        }
            this.name = name;

    }
    public void print() {
        System.out.println("Name: " + getName() + " age: " + getAge());
    }
    public static void main (String[] args) {
        Student ferst = new Student(25, "Петр");
        Student two = new Student(12, "Валера");
        Student three = new Student(2,"Ira");
        ferst.print();
        two.print();
        three.print();

    }
}
