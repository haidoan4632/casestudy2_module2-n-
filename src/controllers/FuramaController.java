package controllers;

import java.util.Scanner;

public class FuramaController {
    public void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        String choose;
        int menu;
        do {
            System.out.println("Display Main Menu:");
            System.out.println("1. Employee Management: ");
            System.out.println("2. Customer Management: ");
            System.out.println("3. Facility Management: ");
            System.out.println("4. Booking Management: ");
            System.out.println("5. Promotion Management: ");
            System.out.println("6.Exit");
            menu = Integer.parseInt(scanner.nextLine());
            switch (menu) {
                case 1:
                    EmployeeManagement employeeManagement = new EmployeeManagement();
                    employeeManagement.employeeDisplayMenu();
                    break;
                case 2:
                    CustomerManagement customerManagement = new CustomerManagement();
                    customerManagement.customerDisplayMenu();
                    break;
                case 3:
                    FacilityManagement facilityManagement = new FacilityManagement();
                    facilityManagement.FacilityDisplayMenu();
                    break;
                case 4:
                    BookingManagement bookingManagement = new BookingManagement();
                    bookingManagement.bookingDisplayMenu();
                    break;
                case 5:
                    PromotionManagement promotionManagement = new PromotionManagement();
                    promotionManagement.promotionDisplayMenu();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Bạn cần nhập yêu cầu chính xác: ");
                    break;
            }
        }
        while (true);
    }
}

