package introduction_to_java_01.bai_tap;

import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        int usd;
        final int rate= 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Money (USD)");
        usd = scanner.nextInt();
        System.out.println("VNĐ="+" "+usd*rate+"đ");
    }
}

