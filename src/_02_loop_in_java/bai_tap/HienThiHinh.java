package _02_loop_in_java.bai_tap;
import java.util.Scanner;
public class HienThiHinh {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            while (true){
                int choice = sc.nextInt();
                switch (choice){
                    case 1 :
                        System.out.println("Input length :");
                        int length = sc.nextInt();
                        System.out.println("Input width :");
                        int width = sc.nextInt();
                        System.out.println("Print the rectangle");
                        for (int i = 0; i < length; i++){
                            for (int j = 0; j < width; j++){
                                System.out.print("*");
                            }
                            System.out.println("\n");
                        }
                        break;
                    case 2 :
                        System.out.println("Print the square triangle :");
                        for (int i = 1; i <= 5; i++) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print("*");
                            }
                            System.out.println("\n");
                        }
                    case 3 :
                        System.out.println("Print isosceles triangle");
                        for(int i=7;i>=1;i--){
                            for(int j=1;j<=i;j++){
                                System.out.print("*");
                            }
                            System.out.println("\n");
                        }
                        int n = 5;
                        int q = 0;
                        while (n > 0) {
                            for (int i = 1; i < n; i++) {
                                System.out.print(" ");
                            }
                            for (int j = 0; j <= q; j++) {
                                System.out.print("*");
                            }
                            n--;
                            q += 2;
                            System.out.print("\n");
                        }
                    case 4 :
                        System.exit(0);
                    default:
                        System.out.println("No choice!");
                }
            }
        }

}
