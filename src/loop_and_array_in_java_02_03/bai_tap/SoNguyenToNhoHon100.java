package loop_and_array_in_java_02_03.bai_tap;

public class SoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int number=2;
while (number<100){
    boolean check = true;
    if (number < 2) {
        check = false;
    } else if (number == 2) {
        check = true;
    } else if (number % 2 == 0) {
        check = false;
    } else {
        for (int index = 3; index < number; index += 2) {
            if (number % index == 0) {
                check = false;
                break;
            }
        }
    }
    if (check == true) {
        System.out.println(" "+number);
    }
    number++;
}
    }
}
