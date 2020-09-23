package _11_generic_stack_queue.bai_tap.chuyen_doi_thap_phan_sang_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal Number");
        int numberDecimal;
        numberDecimal = sc.nextInt();
        System.out.print("Decimal Number:"+numberDecimal+"\n");
        while (numberDecimal != 0) {
            int temp = numberDecimal % 2;
            stack.push(temp);
            numberDecimal /= 2;
        }

        System.out.print("After Convert To Binary:");
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
