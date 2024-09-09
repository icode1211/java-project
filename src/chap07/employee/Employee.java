package chap07.employee;

/**
 * 일반 클래스 Employee
 */
public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    double calculateSalary() {
        return 0;
    }
}
