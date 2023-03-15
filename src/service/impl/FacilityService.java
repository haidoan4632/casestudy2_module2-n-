package service.impl;

import model.facility.House;
import model.facility.Room;
import model.facility.Villa;
import repository.IFacilityRepository;
import repository.impl.FacilityRepository;
import service.IFacilityService;

import java.util.Scanner;

public class FacilityService implements IFacilityService {
    IFacilityRepository facilityRepository = new FacilityRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        facilityRepository.display();
    }

    @Override
    public void addRoom() {
        System.out.println("Nhập thông tin phòng: ");
        System.out.println("Nhập mã phòng: ");
        String roomCode = scanner.nextLine();
        System.out.println("Nhập tên dịch vụ: ");
        String nameService = scanner.nextLine();
        System.out.println("Diện tích sử dụng: ");
        String usableArea = scanner.nextLine();
        System.out.println("Nhập giá cho thuê: ");
        String rentalCost = scanner.nextLine();
        System.out.println("Nhập số người tối đa: ");
        String maxPeople = scanner.nextLine();
        System.out.println("Nhập kiểu thuê: ");
        String rentalType = scanner.nextLine();
        System.out.println("Nhập dịch vụ miễn phí đi kèm: ");
        String freeService = scanner.nextLine();
        System.out.println("Nhập key: ");
        String key = scanner.nextLine();
        Room room = new Room(roomCode,nameService,usableArea,rentalCost,maxPeople,rentalType,freeService);
facilityRepository.addRoom(room);
    }

    @Override
    public void addVilla() {
        System.out.println("Nhập thông tin villa: ");
        System.out.println("Nhập mã phòng: ");
        String roomCode = scanner.nextLine();
        System.out.println("Nhập tên dịch vụ: ");
        String nameService = scanner.nextLine();
        System.out.println("Diện tích sử dụng: ");
        String usableArea = scanner.nextLine();
        System.out.println("Nhập giá cho thuê: ");
        String rentalCost = scanner.nextLine();
        System.out.println("Nhập số người tối đa: ");
        String maxPeople = scanner.nextLine();
        System.out.println("Nhập kiểu thuê: ");
        String rentalType = scanner.nextLine();
        System.out.println("Nhập tiêu chuẩn phòng: ");
        String roomStandard = scanner.nextLine();
        System.out.println("Nhập diện tích hồ bơi: ");
        String swimmingArea = scanner.nextLine();
        System.out.println("Nhập số tầng: ");
        String numberOfFloors = scanner.nextLine();
        System.out.println("Nhập key: ");
        String key = scanner.nextLine();
        Villa villa = new Villa(roomCode,nameService,usableArea,rentalCost,maxPeople,rentalType,roomStandard,swimmingArea,numberOfFloors);
        facilityRepository.addVilla(villa);
    }

    public void addHouse(){
        System.out.println("Nhập thông tin house: ");
        System.out.println("Nhập mã phòng: ");
        String roomCode = scanner.nextLine();
        System.out.println("Nhập tên dịch vụ: ");
        String nameService = scanner.nextLine();
        System.out.println("Diện tích sử dụng: ");
        String usableArea = scanner.nextLine();
        System.out.println("Nhập giá cho thuê: ");
        String rentalCost = scanner.nextLine();
        System.out.println("Nhập số người tối đa: ");
        String maxPeople = scanner.nextLine();
        System.out.println("Nhập kiểu thuê: ");
        String rentalType = scanner.nextLine();
        System.out.println("Nhập tiêu chuẩn phòng: ");
        String roomStandard = scanner.nextLine();
        System.out.println("Nhập số tầng: ");
        String numberOfFloors = scanner.nextLine();
        System.out.println("Nhập key: ");
        String key = scanner.nextLine();
        House house = new House(roomCode,nameService,usableArea,rentalCost,maxPeople,rentalType,roomStandard,numberOfFloors);
        facilityRepository.addHouse(house);
    }

    @Override
    public void maintenance() {
facilityRepository.maintenance();
    }
}
