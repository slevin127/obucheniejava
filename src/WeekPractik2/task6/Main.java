package WeekPractik2.task6;

public class Main {
    public static void main(String[] args) {
        Vector2D v1 = new Vector2D(1, 2, 3, 4);
        Vector2D v2 = new Vector2D(0, 0, 3, 3);

        System.out.println(v1.getLength());
        System.out.println(v1.getVectorCords());
        System.out.println(v1.getScalarProduct(v2));
        System.out.println(v1.getAngle(v2));

        Vector3D v3 = new Vector3D(0, 0, 0, 1, 2, 3);
        Vector3D v4 = new Vector3D(1, 1, 1, 2, 2, 2);

        System.out.println(v3.getLength());
        System.out.println(v3.getVectorCords());
        System.out.println(v3.getScalarProduct(v4));
    }
}

