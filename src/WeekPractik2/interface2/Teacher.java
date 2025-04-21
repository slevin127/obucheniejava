package WeekPractik2.interface2;

 class Teacher extends People{

     private String subject;

     public Teacher(String name, int age, String profession, String subject) {
         super(name, age, profession);
         this.subject = subject;
     }
     @Override
     public String getName() {
         return super.getName();
     }

     @Override
     public int getAge() {
         return super.getAge();
     }

     @Override
     public String getProfession() {
         return super.getProfession();
     }
     String getSubject(){
         return subject;
     }
     String giveALesson(){
         return "The lesson was ended";
     }
 }
