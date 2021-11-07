package case_study.service.impl;
import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.service.FacilityService;

import java.util.*;

public class FacilityServiceImp implements FacilityService {
    Map<Facility, Integer> faciList;
    public FacilityServiceImp() {
        faciList = new LinkedHashMap<>();
    }

    public FacilityServiceImp(Map<Facility, Integer> facilityList) {
        this.faciList = facilityList;
    }

    Scanner scanner = new Scanner(System.in);
    CheckInputImp checkInput = new CheckInputImp();
    ReadWriteFile readWrite = new ReadWriteFile();

    @Override
    public void addVilla() {
        System.out.print("Nhập tên dịch vụ : ");
        String nameService = checkInput.checkNameService();
        int usebleArea = checkInput.checkUsebleArea();
        int rentCost = checkInput.checkRentCost();
        int maxOfPeople = checkInput.checkMaxOfPeople();
        System.out.print("Nhập kiểu thuê : ");
        String rentalType = checkInput.checkRentalType();
        System.out.print("Nhập tiêu chuẩn phòng : ");
        String roomStandard = checkInput.checkRoomStandard();
        int poolArea = checkInput.checkPoolArea();
        int numbersOfFloors = checkInput.checkNumbersOfFloors();
        Villa villa = new Villa(nameService, usebleArea, rentCost, maxOfPeople, rentalType, roomStandard, poolArea, numbersOfFloors);
        faciList.put(villa,0);
        readWrite.writeVilla(villa);

    }

    @Override
    public void addHouse() {
        System.out.print("Nhập tên dịch vụ : ");
        String nameService = checkInput.checkNameService();
        int usebleArea = checkInput.checkUsebleArea();
        int rentCost = checkInput.checkRentCost();
        int maxOfPeople = checkInput.checkMaxOfPeople();
        System.out.print("Nhập kiểu thuê : ");
        String rentalType = checkInput.checkRentalType();
        System.out.print("Nhập tiêu chuẩn phòng : ");
        String roomStandard = checkInput.checkRentalType();
        int numbersOfFloors = checkInput.checkNumbersOfFloors();
        House house = new House(nameService, usebleArea, rentCost, maxOfPeople, rentalType, roomStandard, numbersOfFloors);
        faciList.put(house,0);
        readWrite.writeHouse(house);
    }

    @Override
    public void addRoom() {
        System.out.print("Nhập tên dịch vụ : ");
        String nameService = checkInput.checkNameService();
        int usebleArea = checkInput.checkUsebleArea();
        int rentCost = checkInput.checkRentCost();
        int maxOfPeople = checkInput.checkMaxOfPeople();
        System.out.print("Nhập kiểu thuê : ");
        String rentalType = checkInput.checkRentalType();
        System.out.print("Nhập dịch vụ miễn phí đi kèm : ");
        String freeService = scanner.nextLine();
        Room room = new Room(nameService, usebleArea, rentCost, maxOfPeople, rentalType, freeService);
        faciList.put(room,0);
        readWrite.writeRoom(room);
    }

    @Override
    public void displayMaintenanceFacility() {

    }

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> facility : faciList.entrySet()) {
            System.out.println(facility.getKey().toString());
        }
        showVilla();
        showHouse();
        showRoom();
    }

    public void showVilla(){
        List<Villa> villaList;
        villaList = readWrite.readVilla();
        for (int i = 0; i < villaList.size(); i++) {
            System.out.println(villaList.get(i));
        }
    }

    public void showHouse(){
        List<House> houseList;
        houseList = readWrite.readHouse();
        for (int i = 0; i < houseList.size(); i++) {
            System.out.println(houseList.get(i));
        }
    }

    public void showRoom(){
        List<Room> roomList;
        roomList = readWrite.readRoom();
        for (int i = 0; i < roomList.size(); i++) {
            System.out.println(roomList.get(i));
        }
    }

    @Override
    public void add() {

    }

    @Override
    public void edit() {

    }
}
