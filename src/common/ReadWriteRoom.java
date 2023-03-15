package common;

import model.facility.Room;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadWriteRoom {
    public static final String ROOM_CSV = "src\\data\\room.csv";

    public static Map<Room, Integer> readRoomFacility() {
        Map<Room, Integer> roomIntegerMap = new LinkedHashMap<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(ROOM_CSV);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Room room;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                String serviceCode = temp[0];
                String serviceName = temp[1];
                String usableArea = temp[2];
                String rentalCost = temp[3];
                String maxNumberOfPeople = temp[4];
                String rentalType = temp[5];
                String freeServiceIncluded = temp[6];
                String key = temp[7];
                room = new Room(serviceCode,serviceName, usableArea, rentalCost, maxNumberOfPeople, rentalType, freeServiceIncluded);
                roomIntegerMap.put(room,Integer.parseInt(temp[7]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return roomIntegerMap;
    }

    public static void writeRoomFacility(Map<Room, Integer> roomIntegerMap) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(ROOM_CSV);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Room i : roomIntegerMap.keySet()) {
                bufferedWriter.write(i + "," + roomIntegerMap.get(i));
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
