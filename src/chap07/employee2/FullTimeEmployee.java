package chap07.employee2;

public class FullTimeEmployee extends Employee {
    double salary;

    FullTimeEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    // 메소드 재정의 (Override)
    @Override
    double calculateSalary() {
        return salary;
    }

}
