package WeekPractik;

public class Programmer {
    String name;
    String company;
    String position;
    private static final String[] positions = {"intern", "junior", "middle", "senior", "lead"};

    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
        this.position = positions[0];
    }


    public String getPosition() {
        return position;
    }
    public void work() {
        for (int i = 0; i < positions.length - 1; i++) {
            if (positions[i].equals(position)){
                position = positions[i + 1];
                return;
            }
        }
    }
}
