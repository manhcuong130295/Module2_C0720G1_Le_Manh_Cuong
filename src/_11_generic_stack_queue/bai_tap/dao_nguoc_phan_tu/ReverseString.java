package _11_generic_stack_queue.bai_tap.dao_nguoc_phan_tu;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String[] mWord = scanner.nextLine().split(" ");
        for (int i = 0; i < mWord.length; i++) {
            stringStack.push(mWord[i]);
        }
        Stack<String> stringStackTemp=new Stack<>();
        System.out.println("before" + stringStack);
        while (!stringStack.isEmpty()) {
            stringStackTemp.push(stringStack.pop());
        }
        stringStack=stringStackTemp;
        System.out.println("After reverse"+stringStack);
    }
}
