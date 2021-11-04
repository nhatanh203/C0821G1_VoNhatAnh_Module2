package case_study.models;

public abstract class Facility {
    private String nameService;
    private int usableArea;
    private int rentCost;
    private int maxOfPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String nameService, int usableArea, int rentCost, int maxOfPeople, String rentalType) {
        this.nameService = nameService;
        this.usableArea = usableArea;
        this.rentCost = rentCost;
        this.maxOfPeople = maxOfPeople;
        this.rentalType = rentalType;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public int getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(int usableArea) {
        this.usableArea = usableArea;
    }

    public int getRentCost() {
        return rentCost;
    }

    public void setRentCost(int rentCost) {
        this.rentCost = rentCost;
    }

    public int getMaxOfPeople() {
        return maxOfPeople;
    }

    public void setMaxOfPeople(int maxOfPeople) {
        this.maxOfPeople = maxOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return nameService + ','  + usableArea + ','  + rentCost + ','  + maxOfPeople + ','  + rentalType;
    }
}
