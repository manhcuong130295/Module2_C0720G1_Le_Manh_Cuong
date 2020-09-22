package _10_danh_sach.bai_tap.trien_khai_phuong_thuc_arraylinkedlist;

public class TestLinkedList {
    public static void main(String[] args) {
         class Student{
           int id;
           String name;
             public Student(){

             }
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
         MyLinkedList<Student> myLinkedList= new MyLinkedList<>();
         Student student1= new Student(1,"Nam");
         Student student2= new Student(2,"Hoàng");
         Student student3= new Student(3,"Linh");
         Student student4=new Student(4,"Bảo");
         Student student5 = new Student(5,"Quang");
         myLinkedList.addFirst(student1);
         myLinkedList.addFirst(student2);
         myLinkedList.addFirst(student3);
         myLinkedList.addIndex(2,student4);
         myLinkedList.addLast(student5);

         for (int i=0; i<myLinkedList.size();i++){
             Student student=(Student) myLinkedList.getIndex(i);
             System.out.println(((Student) myLinkedList.getIndex(i)).getName());
         }
    }

}
