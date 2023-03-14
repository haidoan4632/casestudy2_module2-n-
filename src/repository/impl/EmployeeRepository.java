package repository.impl;

import common.ReadFile;
import common.WriteFile;
import model.person.Employee;
import repository.IEmployeeRepository;

import java.util.ArrayList;
import java.util.List;

import static common.WriteFile.*;

public class EmployeeRepository implements IEmployeeRepository {
    public static final String EMPLOYEE_PATH = "src\\data\\employee.csv";
    static List<Employee> employeeList = new ArrayList<>();
    public static ReadFile readFile = new ReadFile();


    public List<Employee> getALl() {
        List<String> stringList = ReadFile.read("src\\data\\employee.csv");
        List<Employee> employeeList = new ArrayList<>();
        for (String str : stringList) {
            String[] temp = str.split(",");
            Employee employee = new Employee(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8], temp[9]);
            employeeList.add(employee);
        }
        return employeeList;

    }

    @Override
    public Boolean findCode(String code) {
        List<Employee> result = getALl();
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i).getEmployeeCode().equals(code)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void display() {
        List<Employee> result = getALl();
        for (Employee employee1 : result) {
            System.out.println(employee1);
        }
    }

    @Override
    public void add(Employee employee) {
        String str = toCSV(employee);
        List<String> stringList = ReadFile.read("src\\data\\employee.csv");
        stringList.add(str);
        try {
            write("src\\data\\employee.csv", stringList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String toCSV(Employee employee) {
        return employee.getName() + "," + employee.getDateOfBirth() + "," + employee.getGender() + "," + employee.getIdCard() + "," + employee.getPhoneNumber() + "," + employee.getEmail() + "," + employee.getEmployeeCode() + "," + employee.getDegree() + "," + employee.getPosition() + "," + employee.getSalary();
    }


    @Override
    public void edit(Employee employee) {
        List<Employee> result = getALl();
        for (int i = 0; i <result.size();i++){
            if (result.get(i).getEmployeeCode().equals(employee.getEmployeeCode())){
                result.set(i,employee);
            }
        }
        List<String> stringList = new ArrayList<>();
        System.out.println(result);  
    }
}
