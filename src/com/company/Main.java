package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

class Employee{
    public String name;
    public  String department;

    Employee(String name,String department){
        this.name=name;
        this.department=department;
    }
}

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> employees=new ArrayList<Employee>();
        employees.add(new Employee("ravi","tech"));
        employees.add(new Employee("vijay","service"));
        employees.add(new Employee("Ram","tech"));


        HashSet<String> set=new HashSet();
        employees.forEach(employee -> set.add(employee.department));
        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
