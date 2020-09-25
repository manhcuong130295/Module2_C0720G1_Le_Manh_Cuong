package _12_java_collection_framework.bai_tap.su_dung_arraylist_linkedlist_trong_java_collection_framework;

import java.util.Comparator;

public class SortDownAscending implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        int result = product1.getPrice()-product2.getPrice();
        if (result>0) {
            return -1;
        } else if (result<0) {
            return 1;
        }
        return 0;
    }
}
