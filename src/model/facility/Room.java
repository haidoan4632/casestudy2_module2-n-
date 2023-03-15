package model.facility;

public class Room extends Facility {
    private String freeServiceIncluded; //dịch vụ miễn phí đi kèm

    public Room() {
    }
    public Room(String serviceCode, String serviceName, String usableArea, String rentalCost, String maxNumberOfPeople, String rentalType, String freeServiceIncluded) {
        super(serviceCode, serviceName, usableArea, rentalCost, maxNumberOfPeople, rentalType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return
                "{" + "Room" +
                        "freeServiceIncluded='" + freeServiceIncluded + '\'' +
                        super.toString() + "} ";
    }
}
