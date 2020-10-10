package controllers;

import commons.*;
import models.*;

import java.io.*;
import java.util.*;

import static commons.Validator.*;

public class MainControllers {
    private static final String CUS_FILE = "D:\\ChuongTrinhCodegym\\Module2_C0720G1_Le_Manh_Cuong\\FuramaResort\\src\\data\\Customer.csv";
    private static final String HOUSE_FILE = "D:\\ChuongTrinhCodegym\\Module2_C0720G1_Le_Manh_Cuong\\FuramaResort\\src\\data\\House.csv";
    private static final String VILLA_FILE = "D:\\ChuongTrinhCodegym\\Module2_C0720G1_Le_Manh_Cuong\\FuramaResort\\src\\data\\Villa.csv";
    private static final String ROOM_FILE = "D:\\ChuongTrinhCodegym\\Module2_C0720G1_Le_Manh_Cuong\\FuramaResort\\src\\data\\Room.csv";
    public static final String BOOKING_FILE = "D:\\ChuongTrinhCodegym\\Module2_C0720G1_Le_Manh_Cuong\\FuramaResort\\src\\data\\Booking.csv";
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
                        addNewCustomer();
                        break;
                    case 4:
                        showInformationOfCustomer();
                        break;
                    case 5:
                        addNewBooking();
                        break;
                    case 6:
                        showInformationOfEmployee();

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

    private static void showInformationOfEmployee() {
    }

