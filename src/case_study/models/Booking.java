package case_study.models;

public class Booking {
    private String idBooking;
    private int startDay;
    private int endDay;
    private int idCustomer;
    private String nameService;
    private String typeOfService;

    public Booking() {
    }

    public Booking(String idBooking, int startDay, int endDay, int idCustomer, String nameService, String typeOfService) {
        this.idBooking = idBooking;
        this.startDay = startDay;
        this.endDay = endDay;
        this.idCustomer = idCustomer;
        this.nameService = nameService;
        this.typeOfService = typeOfService;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public int getStartDay() {
        return startDay;
    }

    public void setStartDay(int startDay) {
        this.startDay = startDay;
    }

    public int getEndDay() {
        return endDay;
    }

    public void setEndDay(int endDay) {
        this.endDay = endDay;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking=" + idBooking +
                ", startDay=" + startDay +
                ", endDay=" + endDay +
                ", idCustomer=" + idCustomer +
                ", nameService='" + nameService + '\'' +
                ", typeOfService='" + typeOfService + '\'' +
                '}';
    }
}
