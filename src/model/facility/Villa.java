package model.facility;

public class Villa extends Facility {
    private String roomStandard; //tiêu chuẩn phòng
    private String swimmingArea; //diện tích hồ bơi
    private String numberOfFloors; //số tầng

    public Villa() {
    }
    public Villa(String serviceCode, String serviceName, String usableArea, String rentalCost, String maxNumberOfPeople, String rentalType, String roomStandard, String swimmingArea, String numberOfFloors) {
        super(serviceCode, serviceName, usableArea, rentalCost, maxNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.swimmingArea = swimmingArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getSwimmingArea() {
        return swimmingArea;
    }

    public void setSwimmingArea(String swimmingArea) {
        this.swimmingArea = swimmingArea;
    }

    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "{ Villa" +
                "roomStandard='" + roomStandard + '\'' +
                ", swimmingArea='" + swimmingArea + '\'' +
                ", numberOfFloors='" + numberOfFloors + '\'' +
                super.toString() +"} ";
    }
}
