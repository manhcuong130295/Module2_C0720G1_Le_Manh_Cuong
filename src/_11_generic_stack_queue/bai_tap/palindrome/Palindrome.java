package _11_generic_stack_queue.bai_tap.palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input String");
        String string = scanner.nextLine().toLowerCase().trim();
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
        }
        System.out.println(stack);
        for (int i = 0; i < string.length(); i++) {
            queue.add(string.charAt(i));
        }
        boolean result = false;
        System.out.println(queue);
        while (!stack.isEmpty()) {
            if (stack.pop() ==queue.poll()) {
                result = true;
                break;
            } else {
                result = false;
                break;
            }
        }
        if(result) {
            System.out.println("is palindrome string");
        } else {
            System.out.println("isn't palindrome string");
        }
    }

}
