package WeekPractik;

public class LimitingRectangle {
    private int[][] points;
    private int minX, maxX, minY, maxY;


    public LimitingRectangle(int[][] points) {
        this.points = points;
        minX = maxX = points[0][0];
        minY = maxY = points[0][1];
        for (int[] point : points) {
            if (point[0] < minX) minX = point[0];
            if (point[0] > maxX) maxX = point[0];
            if (point[1] < minY) minY = point[1];
            if (point[1] > maxY) maxY = point[1];
        }
    }

     int getWidth() {
        return maxX - minX;
    }

     int getHeight() {
        return maxY - minY;
    }

     String getBorders() {
        return "{" + minY + ", " + maxY + ", " + minX + ", " + maxX + "}";
    }

}

class Main5 {
    public static void main(String[] args) {
        LimitingRectangle r = new LimitingRectangle(new int[][]{{-1, -2}, {3, 4}});
        System.out.println(r.getWidth() + " " + r.getHeight());
        System.out.println(r.getBorders());
    }
}
