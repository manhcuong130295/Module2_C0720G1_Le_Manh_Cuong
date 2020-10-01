package _16_io_file_text.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {

    public static List<Student> copy() {
        List<Student> studentList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("D:\\ChuongTrinhCodegym\\Module2_C0720G1_Le_Manh_Cuong\\src\\_16_io_file_text\\bai_tap\\Student.csv");
            BufferedReader bufReadFile = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Student student;
            while ((line=bufReadFile.readLine())!=null){
                temp = line.split(",");
                student = new Student(Integer.parseInt(temp[0]),temp[1]);
                studentList.add(student);
                FileWriter fileWriter = new FileWriter("D:\\ChuongTrinhCodegym\\Module2_C0720G1_Le_Manh_Cuong\\src\\_16_io_file_text\\bai_tap\\Student1",true);
                BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
                bufferedWriter.write(line+"\n");
                bufferedWriter.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return studentList;
    }

    public static void main(String[] args) {
        List<Student> studentList = copy();
        for (Student student:studentList) {
            System.out.println(student);
        }
    }
}
