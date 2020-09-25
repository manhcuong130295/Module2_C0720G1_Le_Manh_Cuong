package _12_java_collection_framework.bai_tap.su_dung_arraylist_linkedlist_trong_java_collection_framework;


import java.util.*;

public class ManagerProduct {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Product> listProduct = new ArrayList<>();

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        int choose = 0;
        do {
            System.out.println("1.add product\n" +
                    "2.edit product\n" +
                    "3.delete product\n" +
                    "4.display list product\n" +
                    "5.search product\n" +
                    "6.sort up ascending\n" +
                    "7.sort down ascending\n" +
                    "8.Exit");
            System.out.println("Please input choose (1 - 8): ");
            choose = sc.nextInt();

            switch (choose) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    editProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    disPlayListProduct();
                    break;
                case 5:
                    searchProduct();
                    break;
                case 6:
                    sortUpAscending();
                    break;
                case 7:
                    sortDownAscending();
                    break;
                case 8:
                    System.exit(0);
                    break;

            }

        } while (choose >= 1 && choose <= 8);

    }

    private static void sortDownAscending() {
        Collections.sort(listProduct, new SortDownAscending());
        System.out.println(listProduct);
    }

    private static void sortUpAscending() {
        Collections.sort(listProduct, new SortUpAscending());
        System.out.println(listProduct);
    }

    private static void searchProduct() {
        System.out.println("Enter name product want to search:");
        String searchName = sc.next().toLowerCase();
        for (int i = 0; i < listProduct.size(); i++) {
            if (searchName.equals(listProduct.get(i).getName())) {
                System.out.println(listProduct.get(i).toString());
            }
        }
    }

    private static void disPlayListProduct() {
        System.out.println(listProduct);
    }

    private static void deleteProduct() {
        System.out.println("Enter id want to delete");
        int idDelete = sc.nextInt();
        for (int i = 0; i < listProduct.size(); i++) {
            if (idDelete == listProduct.get(i).getId()) {
                listProduct.remove(listProduct.get(i));
                break;
            }
        }
    }

    private static void editProduct() {
        disPlayListProduct();
        sc.nextLine();
        System.out.println("Please input id edit information: ");
        int idEdit = sc.nextInt();
        System.out.println("Please value new: ");
        sc.nextLine();
        System.out.println("Enter new Name:");
        String newName = sc.nextLine();
//        sc.nextLine();
        System.out.println("Enter new price:");
        int newPrice = sc.nextInt();
        for (int i = 0; i < listProduct.size(); i++) {
            if (idEdit == listProduct.get(i).getId()) {
                listProduct.get(i).setId(idEdit);
                listProduct.get(i).setName(newName);
                listProduct.get(i).setPrice(newPrice);
                disPlayListProduct();

            }

        }

    }

    private static void addProduct() {
        sc.nextLine();
        System.out.println("Enter id");
        int idProduct = sc.nextInt();
        sc.nextLine();
        System.out.println("Please input name: ");
        String nameProduct = sc.nextLine();

        System.out.println("Enter price");
        int productPrice = sc.nextInt();
        Product product = new Product(idProduct, nameProduct, productPrice);
        listProduct.add(product);
        System.out.println("Add complete!!!......");

    }
}
