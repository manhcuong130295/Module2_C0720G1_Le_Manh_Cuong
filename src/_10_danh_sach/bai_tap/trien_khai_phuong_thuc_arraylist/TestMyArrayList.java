package _10_danh_sach.bai_tap.trien_khai_phuong_thuc_arraylist;

public class TestMyArrayList {
    public static class Student {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) throws IllegalAccessException {
        Student student1 = new Student(1, "Nam");
        Student student2 = new Student(2, "Hoa");
        Student student3 = new Student(3, "Hoàng");
        Student student4 = new Student(4, "Khoa");
        Student student5 = new Student(5, "Linh");
        Student student6 = new Student(6, "Lan");
        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        MyArrayList<Student> newArray = new MyArrayList<>();
        studentMyArrayList.add(student1);
        studentMyArrayList.add(student2);
        studentMyArrayList.add(student3);
        studentMyArrayList.add(student4);
        studentMyArrayList.add(student5);
        studentMyArrayList.add(student6, 2);
        // studentMyArrayList.clear();
//    for (int i=0; i<studentMyArrayList.size();i++){
//            Student student = (Student) ((MyArrayList<Student>) studentMyArrayList).elements[i];
//          System.out.println(student.getId());
//         System.out.println(student.getName());
//      }
        //System.out.println(studentMyArrayList.size());
        // System.out.println(studentMyArrayList.get(0).getName());
        //  System.out.println(studentMyArrayList.indexOf(student2));
        newArray = studentMyArrayList.clone();
        for (int i = 0; i < newArray.size(); i++) {
//            Student student = (Student) newArray.elements[i];
//            System.out.println(student.getId());
//            System.out.println(student.getName());
////    System.out.println(studentMyArrayList.contains(student1));
            System.out.println(newArray.get(i).getName());
        }
    }
}