package _04_class_and_object_in_java.bai_tap.fan;

public class Fan {
    final int SLOW;
    final int MEDIUM;
    final int FAST;
    boolean on;
    int speed;
    String color;
    double radius;

    public Fan() {
        this.radius = radius;
        this.SLOW = 1;
        this.MEDIUM = 2;
        this.FAST = 3;
        this.on = false;
        this.speed = this.SLOW;
        this.color = "Blue";
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean getOn() {
        return on;
    }

    public String getStatus() {
        String status = " ";
        if (this.on == true) {
            status = "on";
        } else {
            status = "off";
        }
        return status;
    }

    public int getSpeed() {
        if (this.on == true) {
            if (this.speed == this.SLOW) {
                speed = this.SLOW;
            } else if (this.speed == this.MEDIUM) {
                speed = this.MEDIUM;
            } else if (this.speed == this.FAST) {
                speed = this.FAST;
            } else {
                speed = 0;
            }
        } else {
            speed = 0;
        }
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Fan is\t" + "status \t"
                + getStatus() + "\n"
                + "radius\t" + this.radius + "\n"
                + "speed\t" + getSpeed()+ "\n"
                + "color\t" + this.color;

    }
}
