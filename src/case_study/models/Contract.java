package case_study.models;

public class Contract {
    private int numOfContract;
    private int idBooking;
    private int advanceDepositAmount;
    private int totalPayment;
    private int idCustomer;

    public Contract() {
    }

    public Contract(int numOfContract, int idBooking, int advanceDepositAmount, int totalPayment, int idCustomer) {
        this.numOfContract = numOfContract;
        this.idBooking = idBooking;
        this.advanceDepositAmount = advanceDepositAmount;
        this.totalPayment = totalPayment;
        this.idCustomer = idCustomer;
    }

    public int getNumOfContract() {
        return numOfContract;
    }

    public void setNumOfContract(int numOfContract) {
        this.numOfContract = numOfContract;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public int getAdvanceDepositAmount() {
        return advanceDepositAmount;
    }

    public void setAdvanceDepositAmount(int advanceDepositAmount) {
        this.advanceDepositAmount = advanceDepositAmount;
    }

    public int getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(int totalPayment) {
        this.totalPayment = totalPayment;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "numOfContract=" + numOfContract +
                ", idBooking=" + idBooking +
                ", advanceDepositAmount=" + advanceDepositAmount +
                ", totalPayment=" + totalPayment +
                ", idCustomer=" + idCustomer +
                '}';
    }
}
