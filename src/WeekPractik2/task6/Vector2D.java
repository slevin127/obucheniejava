package WeekPractik2.task6;

public class Vector2D extends Vector {


    public Vector2D(int x1, int y1, int x2, int y2) {
        super(x1, y1, 0, x2, y2, 0);

    }

    @Override
    public double getLength() {
        int dx = x2 - x1;
        int dy = y2 - y1;

        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String getVectorCords() {
        int dx = x2 - x1;
        int dy = y2 - y1;
        return  dx + " " + dy + " 0";
    }
    public double getScalarProduct(Vector2D vector) {
        int dx1 = this.x2 - this.x1;
        int dy1 = this.y2 - this.y1;
        int dx2 = vector.x2 - vector.x1;
        int dy2 = vector.y2 - vector.y1;
        return dx1 * dx2 + dy1 * dy2;
    }

    public double getAngle(Vector2D vector) {
        double len1 = this.getLength();
        double len2 = vector.getLength();
        if (len1 == 0 || len2 == 0) return -2.0;

        double dotProduct = this.getScalarProduct(vector);
        return dotProduct / (len1 * len2);
    }

}
