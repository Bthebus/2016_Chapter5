package za.ac.cput.Prototype.impl;

import za.ac.cput.Prototype.Prototype;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-27
 */
public class Employee implements Prototype{

    private String name;
    private String surname;
    private String IDNumber;
    private String taxNumber;
    private int employeeNumber;

    public Employee(String name, String surname, String IDNumber, String taxNumber, int employeeNumber) {
        this.name = name;
        this.surname = surname;
        this.IDNumber = IDNumber;
        this.taxNumber = taxNumber;
        this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getIDNumber() {
        return IDNumber;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    @Override
    public Prototype doClone() {
        return new Employee(name, surname,IDNumber,taxNumber,employeeNumber);
    }

    @Override
    public String toString() {
        return "Name: "+name+"\nSurname: "+surname+"\nId Number: "+IDNumber+"\nTax Number: "+taxNumber+"\nEmployeeNumber: "+employeeNumber;
    }
}
