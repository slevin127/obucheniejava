package WeekPractik2.task5;

  class Orc implements Playable {
      @Override
      public String move() {
          return "run";
      }


      @Override
      public String attack() {
          return "ax blow";
      }


      @Override
      public String defense() {
          return "block";
      }
  }
       class Main2 {
          public static void main(String[] args) {
              Orc orc = new Orc();
              orc.move();
              orc.attack();
              orc.defense();
          }
      }

