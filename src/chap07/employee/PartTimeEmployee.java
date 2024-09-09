package chap07.employee;

public class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);    // Employee(name) 호출
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // 메소드 재정의 (Override)
    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
