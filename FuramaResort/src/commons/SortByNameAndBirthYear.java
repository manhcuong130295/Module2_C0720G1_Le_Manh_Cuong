package commons;

import models.Customer;

import java.util.Comparator;

public class SortByNameAndBirthYear implements Comparator<Customer> {

    @Override
    public int compare(Customer customer1, Customer customer2) {
        int result = customer1.getFullName().compareTo(customer2.getFullName());
        if (result == 0) {
            int cusBirthYear1 = Integer.parseInt(customer1.getBirthDay().split("/")[2]);
            int cusBirthYear2 = Integer.parseInt(customer2.getBirthDay().split("/")[2]);
            result=cusBirthYear1-cusBirthYear2;
        }

        return result;
    }
}
