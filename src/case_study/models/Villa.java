package case_study.models;

public class Villa extends Facility{
    private String roomStandard;
    private int poolArea;
    private int numbersOfFloors;

    public Villa() {
    }

    public Villa(String nameService, int usableArea, int rentCost, int maxOfPeople, String rentalType, String roomStandard, int poolArea, int numbersOfFloors) {
        super(nameService, usableArea, rentCost, maxOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numbersOfFloors = numbersOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(int poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumbersOfFloors() {
        return numbersOfFloors;
    }

    public void setNumbersOfFloors(int numbersOfFloors) {
        this.numbersOfFloors = numbersOfFloors;
    }

    @Override
    public String toString() {
        return  super.toString() +
                ','  + roomStandard +
                ','  + poolArea +
                ','  + numbersOfFloors ;
    }
}
