/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution, Exercise 39
 *  Copyright 2021 Mayank Goyal
 */

package ex39;

import java.util.TreeMap;
import java.util.*;

public class Employee
{
    static TreeMap<Integer, Employee> employees = new TreeMap<>();

    private String firstName;
    private String lastName;
    private String position;
    private String separationDate;

    public Employee(String firstName, String lastName, String position, String separationDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.separationDate = separationDate;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public String getSeparationDate() { return separationDate; }
    public void setSeparationDate(String separationDate) { this.separationDate = separationDate; }

    @Override
    public String toString() {
        return "Employee[ " + "firstName=" + firstName + ", lasstName=" + lastName
                + ", position=" + position + ", separationDate=" + separationDate + " ]";
    }

    public static Map<Integer, Employee> SortEmployees()
    {
        Map<Integer, Employee> sorted = new TreeMap<>(Comparator.comparing(s -> employees.get(s).getLastName()));
        sorted.putAll(employees);
        return sorted;
    }
}
