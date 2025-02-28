package WeekPractik;

 class Balance {
    private int leftWeight;
    private int rightWeight;


    public Balance() {
        this.leftWeight = 0;
        this.rightWeight = 0;
    }


    public void addRight(int n) {
        this.rightWeight += n;
    }


    public void addLeft(int n) {
        this.leftWeight += n;
    }


    public String getSituation() {
        if (leftWeight == rightWeight) {
            return "=";
        } else if (rightWeight > leftWeight) {
            return "R";
        } else {
            return "L";
        }
    }


    public String getWeights() {
        return "Left: " + leftWeight + ", Right: " + rightWeight;
    }
}
class Main {
    public static void main(String[] args) {
        Balance balance = new Balance();
        balance.addRight(5);
        balance.addLeft(5);
        System.out.println(balance.getSituation());
        //System.out.println(balance.getWeights());
    }
}