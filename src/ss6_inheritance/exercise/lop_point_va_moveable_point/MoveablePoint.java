package ss6_inheritance.exercise.lop_point_va_moveable_point;

public class MoveablePoint extends  Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    MoveablePoint(){
    }
    MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    MoveablePoint(float xSpeed, float ySpeed, float x, float y){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setXY(float xSpeed, float ySpeed) {
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
    }
    public float[] getSpeed() {
        float[] arr = {this.xSpeed, this.ySpeed};
        return arr;
    }
    @Override
    public String toString() {
        return "In Move-able Point"
                +" coordinates of x: " +getX()
                + ", and speed of x: " +this.xSpeed
                + " coordinates of y: " +getY()
                + ", and speed of y: " +this.ySpeed;
    }
    public MoveablePoint move(){
        super.setX( super.getX() + this.xSpeed );
        super.setY( super.getY() + this.ySpeed );
        return this;
    }
}
