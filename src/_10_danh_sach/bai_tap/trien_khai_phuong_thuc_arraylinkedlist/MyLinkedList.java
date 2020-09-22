package _10_danh_sach.bai_tap.trien_khai_phuong_thuc_arraylinkedlist;

public class MyLinkedList<E> {
    private Node head;
    private int size;

    public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public MyLinkedList() {
    }

    public void addFirst(E element) {
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        size++;
    }

    public void addLast(E element) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        size++;
    }

    public void addIndex(int index,E element) {
      Node temp=head;
      Node holder;
      for (int i =0;i<index-1&&temp.next!=null;i++) {
          temp=temp.next;
      }
      holder=temp.next;
      temp.next=new Node(element);
      temp.next.next=holder;
      size++;
    }
    public Object getIndex(int index){
        Node temp=head;
        for (int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.data;
    }
    public int size() {
        return size;
    }

}
