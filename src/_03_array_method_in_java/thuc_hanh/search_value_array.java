package _03_array_method_in_java.thuc_hanh;

import java.util.Scanner;

public class search_value_array {
    public static String inputName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        return name;
    }

    public static String searchStudent(String[] array, String keyword) {
        String result = " ";
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(keyword)) {
                result = "location " + i;
                break;
            } else {
                result = "not found";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] student = {"David", "Peter", "Micheal", "Anna", "Daniel"};
        String name = inputName();
        String result = searchStudent(student, name);
        System.out.println(result);
    }
}

