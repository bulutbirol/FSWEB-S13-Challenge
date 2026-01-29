package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        runApp();
    }

    public static void runApp() {
        Healthplan hp1 = new Healthplan(1, "Kapsam-1", Plan.BASIC);
        Healthplan hp2 = new Healthplan(2, "Kapsam-2", Plan.PREMIUM);

        System.out.println(hp1.toString());
        System.out.println(hp2.toString());

        Employee emp1 = new Employee(10, "Ali Veli", "ali@company.com", "12345", new String[3]);
        System.out.println(emp1.toString());

        emp1.addHealthPlan(0, hp1.getName());
        emp1.addHealthPlan(0, hp2.getName());
        emp1.addHealthPlan(5, hp2.getName());

        System.out.println(emp1.toString());

        Company company = new Company(100, "WorkinTech", -500, new String[2]);
        System.out.println(company.toString());

        company.addEmployee(0, emp1.getFullName());
        company.addEmployee(0, "Mehmet");
        company.addEmployee(2, "Ayşe");

        System.out.println(company.toString());
    }
}
