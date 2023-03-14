package service.impl;

import model.person.Customer;
import repository.ICustomerRepository;
import repository.impl.CustomerRepository;
import service.ICustomerService;

import java.util.Scanner;

public class CustomerService implements ICustomerService {
    ICustomerRepository customerRepository = new CustomerRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        customerRepository.display();
    }

    @Override
    public void add() {
        System.out.println("Nhập thông tin khách hàng: ");
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
        System.out.println("Nhập mã khách hàng: ");
        String customerCode = scanner.nextLine();
        System.out.println("Nhập loại khách hàng: ");
        String customerType = scanner.nextLine();
        System.out.println("Nhập địa chỉ khách hàng: ");
        String address = scanner.nextLine();
        customerRepository.add(new Customer(name,dateOfBirth,gender,idCard,phoneNumber,email,customerCode,customerType,address));
    }

    @Override
    public void edit() {
        System.out.println("Chỉnh sửa thông tin khách hàng: ");
        System.out.println("Nhập mã khách hàng: ");
        String customerCode = scanner.nextLine();
        Boolean result = customerRepository.findCode(customerCode);
        if (result == false){
            System.out.println("Mã không tồn tại ");
        }else {
            System.out.println("Nhập thông tin khách hàng: ");
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
            System.out.println("Nhập loại khách hàng: ");
            String customerType = scanner.nextLine();
            System.out.println("Nhập địa chỉ khách hàng: ");
            String address = scanner.nextLine();
            customerRepository.edit(new Customer(name,dateOfBirth,gender,idCard,phoneNumber,email,customerCode,customerType,address));
        }
    }
}
