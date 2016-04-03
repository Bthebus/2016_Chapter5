package za.ac.cput.Prototype.impl;

import za.ac.cput.Prototype.Prototype;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-27
 */
public class Customer implements Prototype{
    private String name;
    private String surname;
    private String phoneNumber;
    private int age;
    private String dob;
    private int customerID;

    public Customer(String name, String surname, String phoneNumber, int age, String dob, int customerID) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.dob = dob;
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public String getDob() {
        return dob;
    }

    public int getCustomerID() {
        return customerID;
    }

    @Override
    public Prototype doClone() {
        return new Customer(name, surname, phoneNumber, age,dob,customerID);
    }

    @Override
    public String toString() {
        return "Name: "+name+"\nSurname: "+surname+"\nPhone NUmber: "+phoneNumber+"\nAge: "+age+"\nDate Of Birth: "+dob+"\nCustomer ID"+customerID;
    }
}
