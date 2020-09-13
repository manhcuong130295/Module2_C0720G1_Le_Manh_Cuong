package _04_class_and_object_in_java.bai_tap.phuong_trinh_bac_2;

public class PhuongTrinhBac2 {
    double a;
    double b;
    double c;

    public PhuongTrinhBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDelta() {
        double delta;
        delta = Math.pow(this.b, 2) - 4 * this.a * this.c;
        return delta;
    }

    public String getRoot() {
        String result = " ";
        double root1 = 0;
        double root2 = 0;
        root1 = ((-this.b) - Math.sqrt(getDelta())) / (2 * this.a);
        root2 = ((-this.b) + Math.sqrt(getDelta())) / (2 * this.a);
        double root;
        root = (+this.b) / 2 * this.a;
        if (getDelta() > 0) {
            result = "Nghiệm của phương trình là:\n" + "x1=\t" + root1 + " " + "x2\t=" + root2;
        } else if (getDelta() == 0) {
            result = "Nghiệm của phương trình là:\n" + "x1=x2=\t" + root;
        } else {
            result = "Phương trình vô nghiệm";
        }
        return result;
    }
}
