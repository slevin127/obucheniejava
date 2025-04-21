package WeekPractik2.task6;

public class Vector3D extends Vector {

    public Vector3D(int x1, int y1, int z1, int x2, int y2, int z2) {
        super(x1, y1, z1, x2, y2, z2);
    }

    @Override
    public double getLength() {
        int dx = x2 - x1;
        int dy = y2 - y1;
        int dz = z2 - z1;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    @Override
    public String getVectorCords() {
        int dx = x2 - x1;
        int dy = y2 - y1;
        int dz = z2 - z1;
        return dx + " " + dy + " " + dz;
    }

    public double getScalarProduct(Vector3D vector) {
        int dx1 = this.x2 - this.x1;
        int dy1 = this.y2 - this.y1;
        int dz1 = this.z2 - this.z1;

        int dx2 = vector.x2 - vector.x1;
        int dy2 = vector.y2 - vector.y1;
        int dz2 = vector.z2 - vector.z1;
        return dx1 * dx2 + dy1 * dy2 + dz1 * dz2;
    }

}
