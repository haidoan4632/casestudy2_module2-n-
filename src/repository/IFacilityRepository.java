package repository;

import model.facility.Facility;
import model.facility.House;
import model.facility.Room;
import model.facility.Villa;

import java.util.Map;

public interface IFacilityRepository {
    void display();

    void addRoom(Room room);

    void addHouse(House house);

    void addVilla(Villa villa);

    void maintenance();
}

