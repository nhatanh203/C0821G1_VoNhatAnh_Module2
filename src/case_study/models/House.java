package case_study.models;

public class House extends Facility {
    private String roomStandard;
    private int numbersOfFloors;

    public House() {
    }

    public House(String nameService, int usableArea, int rentCost, int maxOfPeople, String rentalType, String roomStandard, int numbersOfFloors) {
        super(nameService, usableArea, rentCost, maxOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numbersOfFloors = numbersOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
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
                "," + roomStandard +
                "," + numbersOfFloors;
    }
}
