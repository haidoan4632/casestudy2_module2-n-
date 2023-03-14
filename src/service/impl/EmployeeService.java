package service.impl;

import model.person.Employee;
import repository.IEmployeeRepository;
import repository.impl.EmployeeRepository;
import service.IEmployeeService;

import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    IEmployeeRepository employeeRepository = new EmployeeRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        employeeRepository.display();
    }

    @Override
    public void add() {
        System.out.println("Nhập thông tin nhân viên: ");
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày tháng năm sinh: ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Nhập giới tính: ");
        String gender = scanner.nextLine();
        System.out.println("Nhập idCard: ");
        String  idCard = scanner.nextLine();
        System.out.println("Nhập phone: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Nhập email: ");
        String email = scanner.nextLine();
        System.out.println("Nhập mã nhân viên: ");
        String employeeCode = scanner.nextLine();
        System.out.println("Nhập bằng cấp: ");
        String degree = scanner.nextLine();
        System.out.println("Nhập vị trí làm việc: ");
        String position = scanner.nextLine();
        System.out.println("Nhập lương: ");
        String salary = scanner.nextLine();
        employeeRepository.add(new Employee(name,dateOfBirth,gender,idCard,phoneNumber,email,employeeCode,degree,position,salary));
    }

    @Override
    public void edit() {
        System.out.println("Chỉnh sửa thông tin nhân viên: ");
        System.out.println("Nhập mã nhân viên cần chỉnh sửa: ");
        String employeeCode = scanner.nextLine();
        Boolean result = employeeRepository.findCode(employeeCode);
        if (result == false){
            System.out.println("Mã không tồn tại ");
        }else {
            System.out.println("Nhập tên: ");
            String name = scanner.nextLine();
            System.out.println("Nhập ngày tháng năm sinh: ");
            String dateOfBirth = scanner.nextLine();
            System.out.println("Nhập giới tính: ");
            String gender = scanner.nextLine();
            System.out.println("Nhập idCard: ");
            String  idCard = scanner.nextLine();
            System.out.println("Nhập phone: ");
            String phoneNumber = scanner.nextLine();
            System.out.println("Nhập email: ");
            String email = scanner.nextLine();
            System.out.println("Nhập bằng cấp: ");
            String degree = scanner.nextLine();
            System.out.println("Nhập vị trí làm việc: ");
            String position = scanner.nextLine();
            System.out.println("Nhập lương: ");
            String salary = scanner.nextLine();
            employeeRepository.edit(new Employee(name,dateOfBirth,gender,idCard,phoneNumber,email,employeeCode,degree,position,salary));
        }
    }
}
