package common;

import model.facility.Villa;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadWriteVilla {
    public static final String VILLA_CSV = "src\\data\\villa.csv";

    public static Map<Villa, Integer> readVillaFacility() {
        Map<Villa, Integer> villaIntegerMap = new LinkedHashMap<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(VILLA_CSV);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Villa villa;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                String serviceCode = temp[0];
                String serviceName = temp[1];
                String usableArea = temp[2];
                String rentalCost = temp[3];
                String maxNumberOfPeople = temp[4];
                String rentalType = temp[5];
                String roomStandard = temp[6];
                String swimmingArea = temp[7];
                String numberOfFloors = temp[8];
                String key = temp[9];
                villa = new Villa(serviceCode, serviceName, usableArea, rentalCost, maxNumberOfPeople, rentalType, roomStandard, swimmingArea, numberOfFloors);
                villaIntegerMap.put(villa, Integer.parseInt(temp[9]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villaIntegerMap;
    }

    public static void writeVillaFacility(Map<Villa, Integer> villaIntegerMap) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(VILLA_CSV);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Villa i : villaIntegerMap.keySet()) {
                bufferedWriter.write(i + "," + villaIntegerMap.get(i));
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
