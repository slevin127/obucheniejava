package WeekPractik;

class Dogs {
    private String name;
    private int age;


    public Dogs(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    public void bark() {
//        System.out.println("Гав гав, меня зовут " + name + " и мне " + age + " гаввв!");
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String bark(){
        return "woof";
    }
}

class DogsGrup {
    public static void main(String[] args) {
        Dogs dog1 = new Dogs("Sharik", 4);
        Dogs dog2 = new Dogs("Shurik", 3);
        Dogs dog3 = new Dogs("Shartik", 12);

        dog1.bark();
        dog2.bark();
        dog3.bark();
    }

}

