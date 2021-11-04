package case_study.service.impl;

import case_study.models.Customer;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.service.FacilityService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FacilityServiceImp implements FacilityService {
    Scanner scanner = new Scanner(System.in);
    CheckInputImp checkInput = new CheckInputImp();
    public static List<Villa> villaList = new ArrayList<>();
    public static List<House> houseList = new ArrayList<>();
    public static List<Room> roomList = new ArrayList<>();
    ReadWriteFile readWrite = new ReadWriteFile();

    @Override
    public void addVilla() {
        System.out.print("Nhập tên dịch vụ : ");
        String nameService = scanner.nextLine();
        int usebleArea = checkInput.checkUsebleArea();
        int rentCost = checkInput.checkRentCost();
        int maxOfPeople = checkInput.checkMaxOfPeople();
        System.out.print("Nhập kiểu thuê : ");
        String rentalType = scanner.nextLine();
        System.out.print("Nhập tiêu chuẩn phòng : ");
        String roomStandard = scanner.nextLine();
        int poolArea = checkInput.checkPoolArea();
        int numbersOfFloors = checkInput.checkNumbersOfFloors();
        Villa villa = new Villa(nameService, usebleArea, rentCost, maxOfPeople, rentalType, roomStandard, poolArea, numbersOfFloors);
        villaList.add(villa);
        readWrite.writeVilla(villa);

    }

    @Override
    public void addHouse() {
        System.out.print("Nhập tên dịch vụ : ");
        String nameService = scanner.nextLine();
        int usebleArea = checkInput.checkUsebleArea();
        int rentCost = checkInput.checkRentCost();
        int maxOfPeople = checkInput.checkMaxOfPeople();
        System.out.print("Nhập kiểu thuê : ");
        String rentalType = scanner.nextLine();
        System.out.print("Nhập tiêu chuẩn phòng : ");
        String roomStandard = scanner.nextLine();
        int numbersOfFloors = checkInput.checkNumbersOfFloors();
        House house = new House(nameService, usebleArea, rentCost, maxOfPeople, rentalType, roomStandard, numbersOfFloors);
        houseList.add(house);
        readWrite.writeHouse(house);
    }

    @Override
    public void addRoom() {
        System.out.print("Nhập tên dịch vụ : ");
        String nameService = scanner.nextLine();
        int usebleArea = checkInput.checkUsebleArea();
        int rentCost = checkInput.checkRentCost();
        int maxOfPeople = checkInput.checkMaxOfPeople();
        System.out.print("Nhập kiểu thuê : ");
        String rentalType = scanner.nextLine();
        System.out.print("Nhập dịch vụ miễn phí đi kèm : ");
        String freeService = scanner.nextLine();
        Room room = new Room(nameService, usebleArea, rentCost, maxOfPeople, rentalType, freeService);
        roomList.add(room);
        readWrite.writeRoom(room);
    }

    @Override
    public void display() {
        for(Villa villa : villaList){
            System.out.println(villa.toString());
        }
        showVilla();
        for(House house : houseList){
            System.out.println(house.toString());
        }
        showHouse();
        for(Room room : roomList){
            System.out.println(room.toString());
        }
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
