package controllers;

import commons.Validator;
import models.House;
import models.Room;
import models.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static commons.Validator.*;

public class MainControllers {
    private static final String HOUSE_FILE = "D:\\ChuongTrinhCodegym\\Module2_C0720G1_Le_Manh_Cuong\\FuramaResort\\src\\House.csv";
    private static final String VILLA_FILE = "D:\\ChuongTrinhCodegym\\Module2_C0720G1_Le_Manh_Cuong\\FuramaResort\\src\\Villa.csv";
    private static final String ROOM_FILE = "D:\\ChuongTrinhCodegym\\Module2_C0720G1_Le_Manh_Cuong\\FuramaResort\\src\\Room.csv";
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        while (true) {
            System.out.println("1.Add New Services" +
                    "\n2.Show Services" +
                    "\n3.Add New Customer" +
                    "\n4.Show Information of Customer" +
                    "\n5.Add New Booking" +
                    "\n6.Show Information of Employee" +
                    "\n7.Exit");
            try {
                switch (Integer.parseInt(sc.nextLine())) {
                    case 1:
                        addNewService();
                        break;
                    case 2:
                        showService();
                        break;
                    case 3:
                        //search();
                        break;
                    case 7:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("vui lòng chọn từ 1 đến 7");
                }
            } catch (NumberFormatException e) {
                System.out.println("vui lòng nhập số");
            }
        }
    }


    private static void addNewService() {
        while (true) {
            System.out.println("1.Add new villa" +
                    "\n2.Add new House" +
                    "\n3.Add new Room" +
                    "\n4.Back to Menu" +
                    "\n5.Exit");
            try {
                switch (Integer.parseInt(sc.nextLine())) {
                    case 1:
                        addNewVilla();
                        break;
                    case 2:
                        addNewHouse();
                        break;
                    case 3:
                        addNewRoom();
                        break;
                    case 4:
                        displayMainMenu();
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("vui lòng chọn từ 1 đến 5");
                }
            } catch (NumberFormatException e) {

            }
        }
    }


    public static void addNewVilla() {

        try {
            boolean check = false;
            System.out.println("Nhập thông tin của villa ");
            String id;
            do {
                System.out.println("Nhập mã dịch vụ");
                id = sc.nextLine();
                check = regexId(id);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("sai định dạng");
                }
            } while (!check);
            check = false;
            String name;
            do {
                System.out.println("Nhập tên dịch vụ");
                name = sc.nextLine();
                check = regexNameService(name);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("sai định dạng");
                }
            } while (!check);
            check = false;
            String areaOfUse;
            do {
                System.out.println("Nhập diện tích sử dụng");
                areaOfUse = sc.nextLine();
                check = regexAreaOfUse(areaOfUse);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("Sai định dạng");
                }
            } while (!check);
            check = false;
            String rentalCost;
            do {
                System.out.println("Nhập chi phí thuê");
                rentalCost = sc.nextLine();
                check = regexRentalCost(rentalCost);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("sai định dạng");
                }
            } while (!check);
            check = false;
            String maxPeople;
            do {
                System.out.println("Nhập số người tối đa");
                maxPeople = sc.nextLine();
                check = regexMaxPeople(maxPeople);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("sai định dạng");
                }
            } while (!check);
            check = false;
            String rentalType;
            do {
                System.out.println("Kiểu thuê");
                rentalType = sc.nextLine();
                check = regexRentalType(rentalType);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("sai định dạng");
                }
            } while (!check);
            check = false;
            String standardRoomOfVilla;
            do {
                System.out.println("Tiêu chuẩn phòng");
                standardRoomOfVilla = sc.nextLine();
                check = regexStandard(standardRoomOfVilla);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("sai định dạng");
                }
            } while (!check);
            check = false;
            System.out.println("Mô tả tiện nghi khác");
            String anotherConvenient = sc.nextLine();
            String poolArea;
            do {
                System.out.println("Diện tích hồ bơi");
                poolArea = sc.nextLine();
                check = regexPoolArea(poolArea);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("sai định dạng");
                }
            } while (!check);
            check = false;
            String floorOfVilla;
            do {
                System.out.println("Số tầng");
                floorOfVilla = sc.nextLine();
                check = regexFloor(floorOfVilla);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("sai định dạng");
                }
            } while (!check);

            Villa villa = new Villa(id, name, areaOfUse,
                    rentalCost,
                    maxPeople,
                    rentalType,
                    standardRoomOfVilla,
                    anotherConvenient, poolArea
                    , floorOfVilla);
            String line = villa.getId() + "," + villa.getNameService() + "," + villa.getAreaOfUse() + "," + villa.getRentalCost() + "," + villa.getMaxPeople() + "," + villa.getRentalType() + "," + villa.getStandardRoomOfVilla()
                    + "," + villa.getAnotherConvenient() + "," + villa.getPoolArea() + "," + villa.getFloorOfVilla() + "\n";
            FileWriter fileWriter = new FileWriter(VILLA_FILE, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Nhập đúng định dạng");
        }
    }

    public static void addNewHouse() {

        try {
            boolean check = false;
            System.out.println("Nhập thông tin của House");
            String id;
            do {
                System.out.println("Nhập mã dịch vụ");
                id = sc.nextLine();
                check = regexId(id);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("sai định dạng");
                }
            } while (!check);
            String name;
            do {
                System.out.println("Nhập tên dịch vụ");
                name = sc.nextLine();
                check = regexNameService(name);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("sai định dạng");
                }
            } while (!check);
            check = false;
            String areaOfUse;
            do {
                System.out.println("Nhập diện tích sửu dụng");
                areaOfUse = sc.nextLine();
                check = regexAreaOfUse(areaOfUse);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("Sai định dạng");
                }
            } while (!check);
            check = false;
            String rentalCost;
            do {
                System.out.println("Nhập chi phí thuê");
                rentalCost = sc.nextLine();
                check = regexRentalCost(rentalCost);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("sai định dạng");
                }
            } while (!check);
            check = false;
            String maxPeople;
            do {
                System.out.println("Nhập số người tối đa");
                maxPeople = sc.nextLine();
                check = regexMaxPeople(maxPeople);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("sai định dạng");
                }
            } while (!check);
            check = false;
            String rentalType;
            do {
                System.out.println("Kiểu thuê");
                rentalType = sc.nextLine();
                check = regexRentalType(rentalType);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("sai định dạng");
                }
            } while (!check);
            check = false;
            String standardRoomOfHouse;
            do {
                System.out.println("Tiêu chuẩn phòng");
                standardRoomOfHouse = sc.nextLine();
                check = Validator.regexStandard(standardRoomOfHouse);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("sai định dạng");
                }
            } while (!check);
            check = false;
            System.out.println("Mô tả tiện nghi khác");
            String anotherConvenientOfHouse = sc.nextLine();
            String poolArea;
            do {
                System.out.println("Diện tích hồ bơi");
                poolArea = sc.nextLine();
                check = regexPoolArea(poolArea);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("sai định dạng");
                }
            } while (!check);
            check = false;
            String floorHouse;
            do {
                System.out.println("Số tầng");
                floorHouse = sc.nextLine();
                check = regexFloor(floorHouse);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("sai định dạng");
                }
            } while (!check);
            House house = new House(id, name,
                    areaOfUse,
                    rentalCost,
                    maxPeople,
                    rentalType,
                    standardRoomOfHouse,
                    anotherConvenientOfHouse,
                    floorHouse);
            String line = house.getId() + "," + house.getNameService() + "," + house.getAreaOfUse() + "," + house.getRentalCost() + "," + house.getMaxPeople() + "," + house.getRentalType() + "," + house.getStandardRoomOfHouse()
                    + "," + house.getAnotherConvenientOfHouse() + "," + house.getFloors();
            FileWriter fileWriter = new FileWriter(HOUSE_FILE, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Vui lòng nhập số");
        } catch (InputMismatchException e) {
            System.out.println("Nhập đúng định dạng");
        }
    }

    public static void addNewRoom() {
        try {
            boolean check = false;
            System.out.println("Nhập thông tin của Room");
            String id;
            do {
                System.out.println("Nhập mã dịch vụ");
                id = sc.nextLine();
                check = regexId(id);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("sai định dạng");
                }
            } while (!check);
            String name;
            do {
                System.out.println("Nhập tên dịch vụ");
                name = sc.nextLine();
                check = regexNameService(name);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("sai định dạng");
                }
            } while (!check);
            check = false;
            String areaOfUse;
            do {
                System.out.println("Nhập diện tích sửu dụng");
                areaOfUse = sc.nextLine();
                check = regexAreaOfUse(areaOfUse);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("Sai định dạng");
                }
            } while (!check);
            check = false;
            String rentalCost;
            do {
                System.out.println("Nhập chi phí thuê");
                rentalCost = sc.nextLine();
                check = regexRentalCost(rentalCost);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("sai định dạng");
                }
            } while (!check);
            check = false;
            String maxPeople;
            do {
                System.out.println("Nhập số người tối đa");
                maxPeople = sc.nextLine();
                check = regexMaxPeople(maxPeople);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("sai định dạng");
                }
            } while (!check);
            check = false;
            String rentalType;
            do {
                System.out.println("Kiểu thuê");
                rentalType = sc.nextLine();
                check = regexRentalType(rentalType);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("sai định dạng");
                }
            } while (!check);
            check = false;
            String freeConvenient;
            do {
                System.out.println("Dịch vụ miễn phí đi kèm");
                freeConvenient = sc.nextLine();
                check = regexFreeConvenient(freeConvenient);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("Sai định dạng");
                }
            } while (!check);
            Room room = new Room(id, name,
                    areaOfUse,
                    rentalCost,
                    maxPeople,
                    rentalType,
                    freeConvenient);
            String line = room.getId() + "," + room.getNameService() + "," + room.getAreaOfUse() + "," + room.getRentalCost() + "," + room.getMaxPeople() + "," + room.getRentalType() +
                    "," + room.getFreeConvenient();
            FileWriter fileWriter = new FileWriter(ROOM_FILE, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Vui lòng nhập số");
        } catch (InputMismatchException e) {
            System.out.println("Nhập đúng định dạng");
        }

    }

    private static void showService() {
        while (true) {
            System.out.println("1.Show all Villa" +
                    "\n2.Show all House" +
                    "\n3.Show all Room" +
                    "\n4.Show All Name Villa Not Duplicate" +
                    "\n5.Show All Name House Not Duplicate" +
                    "\n6.Show All Name Room Not Duplicate" +
                    "\n7.Back to Menu" +
                    "\n8.Exit");
            try {
                switch (Integer.parseInt(sc.nextLine())) {
                    case 1:
                        showAllVilla();
                        break;
                    case 2:
                        showAllHouse();
                        break;
                    case 3:
                        showAllRoom();
                        break;
                    case 4:
                        showAllNameVillaNotDuplicate();
                        break;
                    case 5:
                        showAllNameHouseNotDuplicate();
                        break;
                    case 6:
                        showAllNameNameRoomNotDuplicate();
                        break;
                    case 7:
                        displayMainMenu();
                        break;
                    case 8:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("vui lòng chọn từ 1 đến 5");
                }
            } catch (NumberFormatException e) {

            }
        }
    }

    private static void showAllNameNameRoomNotDuplicate() {
    }

    private static void showAllNameHouseNotDuplicate() {
    }

    private static void showAllNameVillaNotDuplicate() {
    }

    private static void showAllVilla() {
        List<Villa> villaList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(VILLA_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String temp[];
            Villa villa;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                villa = new Villa(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8], temp[9]);
                villaList.add(villa);
            }
            bufferedReader.close();
            for (Villa villa1 : villaList) {
                System.out.println(villa1.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void showAllRoom() {
        List<Room> roomList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(ROOM_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String temp[];
            Room room;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                room = new Room(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6]);
                roomList.add(room);
                //  bufferedReader.close();
            }
            for (Room room1 : roomList) {
                System.out.println(room1.toString());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void showAllHouse() {
        List<House> houseList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(HOUSE_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String temp[];
            House house;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                house = new House(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8]);
                houseList.add(house);
            }
            bufferedReader.close();
            for (House house1 : houseList) {
                System.out.println(house1.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}