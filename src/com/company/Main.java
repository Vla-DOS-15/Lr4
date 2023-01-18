package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = 5;
        ArrayList<Customer> customers = new ArrayList<Customer>();
        ServicesCustomer servicesCustomer = new ServicesCustomer();
        servicesCustomer.InputList(customers, size);
        System.out.println("Output List:\n");
        servicesCustomer.OutputList(customers);

        servicesCustomer.Sort(customers);
        System.out.println("Output Sort List:\n");
        servicesCustomer.OutputList(customers);
        System.out.println("Input last name: ");
        String lastName = in.nextLine();
        servicesCustomer.OutputListWhereLastName(customers, lastName);

    }
}
