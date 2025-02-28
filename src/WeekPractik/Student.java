package WeekPractik;

class Student {
    String name;
    int age;
    int grade;


    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public Student(String name) {
        this.name = name;
        this.age = 18;
        this.grade = 0;
    }

    public void infoAboutStudent() {
        System.out.println("Студент " + name + ", возраст " + age + " лет," + " оценка " + grade + ".");
    }
}

class StudentGrup {
    public static void main(String[] args) {
        Student student1 = new Student("Valera");
        Student student2 = new Student("Vitali", 17, 5);
        student1.infoAboutStudent();
        student2.infoAboutStudent();

    }
}