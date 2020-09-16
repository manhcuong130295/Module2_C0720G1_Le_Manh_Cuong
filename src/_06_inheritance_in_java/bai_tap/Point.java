package _06_inheritance_in_java.bai_tap;

import java.util.Arrays;

public class Point {
    protected float x;
    protected float y;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = getX();
        this.y = getY();
    }

    public float[] getXY() {
        float[] array = new float[2];
        array[0] = getX();
        array[1] = getY();
        return array;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class TestPoint {
    public static void main(String[] args) {
        Point point = new Point(1, 2);
        System.out.println(point.toString());
        System.out.println(Arrays.toString(point.getXY()));
    }
}

class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint() {

    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] arraySpeed = new float[2];
        arraySpeed[0] = getxSpeed();
        arraySpeed[1] = getySpeed();
        return arraySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = getxSpeed();
        this.ySpeed = getySpeed();
    }

    @Override
    public String toString() {
        return super.toString() + "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed + "speed=" + Arrays.toString( getSpeed()) +
                '}';
    }

    public float[] move() {
        this.x += getxSpeed();
        this.y += getySpeed();
        return getXY();
    }
}
class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(1,2,3, 4);
        System.out.println(movablePoint.toString());
        System.out.println("XY moved=\t"+Arrays.toString(movablePoint.move()));
    }
}