package case_study.service.impl;

import case_study.models.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    private static List<Employee> empList = new ArrayList<>();
    private static List<Customer> custList = new ArrayList<>();
    private static List<Villa> villaList = new ArrayList<>();
    private static List<House> houseList = new ArrayList<>();
    private static List<Room> roomList = new ArrayList<>();

    public void writeEmployee(Employee employee) {
        try {
            FileWriter fileWriter = new FileWriter("src/case_study/data/employee.csv");
            BufferedWriter bufferedWr = new BufferedWriter(fileWriter);
            bufferedWr.write(employee.toString());
            bufferedWr.newLine();
            bufferedWr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeCustomer(Customer customer){
        try {
            FileWriter fileWriter = new FileWriter("src/case_study/data/customer.csv");
            BufferedWriter bufferedWr = new BufferedWriter(fileWriter);
            bufferedWr.write(customer.toString());
            bufferedWr.newLine();
            bufferedWr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeVilla(Villa villa){
        try {
            FileWriter fileWriter = new FileWriter("src/case_study/data/villa.csv");
            BufferedWriter bufferedWr = new BufferedWriter(fileWriter);
            bufferedWr.write(villa.toString());
            bufferedWr.newLine();
            bufferedWr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeHouse(House house) {
        try {
            FileWriter fileWriter = new FileWriter("src/case_study/data/house.csv");
            BufferedWriter bufferedWr = new BufferedWriter(fileWriter);
            bufferedWr.write(house.toString());
            bufferedWr.newLine();
            bufferedWr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeRoom(Room room) {
        try {
            FileWriter fileWriter = new FileWriter("src/case_study/data/room.csv");
            BufferedWriter bufferedWr = new BufferedWriter(fileWriter);
            bufferedWr.write(room.toString());
            bufferedWr.newLine();
            bufferedWr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List readCustomer(){
        try {
            FileReader fileReader = new FileReader("src/case_study/data/employee.csv");
            BufferedReader bufferRd = new BufferedReader(fileReader);
            String line;
            while ((line = bufferRd.readLine()) != null) {
                String[] cust = line.split(",");
                Customer cust1 = new Customer(Integer.parseInt(cust[0]),cust[1],Integer.parseInt(cust[2]),cust[3],Integer.parseInt(cust[4]),Integer.parseInt(cust[5]),cust[6],cust[7],cust[8]);
                custList.add(cust1);
            }
            bufferRd.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return custList;
    }
    public List readEmployee() {
      try {
            FileReader fileReader = new FileReader("src/case_study/data/employee.csv");
            BufferedReader bufferRd = new BufferedReader(fileReader);
            String line;
            while ((line = bufferRd.readLine()) != null) {
                String[] empl = line.split(",");
                Employee empl1 = new Employee(Integer.parseInt(empl[0]),empl[1],Integer.parseInt(empl[2]),empl[3],Integer.parseInt(empl[4]),Integer.parseInt(empl[5]),empl[6],empl[7],empl[8],Integer.parseInt(empl[9]));
                empList.add(empl1);
            }
            bufferRd.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return empList;
    }

    public List readVilla(){
        try {
            FileReader fileReader = new FileReader("src/case_study/data/villa.csv");
            BufferedReader bufferRd = new BufferedReader(fileReader);
            String line;
            while ((line = bufferRd.readLine()) != null) {
                String[] villa = line.split(",");
                Villa villa1 = new Villa(villa[0],Integer.parseInt(villa[1]),Integer.parseInt(villa[2]),Integer.parseInt(villa[3]),villa[4],villa[5],Integer.parseInt(villa[6]),Integer.parseInt(villa[7]));
                villaList.add(villa1);
            }
            bufferRd.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villaList;
    }

    public List readHouse(){
        try {
            FileReader fileReader = new FileReader("src/case_study/data/house.csv");
            BufferedReader bufferRd = new BufferedReader(fileReader);
            String line;
            while ((line = bufferRd.readLine()) != null) {
                String[] house = line.split(",");
                House house1 = new House(house[0],Integer.parseInt(house[1]),Integer.parseInt(house[2]),Integer.parseInt(house[3]),house[4],house[5],Integer.parseInt(house[6]));
                houseList.add(house1);
            }
            bufferRd.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return houseList;
    }

    public List readRoom(){
        try {
            FileReader fileReader = new FileReader("src/case_study/data/room.csv");
            BufferedReader bufferRd = new BufferedReader(fileReader);
            String line;
            while ((line = bufferRd.readLine()) != null) {
                String[] room = line.split(",");
                Room room1 = new Room(room[0],Integer.parseInt(room[1]),Integer.parseInt(room[2]),Integer.parseInt(room[3]),room[4],room[5]);
                roomList.add(room1);
            }
            bufferRd.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return roomList;
    }

}
