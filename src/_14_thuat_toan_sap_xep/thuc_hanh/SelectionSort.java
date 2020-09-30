package _14_thuat_toan_sap_xep.thuc_hanh;

public class SelectionSort {
    static double[] list={1, 9, 4.5, 6.6, 5.7, -4.5};
    public static void selectionSort(double[] list) {
        for (int i =0;i<list.length-1;i++){
            double currentMin = list[i];
            int minIndex=i;
            for (int j=i+1;j<list.length;j++){
                if(list[j]<currentMin){
                    currentMin=list[j];
                    minIndex=j;
                }
            }
            if(minIndex!=i){
                list[minIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
