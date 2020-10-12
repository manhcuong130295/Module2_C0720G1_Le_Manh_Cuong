package models;

import controllers.MainControllers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class EmployeeProfile {
    public static final String EMPLOYEE_FILE = "D:\\ChuongTrinhCodegym\\Module2_C0720G1_Le_Manh_Cuong\\FuramaResort\\src\\data\\Employee.csv";
    public static Scanner sc = new Scanner(System.in);

    public static void searchEmployeeProfile() {
        Stack<Employee> employeeProfiles = new Stack<Employee>();
        try {
            FileReader fileReader = new FileReader(EMPLOYEE_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Employee employee;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                employee = new Employee(temp[1], Integer.parseInt(temp[2]), temp[3]);
                employeeProfiles.add(employee);
            }
            boolean check = false;
            do {
                try {
                    System.out.println("Enter Employee's want search");
                    String name = sc.nextLine().toLowerCase();
                    while (!employeeProfiles.isEmpty()) {
                        Employee employee1 = employeeProfiles.pop();
                        check = name.equals(employee1.getName().toLowerCase());
                        if (check) {
                            System.out.println(employee1);
                            break;
                        }
                    }
                    if (employeeProfiles.isEmpty()) {
                        System.out.println("List Employee have not this name");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Wrong format ! Input again");
                }


            } while (!check);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        searchEmployeeProfile();
    }
}
