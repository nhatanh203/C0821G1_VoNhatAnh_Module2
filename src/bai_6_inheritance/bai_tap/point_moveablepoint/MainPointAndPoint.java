package bai_6_inheritance.bai_tap.point_moveablepoint;

public class MainPointAndPoint {
    public static void main(String[] args) {
        Point point = new Point();
//
        point.setX(10);
        point.setY(4);
        System.out.println("Point : " + point.toString());

        point.setXY(7, 2);
        System.out.println("Point : " + point.toString());

        MoveablePoint moveablepoint = new MoveablePoint();

        moveablepoint.setX(point.getX());
        moveablepoint.setY(point.getY());

        moveablepoint.setxSpeed(4);
        moveablepoint.setySpeed(3);
//x+setxSpeed ( 4 + 7 ) = 11
//y+setySpeed ( 2 + 3 ) = 5
        moveablepoint.move();
        System.out.println(moveablepoint.toString());

    }
}
