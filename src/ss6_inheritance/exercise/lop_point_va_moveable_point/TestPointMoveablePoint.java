package ss6_inheritance.exercise.lop_point_va_moveable_point;

public class TestPointMoveablePoint {
    public static void main(String[] args) {
        Point point = new Point(2,3);
        System.out.println(point);
        MoveablePoint moveablePoint = new MoveablePoint(1,2,3,4);
        MoveablePoint moveablePoint1 = new MoveablePoint(10,13);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint1);
        System.out.println(moveablePoint.move());
    }
}
