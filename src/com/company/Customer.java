package com.company;
import java.util.ArrayList;

public class Customer
{
    private int id;
    private String lastName, firstName, patronymicName, address, bankAccountNumber;
    private long creditCardNumber;
    @Override
    public String toString() {
        return id + " " + lastName + " " + firstName + " " + patronymicName + " " + address +
                " " + creditCardNumber + " " + bankAccountNumber;
    }

    public Customer() {
    }

    public Customer(int id, String lastName, String firstName, String patronymicName,
                    String address, long creditCardNumber, String bankAccountNumber) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymicName = patronymicName;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public Customer(int id, String lastName) {
        this.id = id;
        this.lastName = lastName;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public String getfirstName() {
        return this.firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getpatronymicName() {
        return this.patronymicName;
    }

    public void setpatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public String getaddress() {
        return this.address;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public long getcreditCardNumber() {
        return this.creditCardNumber;
    }

    public void setcreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getbankAccountNumber() {
        return this.bankAccountNumber;
    }

    public void setbankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

}
