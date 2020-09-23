package _11_generic_stack_queue.bai_tap.trien_khai_queue_su_dung_danh_sach_lien_ket_vong;

public class TestQueue {
    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.enQueue(0);
        queue.enQueue(10);
        queue.enQueue(15);
        System.out.println(queue.displayQueue());
        queue.deQueue();
        System.out.println(queue.displayQueue());
    }
}
