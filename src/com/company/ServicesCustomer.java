package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ServicesCustomer implements ICustomer {

    public void Sort(ArrayList<Customer> customers){
        Collections.sort(customers, new CustomerNameComparator());
    }

    public void InputList(ArrayList<Customer> customers, int size) {
        for (int i = 0; i < size; i++) {
            customers.add(new Customer(i + 1, "lastName" + i, "firstName" + i,
                    "patronymicName" + i, "address" + i, generateRandomNumberList(),
                    "bankAccountNumber" + i));
        }
        customers.add(new Customer(6, "lastName"+3, "firstName" ,
                "patronymicName", "address"  , generateRandomNumberList() ,
                "bankAccountNumber" ));
    }

    public void OutputList(ArrayList<Customer> customers) {
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i).toString());
        }
    }

    public void OutputListWhereLastName(ArrayList<Customer> customers, String last_Name) {
        for (Customer i : customers) {
            if (i.getLastName().equals(last_Name)) {
                System.out.println(i.toString());
            }
        }
    }

    private static long generateRandomNumberList()
    {
        return rnd(1000000000000000L, 9999999999999999L);
    }
    private static long rnd(long min, long max)
    {
        max -= min;
        return (long) (Math.random() * ++max) + min;
    }
}
