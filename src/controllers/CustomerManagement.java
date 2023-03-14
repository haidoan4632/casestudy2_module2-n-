package controllers;

import service.ICustomerService;
import service.IEmployeeService;
import service.impl.CustomerService;
import service.impl.EmployeeService;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class CustomerManagement {
    public void customerDisplayMenu() throws RuntimeException{
        ICustomerService customerService = new CustomerService();
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            try {
                System.out.println("Nhập lựa chọn của bạn: \n" +
                        "1. Hiển thị danh sách  khách hàng: \n" +
                        "2. Thêm mới khách hàng: \n" +
                        "3. Chỉnh sửa thông tin khách hàng: \n" +
                        "4. Trả về menu chính: ");
                choose = parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        customerService.display();
                        break;
                    case 2:
                        customerService.add();
                        break;
                    case 3:
                        customerService.edit();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Bạn cần nhập đúng lựa chọn");
                        break;
                }
            }catch (NumberFormatException e){
                System.out.println("Bạn cần nhập vào 1 số: ");
            }
        } while (true);
    }
}
