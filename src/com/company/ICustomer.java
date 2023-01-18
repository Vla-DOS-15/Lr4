package com.company;

import java.util.ArrayList;

public interface ICustomer {
    void InputList(ArrayList<Customer> customers, int size);
    void OutputList(ArrayList<Customer> customers);
    void OutputListWhereLastName(ArrayList<Customer> customers, String last_Name);
    void Sort(ArrayList<Customer> customers);
}
