package A00PreviousExams.cafe;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cafe {

    private List<Employee> employees;
    private String name;
    private int capacity;

    public Cafe(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.employees = new ArrayList<>();
    }


    public void addEmployee(Employee employee) {
        if (this.employees.size() + 1 <= this.capacity) {
            employees.add(employee);

        }

    }

    public boolean removeEmployee(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                this.employees.remove(employee);
                return true;
            }
        }
        return false;

    }

    public Employee getOldestEmployee() {
        return this.employees.stream()
                .sorted((c1, c2) -> Integer.compare(c2.getAge(), c1.getAge()))
                .collect(Collectors.toList())
                .get(0);

    }

    public Employee getEmployee(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }
        return null;
    }

    public int getCount() {
        return this.employees.size();
    }

    public String report() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Employees working at Cafe %s:", this.name));
        for (Employee employee : employees) {
            sb.append(System.lineSeparator());
            sb.append(employee);

        }
        return sb.toString();
    }

}
