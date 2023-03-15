package common;

import model.facility.House;
import model.facility.Room;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadWriteHouse {
    public static final String HOUSE_CSV = "src\\data\\house.csv";

    public static Map<House, Integer> readHouseFacility() {
        Map<House, Integer> roomIntegerMap = new LinkedHashMap<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(HOUSE_CSV);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            House house;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                String serviceCode = temp[0];
                String serviceName = temp[1];
                String usableArea = temp[2];
                String rentalCost = temp[3];
                String maxNumberOfPeople = temp[4];
                String rentalType = temp[5];
                String roomStandard = temp[6];
                String numberOfFloor = temp[7];
                String key = temp[8];
                house = new House(serviceCode,serviceName,usableArea,rentalCost,maxNumberOfPeople,rentalType,roomStandard,numberOfFloor);
                roomIntegerMap.put(house,Integer.parseInt(temp[8]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return roomIntegerMap;
    }

    public static void writeRoomFacility(Map<House, Integer> houseIntegerMap) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(HOUSE_CSV);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (House i : houseIntegerMap.keySet()) {
                bufferedWriter.write(i + "," + houseIntegerMap.get(i));
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
