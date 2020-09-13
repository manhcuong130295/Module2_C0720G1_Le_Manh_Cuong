package _03_array_method_in_java.bai_tap;
import java.util.Scanner;
import java.util.Arrays;
public class DeleteElementArray {
    public static void main(String[] args) {
        int [] arrayNumber = {5,6,7,8,2,1,2,3};
        int number ;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        number= sc.nextInt();
        for (int i=0;i<arrayNumber.length;i++) {
            if (arrayNumber[i]==number) {
                System.out.println(i);
                for (int j= i; j<arrayNumber.length-1;j++) {
                  arrayNumber[j]=arrayNumber[j+1];
                }
                arrayNumber[arrayNumber.length-1]=0;
            }
        }
        System.out.println(Arrays.toString(arrayNumber));
    }
}