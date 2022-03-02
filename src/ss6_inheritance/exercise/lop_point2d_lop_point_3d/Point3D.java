package ss6_inheritance.exercise.lop_point2d_lop_point_3d;

public class Point3D extends Point2D {
    private float z = 1.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        getX();
        getX();
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arr = {getX(), getY(), getZ()};
        return arr;
    }
    @Override
    public String toString() {
        return "In point 3D"
                +" coordinates of x: " +getX()
                + " coordinates of y: " +getY()
                 + " coordinates of z: " +getZ();
    }
}
