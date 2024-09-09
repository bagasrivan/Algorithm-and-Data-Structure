package Praktikum8;

import java.util.*;

public class Case8InterfaceExample {
    public static void main(String[] args) {
        Case8ClassExample container = new Case8ClassExample();

        container.addData("Name", "John Doe");
        container.addData("Age", 30);
        container.addData("IsStudent", true);
        container.addData("GPA", 3.75);

        System.out.println("Data for 'Name': " + container.getData("Name"));
        System.out.println("Data for 'Age': " + container.getData("Age"));
        System.out.println("Contains key 'IsStudent'? " + container.containsKey("IsStudent"));

        container.removeData("GPA");

        System.out.println("All Data:");
        container.displayAllData();
    }
}