    private static void addNewBooking() {
        while (true) {
            System.out.println("1.Booking Vila" +
                    "\n2.Booking House" +
                    "\n3.Booking Room" +
                    "\n4.Back to Menu" +
                    "\n5.Exit");
            try {
                switch (Integer.parseInt(sc.nextLine())) {
                    case 1:
                        while (true) {
                            try {
                                String lineVilla = null;
                                List<Customer> customerList = showInformationOfCustomer();
                                System.out.println("Chọn Customer:");
                                int chooseCus = Integer.parseInt(sc.nextLine());

                                System.out.println(customerList.get(chooseCus - 1));
                                Customer bookedCus = customerList.get(chooseCus - 1);
                                List<Villa> villaList = showAllVilla();
                                System.out.println("Chọn dịch vụ:");
                                int chooseService = Integer.parseInt(sc.nextLine());

                                System.out.println(villaList.get(chooseService - 1).toString());
                                Villa bookedVilla = villaList.get(chooseService - 1);
                                lineVilla = bookedVilla.getId() +
                                        "," + bookedVilla.getNameService() +
                                        "," + bookedVilla.getAreaOfUse() +
                                        "," + bookedVilla.getRentalCost() +
                                        "," + bookedVilla.getMaxPeople() +
                                        "," + bookedVilla.getRentalType() +
                                        "," + bookedVilla.getStandardRoomOfVilla() +
                                        "," + bookedVilla.getAnotherConvenient() +
                                        "," + bookedVilla.getFloorOfVilla();

                                chooseCustomerAndService(lineVilla, bookedCus);


                            } catch (NumberFormatException e) {
                                e.getMessage();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;
                        }
                        break;

                    case 2:
                        while (true) {
                            try {
                                String lineHouse = null;
                                List<Customer> customerList = showInformationOfCustomer();
                                System.out.println("Chọn Customer:");
                                int chooseCus = Integer.parseInt(sc.nextLine());

                                System.out.println(customerList.get(chooseCus - 1));
                                Customer bookedCus = customerList.get(chooseCus - 1);
                                List<House> roomList = showAllHouse();
                                System.out.println("Chọn dịch vụ:");
                                int chooseService = Integer.parseInt(sc.nextLine());

                                System.out.println(roomList.get(chooseService - 1).toString());
                                House bookedhouse = roomList.get(chooseService - 1);
                                lineHouse = bookedhouse.getId() +
                                        "," + bookedhouse.getNameService() +
                                        "," + bookedhouse.getAreaOfUse() +
                                        "," + bookedhouse.getRentalCost() +
                                        "," + bookedhouse.getMaxPeople() +
                                        "," + bookedhouse.getRentalType() +
                                        "," + bookedhouse.getStandardRoomOfHouse() +
                                        "," + bookedhouse.getAnotherConvenientOfHouse() +
                                        "," + bookedhouse.getFloors();

                                chooseCustomerAndService(lineHouse, bookedCus);
                                break;


                            } catch (NumberFormatException e) {
                                e.getMessage();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;
                        }
                        break;
                    case 3:
                        while (true) {
                            try {
                                String lineRoom = null;
                                List<Customer> customerList = showInformationOfCustomer();
                                System.out.println("Chọn Customer:");
                                int chooseCus = Integer.parseInt(sc.nextLine());

                                System.out.println(customerList.get(chooseCus - 1));
                                Customer bookedCus = customerList.get(chooseCus - 1);
                                List<Room> roomList = showAllRoom();
                                System.out.println("Chọn dịch vụ:");
                                int chooseService = Integer.parseInt(sc.nextLine());

                                System.out.println(roomList.get(chooseService - 1).toString());
                                Room bookedRoom = roomList.get(chooseService - 1);
                                lineRoom = bookedRoom.getId() +
                                        "," + bookedRoom.getNameService() +
                                        "," + bookedRoom.getAreaOfUse() +
                                        "," + bookedRoom.getRentalCost() +
                                        "," + bookedRoom.getMaxPeople() +
                                        "," + bookedRoom.getRentalType() +
                                        "," + bookedRoom.getFreeConvenient();

                                chooseCustomerAndService(lineRoom, bookedCus);
                                break;


                            } catch (NumberFormatException e) {
                                e.getMessage();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;
                        }
                        break;
                    case 4:
                        return;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("vui lòng chọn từ 1 đến 5");
                }
            } catch (NumberFormatException e) {
                System.out.println("Chọn trong danh sách ở trên:");
            }
        }
    }

    private static void chooseCustomerAndService(String lineService, Customer bookedCus) throws IOException {
        String lineBooked;
        lineBooked = bookedCus.getFullName() + "," + bookedCus.getBirthDay() + ","
                + bookedCus.getGender() + "," + bookedCus.getIdCard() + ","
                + bookedCus.getNumberPhone() + "," + bookedCus.getEmail() + ","
                + bookedCus.getTypeOfCustomer() + "," + bookedCus.getAddress() + ","
                + "Service {" + lineService + "}" + "\n";
        FileWriter fileWriter = new FileWriter(BOOKING_FILE, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(lineBooked);
        bufferedWriter.close();
        return;
    }

    private static List<Customer> showInformationOfCustomer() {
        List<Customer> customerList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(CUS_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String temp[];
            Customer customer;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                customer = new Customer(temp[0], temp[1], temp[2], temp[3], Integer.parseInt(temp[4]), temp[5], temp[6], temp[7], null);
                customerList.add(customer);
            }
            int index = 1;
            Collections.sort(customerList, new SortByNameAndBirthYear());
            for (Customer customer1 : customerList) {
                System.out.println(index++ + "." + customer1);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    private static void addNewCustomer() {
        try {
            boolean check = false;
            System.out.println("Nhập thông tin khách hàng");
            String fullName = " ";
            do {
                try {
                    System.out.println("Họ và tên:");
                    fullName = sc.nextLine();
                    check = regexNameCustomer(fullName);
                    if (check) {
                        System.out.println("Ok");
                    } else {
                        throw new NameException(" Tên Khách hàng phải in hoa ký tự đầu tiên trong mỗi từ");
                    }
                } catch (NameException e) {
                    e.printStackTrace();
                }
            }
            while (!check);
            check = false;
            String birthDay = " ";
            do {
                try {
                    System.out.println("Ngày tháng năm sinh(xx/mm/yyyy");
                    birthDay = sc.nextLine();
                    check = regexBirthday(birthDay);

                    if (check) {
                        String[] arrBirthday = birthDay.split("/");
                        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
                        int inputYear = Integer.parseInt(arrBirthday[2]);
                        if (inputYear > 1900 && currentYear - inputYear >= 18) {
                            System.out.println("Ok");
                        } else {
                            check = false;
                            throw new BirthdayException("Năm sinh phải >1900 và nhỏ hơn năm hiện tại 18 năm, đúng định dạng dd/mm/yyyy");
                        }
                    } else {

                        throw new BirthdayException("Lỗi");
                    }
                } catch (BirthdayException e) {
                    e.printStackTrace();
                }
            } while (!check);
            check = false;
            String gender = " ";
            do {
                try {
                    System.out.println("Giới tính");
                    gender = sc.nextLine();
                    String tempSex = gender.toLowerCase();
                    check = regexSex(tempSex);
                    if (check) {
                        gender = Character.toUpperCase(tempSex.charAt(0)) + tempSex.substring(1);
                        System.out.println("Ok");
                    } else {
                        throw new SexException("");
                    }
                } catch (SexException e) {
                    e.printStackTrace();
                }
            } while (!check);
            check = false;

            String idCard = " ";
            do {
                try {
                    System.out.println("Nhập số CMND");
                    idCard = sc.nextLine();
                    check = regexIdNumber(idCard);
                    if (check) {
                        System.out.println("Ok");
                    } else {
                        throw new IdCardException("");
                    }
                } catch (IdCardException e) {
                    e.printStackTrace();
                }
            } while (!check);
            check = false;
            int numberPhone = 0;
            do {
                try {
                    check = true;
                    System.out.println("Số điện thoại:");
                    numberPhone = Integer.parseInt(sc.nextLine());

                } catch (InputMismatchException e) {
                    e.getMessage();
                    check = false;
                } catch (NumberFormatException e) {
                    e.getMessage();
                    check = false;
                }
            } while (!check);

            String email = " ";
            do {
                try {
                    System.out.println("Email:");
                    email = sc.nextLine();
                    check = regexEmail(email);
                    if (check) {
                        System.out.println("Ok");
                    } else {
                        throw new EmailException("");
                    }
                } catch (EmailException e) {
                    e.printStackTrace();
                }
            } while (!check);
            check = false;
            System.out.println("Loại khách hàng:");
            String typeOfCustomer = sc.nextLine();
            System.out.println("Địa chỉ:");
            String address = sc.nextLine();
            Services services = null;
            Customer customer = new Customer(fullName, birthDay, gender, idCard, numberPhone, email, typeOfCustomer, address, services);
            FileWriter fileWriter = new FileWriter(CUS_FILE);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line = customer.getFullName() + "," + customer.getBirthDay() + ","
                    + customer.getGender() + "," + customer.getIdCard() + ","
                    + customer.getNumberPhone() + "," + customer.getEmail() + ","
                    + customer.getTypeOfCustomer() + "," + customer.getAddress() + ","
                    + customer.getServices() + "\n";
            bufferedWriter.write(line);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
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
                        return;
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
            System.out.println("Nhập thông tin của Villa");
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
            String standardRoomOfVilla;
            do {
                System.out.println("Tiêu chuẩn phòng");
                standardRoomOfVilla = sc.nextLine();
                check = Validator.regexStandard(standardRoomOfVilla);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("sai định dạng");
                }
            } while (!check);
            check = false;
            System.out.println("Mô tả tiện nghi khác");
            String anotherConvenientOfVilla = sc.nextLine();
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
            String floorVilla;
            do {
                System.out.println("Số tầng");
                floorVilla = sc.nextLine();
                check = regexFloor(floorVilla);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("sai định dạng");
                }
            } while (!check);
            Villa villa = new Villa(id, name, areaOfUse, rentalCost, maxPeople, rentalType, standardRoomOfVilla, anotherConvenientOfVilla, poolArea, floorVilla);
            String line = villa.getId() + "," + villa.getNameService() + "," + villa.getAreaOfUse() + "," + villa.getRentalCost() + "," + villa.getMaxPeople() + "," + villa.getRentalType() + "," + villa.getStandardRoomOfVilla()
                    + "," + villa.getAnotherConvenient() + "," + villa.getPoolArea() + "," + villa.getFloorOfVilla() + "\n";
            FileWriter fileWriter = new FileWriter(VILLA_FILE, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
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
                    + "," + house.getAnotherConvenientOfHouse() + "," + house.getFloors() + "\n";
            FileWriter fileWriter = new FileWriter(HOUSE_FILE, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
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
            FreeConvenient freeConvenient;
            String nameFreeService;
            do {
                System.out.println("Nhập tên dịch vụ miễn phí:");
                nameFreeService = sc.nextLine();
                check = regexFreeConvenient(nameFreeService);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("sai định dạng");
                }
            } while (!check);
            check = false;
            String unit;
            do {
                System.out.println("Đơn vị:");
                unit = sc.nextLine();
                check = regexRentalCost(unit);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("Sai định dạng");
                }

            } while (!check);
            check = false;
            String price;
            do {
                System.out.println("Giá dịch vụ:");
                price = sc.nextLine();
                check = regexRentalCost(price);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("Sai định dạng");
                }
            } while (!check);
            freeConvenient = new FreeConvenient(nameFreeService, unit, price);
            Room room = new Room(id, name,
                    areaOfUse,
                    rentalCost,
                    maxPeople,
                    rentalType,
                    freeConvenient);
            String line = room.getId() + "," + room.getNameService() + "," + room.getAreaOfUse() + "," + room.getRentalCost() + "," + room.getMaxPeople() + "," + room.getRentalType() +
                    "," + room.getFreeConvenient().getNameService() + "," + room.getFreeConvenient().getUnit() + "," + room.getFreeConvenient().getPrice() + "," + "\n";
            FileWriter fileWriter = new FileWriter(ROOM_FILE, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
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
        Set<Room> listRoom = new TreeSet<>(new Comparator<Room>() {
            @Override
            public int compare(Room room1, Room room2) {
                return room1.getNameService().compareTo(room2.getNameService());
            }
        });
        try {
            FileReader fileReader = new FileReader(ROOM_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Room room;
            int index = 1;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                room = new Room(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], new FreeConvenient(temp[6], temp[7], temp[8]));
                listRoom.add(room);

            }
            for (Room room1 : listRoom) {
                System.out.println( room1.toString());
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void showAllNameHouseNotDuplicate() {
     Set<House> listHouse=new TreeSet<>(new Comparator<House>() {
         @Override
         public int compare(House house1, House house2) {
             return house1.getNameService().compareTo(house2.getNameService());
         }
     });
        try {
            FileReader fileReader = new FileReader(HOUSE_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String temp[];
            House house;
            int index = 1;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                house = new House(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8]);
                listHouse.add(house);
            }
            bufferedReader.close();
            for (House house1 : listHouse) {
                System.out.println(index++ + " , " + house1.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void showAllNameVillaNotDuplicate() {
        Set<Villa> listVilla = new TreeSet<>(new Comparator<>() {
            @Override
            public int compare(Villa villa1, Villa villa2) {
                return villa1.getNameService().compareTo(villa2.getNameService());
            }
        });

        try {
            FileReader fileReader = new FileReader(VILLA_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Villa villa;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                villa = new Villa(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8], temp[9]);
                listVilla.add(villa);
            }
            for (Villa villa1 : listVilla) {
                System.out.println(villa1.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Villa> showAllVilla() {
        List<Villa> villaList = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(VILLA_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String temp[];
            Villa villa;
            int index = 1;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                villa = new Villa(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8], temp[9]);
                villaList.add(villa);
            }
            bufferedReader.close();
            for (Villa villa1 : villaList) {
                System.out.println(index++ + " . " + villa1.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villaList;
    }

    private static List<Room> showAllRoom() {
        List<Room> roomList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(ROOM_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Room room;
            int index = 1;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                room = new Room(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], new FreeConvenient(temp[6], temp[7], temp[8]));
                roomList.add(room);

            }
            for (Room room1 : roomList) {
                System.out.println(index++ + " , " + room1.toString());
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return roomList;
    }

    private static List<House> showAllHouse() {
        List<House> houseList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(HOUSE_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String temp[];
            House house;
            int index = 1;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                house = new House(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8]);
                houseList.add(house);
            }
            bufferedReader.close();
            for (House house1 : houseList) {
                System.out.println(index++ + " , " + house1.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return houseList;
    }

}