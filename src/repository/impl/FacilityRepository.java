package repository.impl;

import common.ReadWriteHouse;
import common.ReadWriteRoom;
import common.ReadWriteVilla;
import model.facility.Facility;
import model.facility.House;
import model.facility.Room;
import model.facility.Villa;
import repository.IFacilityRepository;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityRepository implements IFacilityRepository {
    static Map<Room, Integer> roomIntegerLinkedHashMap = new LinkedHashMap<>();
    static Map<Villa, Integer> villaIntegerLinkedHashMap = new LinkedHashMap<>();
    static Map<House, Integer> houseIntegerLinkedHashMap = new LinkedHashMap<>();
    public static ReadWriteRoom readWriteRoom = new ReadWriteRoom();
    public static ReadWriteVilla readWriteVilla = new ReadWriteVilla();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        int select;
        do {
            System.out.println("Input service: ");
            System.out.println("1. Room: ");
            System.out.println("2. House: ");
            System.out.println("3. Villa: ");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    roomIntegerLinkedHashMap = ReadWriteRoom.readRoomFacility();
                    System.out.println(roomIntegerLinkedHashMap);
                    break;
                case 2:
                    houseIntegerLinkedHashMap = ReadWriteHouse.readHouseFacility();
                    System.out.println(houseIntegerLinkedHashMap);
                    break;
                case 3:
                    villaIntegerLinkedHashMap = ReadWriteVilla.readVillaFacility();
                    System.out.println(villaIntegerLinkedHashMap);
                    break;
                default:
                    return;
            }
        }
        while (true);
    }

    @Override
    public void addRoom(Room room) {
        roomIntegerLinkedHashMap = ReadWriteRoom.readRoomFacility();
        roomIntegerLinkedHashMap.put(room, 0);
        ReadWriteRoom.writeRoomFacility(roomIntegerLinkedHashMap);
    }

    @Override
    public void addHouse(House house) {
        houseIntegerLinkedHashMap.put(house, 0);
        houseIntegerLinkedHashMap = ReadWriteHouse.readHouseFacility();
        ReadWriteHouse.writeRoomFacility(houseIntegerLinkedHashMap);
    }

    @Override
    public void addVilla(Villa villa) {
        villaIntegerLinkedHashMap.put(villa, 0);
        villaIntegerLinkedHashMap = ReadWriteVilla.readVillaFacility();
        ReadWriteVilla.writeVillaFacility(villaIntegerLinkedHashMap);
    }

    @Override
    public void maintenance() {
        do {
            System.out.println("Chọn dịch vụ bảo trì: ");
            System.out.println("1.Room");
            System.out.println("2.Villa");
            System.out.println("3.House");
            int select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    for (Map.Entry<Room, Integer> roomFacilityIntegerEntry : roomIntegerLinkedHashMap.entrySet()) {
                        if (roomFacilityIntegerEntry.getValue() >= 5) {
                            System.out.println(roomFacilityIntegerEntry.getKey() + ":" + roomFacilityIntegerEntry.getValue());
                        }
                    }
                    break;
                case 2:
                    for (Map.Entry<Villa, Integer> villaIntegerEntry : villaIntegerLinkedHashMap.entrySet()) {
                        if (villaIntegerEntry.getValue() >= 5) {
                            System.out.println(villaIntegerEntry.getKey() + ":" + villaIntegerEntry.getValue());
                        }
                    }
                    break;
                case 3:
                    for (Map.Entry<House, Integer> houseIntegerEntry : houseIntegerLinkedHashMap.entrySet()) {
                        if (houseIntegerEntry.getValue() >= 5) {
                            System.out.println(houseIntegerEntry.getKey() + ":" + houseIntegerEntry.getValue());
                        }
                    }
                    break;
                default:
                    return;
            }
        } while (true);
    }
}
