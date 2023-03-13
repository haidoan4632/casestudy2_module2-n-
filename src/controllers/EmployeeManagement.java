package controllers;

import service.IEmployeeService;
import service.impl.EmployeeService;

import java.util.Scanner;

public class EmployeeManagement {
    public void employeeDisplayMenu() {
        IEmployeeService employeeService = new EmployeeService();
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("Nhập lựa chọn của bạn: \n" +
                    "1. Hiển thị danh sách nhân viên: \n" +
                    "2. Thêm mới nhân viên: \n" +
                    "3. Chỉnh sửa thông tin nhân viên: \n" +
                    "4. Trả về menu chính: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.add();
                    break;
                case 3:
                    employeeService.edit();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Bạn cần nhập đúng lựa chọn");
                    break;
            }
        } while (true);
    }
}
