package _11_generic_stack_queue.bai_tap.dao_nguoc_phan_tu;

import java.util.Stack;

public class ReverseNumber {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.size());
        System.out.println("before " + stack);
//        int size = stack.size();
        Stack<Integer> temp = new Stack<>();
//        for (int i = 0; i < size; i++) {
//            temp.push(stack.pop());
//        }
        while (!stack.isEmpty()) {
            temp.push(stack.pop());
        }
        stack = temp;
        System.out.println("after reverse" + stack);
//        while (!stack.isEmpty()){
//            System.out.println( stack.pop());
//            stack.push(stack.pop());
//        }
//        System.out.println(stack);
    }
}
