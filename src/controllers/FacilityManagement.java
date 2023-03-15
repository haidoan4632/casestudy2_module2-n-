package controllers;

import service.IFacilityService;
import service.impl.FacilityService;

import java.io.InputStream;
import java.util.Scanner;

public class FacilityManagement {
    public void FacilityDisplayMenu() throws RuntimeException{
        Scanner scanner = new Scanner(System.in);
        IFacilityService facilityService = new FacilityService();
        int choose;
        do {
           try {
               System.out.println("Nhập lựa chọn của bạn: \n" +
                       "1. Hiển thị danh sách dịch vụ: \n" +
                       "2. Thêm mới dịch vụ: \n" +
                       "3. Hiển thị danh sách dịch vụ cần bảo trì: \n" +
                       "4. Trả về menu chính: ");
               choose = Integer.parseInt(scanner.nextLine());
               switch (choose){
                   case 1:
                       facilityService.display();
                   case 2:
                       do {
                           System.out.println("1.Add New Villa: \n"+
                                   "2.Add New Room: \n" +
                                   "3.Back to menu: ");
                           int select = Integer.parseInt(scanner.nextLine());
                           switch (select){
                               case 1:
                                   facilityService.addVilla();
                               case 2:
                                   facilityService.addRoom();
                               case 3:
                                   return;
                               default:
                                   System.out.println("Bạn cần nhập vào 1 số: ");
                           }
                       }while (true);
                   case 3:
                       facilityService.maintenance();
                   case 4:
                       return;
                   default:
                       System.out.println("Bạn cần nhập vào 1 số: ");
               }
           }catch (NumberFormatException e){
               System.out.println("Bạn cần nhập vào 1 số: ");
           }
        }while (true);
    }
}
