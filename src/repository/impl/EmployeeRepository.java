package repository.impl;

import common.ReadFile;
import model.person.Employee;
import repository.IEmployeeRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    public static final String EMPLOYEE_PATH = "src\\data\\employee.csv";
    static List<Employee> employeeList = new ArrayList<>();
    public static ReadFile readFile = new ReadFile();

    @Override
    public void display() {
        List<String> stringList = ReadFile.read(EMPLOYEE_PATH);
        for (String s: stringList){
            String[] temp = s.split(",");
            Employee employee = new Employee();
            employeeList.add(employee);
        }
        for (Employee employee:employeeList){
            System.out.println(employee);
        }
    }

    @Override
    public void add(Employee employee) {

    }

    @Override
    public void edit(String code) {

    }
}
