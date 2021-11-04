package case_study.models;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String nameService, int usableArea, int rentCost, int maxOfPeople, String rentalType, String freeService) {
        super(nameService, usableArea, rentCost, maxOfPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return super.toString() +
                "," + freeService;
    }
}
