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
    public static final String EMPLOYEE_FILE = "D:\\ChuongTrinhCodegym\\Module2_C0720G1_Le_Manh_Cuong\\FuramaResort\\src\\data\\Employee.csv";

    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        while (true) {
            System.out.println("1.Add new Service:" +
                    "\n2.Show service" +
                    "\n3.Add new Customer" +
                    "\n4.Show information Customer:" +
                    "\n5.Add new booking:" +
                    "\n6.Show information Employee:" +
                    "\n7.Show booked film ticket Customer" +
                    "\n8.Search Employee Profile" +
                    "\n9.Exit");
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
                        showBookedfilmticketCustomer();
                        break;
                    case 8:
                        EmployeeProfile.searchEmployeeProfile();
                        break;
                    case 9:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("please choose 1 to 7");
                }
            } catch (NumberFormatException e) {
                System.out.println("please input number");
            }
        }
    }

    private static void showBookedfilmticketCustomer() {
        Queue<Customer> bookedFilmTickedList = new LinkedList<Customer>();
        try {
            FileReader fileReader = new FileReader(CUS_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String temp[];
            Customer customer;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                customer = new Customer(temp[0], temp[1], temp[2], temp[3], Integer.parseInt(temp[4]), temp[5], temp[6], temp[7], null);
                bookedFilmTickedList.add(customer);
            }
            int index = 1;
            while (!bookedFilmTickedList.isEmpty()) {
                System.out.println(bookedFilmTickedList.poll());
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void showInformationOfEmployee() {
        Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();
        try {
            FileReader fileReader = new FileReader(EMPLOYEE_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Employee employee;
            int key = 1;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                employee = new Employee(temp[1], Integer.parseInt(temp[2]), temp[3]);
                employeeMap.put(key++, employee);
            }
            for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
                System.out.println(entry.getKey() + " . " + entry.getValue());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void addNewBooking() {

        while (true) {
            try {
                List<Customer> customerList = showInformationOfCustomer();
                System.out.println("Choose Customer");
                int chooseCus = Integer.parseInt(sc.nextLine());
                System.out.println(customerList.get(chooseCus - 1));
                Customer bookedCus = customerList.get(chooseCus - 1);
                System.out.println("1.Booking Villa" +
                        "\n2.Booking House" +
                        "\n3.Booking Room" +
                        "\n4.Back to Menu" +
                        "\n5.Exit");

                switch (Integer.parseInt(sc.nextLine())) {
                    case 1:
                        while (true) {

                            try {
                                List<Villa> villaList = getVilla();
                                System.out.println("Choose Villa:");
                                int chooseService = Integer.parseInt(sc.nextLine());
                                String lineVilla;
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
                                System.out.println("Please  choose 1 in list villa");
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;
                        }
                        break;
                    case 2:
                        while (true) {

                            try {

                                List<House> roomList = getHouse();
                                System.out.println("Choose House:");
                                int chooseService = Integer.parseInt(sc.nextLine());
                                String lineHouse;
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
                                System.out.println("Please choose 1 in list House");
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;
                        }
                        break;
                    case 3:
                        while (true) {

                            try {

                                List<Room> roomList = getRoom();
                                System.out.println("Choose Room:");
                                int chooseService = Integer.parseInt(sc.nextLine());
                                String lineRoom;
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
                                System.out.println("please choose 1 in list Room");
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
                        System.out.println("please choose 1 to 5");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("please input number");
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
            System.out.println("Input information Customer");
            String fullName = " ";
            do {
                try {
                    System.out.println("Full name:");
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
                    System.out.println("Birthday (dd/mm/yyyy");
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

                        throw new BirthdayException("Wrong format! Please try again");
                    }
                } catch (BirthdayException e) {
                    e.printStackTrace();
                }
            } while (!check);
            check = false;
            String gender = " ";
            do {
                try {
                    System.out.println("Gender");
                    gender = sc.nextLine();
                    String tempSex = gender.toLowerCase();
                    check = regexSex(tempSex);
                    if (check) {
                        gender = Character.toUpperCase(tempSex.charAt(0)) + tempSex.substring(1);
                        System.out.println("Ok");
                    } else {
                        throw new SexException("Wrong format! Please try again later");
                    }
                } catch (SexException e) {
                    e.printStackTrace();
                }
            } while (!check);
            check = false;

            String idCard = " ";
            do {
                try {
                    System.out.println("Id card");
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
                    System.out.println("Number phone:");
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
            System.out.println("Type of Customer:");
            String typeOfCustomer = sc.nextLine();
            System.out.println("Địa chỉ:");
            String address = sc.nextLine();
            Services services = null;
            Customer customer = new Customer(fullName, birthDay, gender, idCard, numberPhone, email, typeOfCustomer, address, services);
            FileWriter fileWriter = new FileWriter(CUS_FILE, true);
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
                        System.out.println("Please choose 1 to 5");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please input number");
            }
        }
    }


    public static void addNewVilla() {

        try {
            boolean check = false;
            System.out.println("Input information of Villa");
            String id;
            do {
                System.out.println("Id");
                id = sc.nextLine();
                check = regexId(id);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("Wrong format! try again ");
                }
            } while (!check);
            String name;
            do {
                System.out.println("Name service");
                name = sc.nextLine();
                check = regexNameService(name);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("Wrong format! try again");
                }
            } while (!check);
            check = false;
            String areaOfUse;
            do {
                System.out.println("Area of use");
                areaOfUse = sc.nextLine();
                check = regexAreaOfUse(areaOfUse);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("Wrong format! try again");
                }
            } while (!check);
            check = false;
            String rentalCost;
            do {
                System.out.println("Rental costs");
                rentalCost = sc.nextLine();
                check = regexRentalCost(rentalCost);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("Wrong format! try again");
                }
            } while (!check);
            check = false;
            String maxPeople;
            do {
                System.out.println("Max number of people");
                maxPeople = sc.nextLine();
                check = regexMaxPeople(maxPeople);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("Wrong format! try again");
                }
            } while (!check);
            check = false;
            String rentalType;
            do {
                System.out.println("Type of rental");
                rentalType = sc.nextLine();
                check = regexRentalType(rentalType);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("Wrong format! try again");
                }
            } while (!check);
            check = false;
            String standardRoomOfVilla;
            do {
                System.out.println("Standard Room of Villa ");
                standardRoomOfVilla = sc.nextLine();
                check = Validator.regexStandard(standardRoomOfVilla);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("Wrong format! try again");
                }
            } while (!check);
            check = false;
            System.out.println("Another Convenient");
            String anotherConvenientOfVilla = sc.nextLine();
            String poolArea;
            do {
                System.out.println("Area of pool");
                poolArea = sc.nextLine();
                check = regexPoolArea(poolArea);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("Wrong format! try again");
                }
            } while (!check);
            check = false;
            String floorVilla;
            do {
                System.out.println("Number of floor");
                floorVilla = sc.nextLine();
                check = regexFloor(floorVilla);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("Wrong format! try again");
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
            System.out.println("Input information of House");
            String id;
            do {
                System.out.println("Id");
                id = sc.nextLine();
                check = regexId(id);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("Wrong format! try again");
                }
            } while (!check);
            String name;
            do {
                System.out.println("Name service");
                name = sc.nextLine();
                check = regexNameService(name);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("Wrong format! try again");
                }
            } while (!check);
            check = false;
            String areaOfUse;
            do {
                System.out.println("Area of use");
                areaOfUse = sc.nextLine();
                check = regexAreaOfUse(areaOfUse);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("Wrong format! try again");
                }
            } while (!check);
            check = false;
            String rentalCost;
            do {
                System.out.println("Rental costs");
                rentalCost = sc.nextLine();
                check = regexRentalCost(rentalCost);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("Wrong format! try again");
                }
            } while (!check);
            check = false;
            String maxPeople;
            do {
                System.out.println("Max number of people");
                maxPeople = sc.nextLine();
                check = regexMaxPeople(maxPeople);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("Wrong format! try again");
                }
            } while (!check);
            check = false;
            String rentalType;
            do {
                System.out.println("Type of rental");
                rentalType = sc.nextLine();
                check = regexRentalType(rentalType);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("Wrong format! try again");
                }
            } while (!check);
            check = false;
            String standardRoomOfHouse;
            do {
                System.out.println("Standard Room of House");
                standardRoomOfHouse = sc.nextLine();
                check = Validator.regexStandard(standardRoomOfHouse);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("Wrong format! try again");
                }
            } while (!check);
            check = false;
            System.out.println("Another Convenient");
            String anotherConvenientOfHouse = sc.nextLine();
            String floorHouse;
            do {
                System.out.println("Number of floor");
                floorHouse = sc.nextLine();
                check = regexFloor(floorHouse);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("Wrong format! try again");
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
            System.out.println("Input information of Room");
            String id;
            do {
                System.out.println("Id");
                id = sc.nextLine();
                check = regexId(id);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("Wrong format! try again");
                }
            } while (!check);
            String name;
            do {
                System.out.println("Name service");
                name = sc.nextLine();
                check = regexNameService(name);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("Wrong format! try again");
                }
            } while (!check);
            check = false;
            String areaOfUse;
            do {
                System.out.println("Area of use");
                areaOfUse = sc.nextLine();
                check = regexAreaOfUse(areaOfUse);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("Wrong format! try again");
                }
            } while (!check);
            check = false;
            String rentalCost;
            do {
                System.out.println("Rental costs");
                rentalCost = sc.nextLine();
                check = regexRentalCost(rentalCost);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("Wrong format! try again");
                }
            } while (!check);
            check = false;
            String maxPeople;
            do {
                System.out.println("Max number of people");
                maxPeople = sc.nextLine();
                check = regexMaxPeople(maxPeople);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("Wrong format! try again");
                }
            } while (!check);
            check = false;
            String rentalType;
            do {
                System.out.println("Type of renatal");
                rentalType = sc.nextLine();
                check = regexRentalType(rentalType);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("Wrong format! try again");
                }
            } while (!check);
            check = false;
            FreeConvenient freeConvenient;
            String nameFreeService;
            do {
                System.out.println("Free Service");
                nameFreeService = sc.nextLine();
                check = regexFreeConvenient(nameFreeService);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("Wrong format! try again");
                }
            } while (!check);
            check = false;
            String unit;
            do {
                System.out.println("Unit");
                unit = sc.nextLine();
                check = regexRentalCost(unit);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("Wrong format! try again");
                }

            } while (!check);
            check = false;
            String price;
            do {
                System.out.println("Price");
                price = sc.nextLine();
                check = regexRentalCost(price);
                if (check) {
                    System.out.println("Ok");
                } else {
                    System.out.println("Wrong format! try again");
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
                        return;
                    case 8:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Please choose 1 to 8");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please input number");
            }
        }
    }


    private static List readFile(String fileName) {
        List<Villa> villaList = new ArrayList<>();
        List<House> houseList = new ArrayList<>();
        List<Room> roomList = new ArrayList<>();
        List list = null;
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Villa villa;
            House house;
            Room room;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                if (fileName == VILLA_FILE) {
                    villa = new Villa(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8], temp[9]);
                    villaList.add(villa);
                    list = villaList;
                } else if (fileName == HOUSE_FILE) {
                    house = new House(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8]);
                    houseList.add(house);
                    list = houseList;
                } else if (fileName == ROOM_FILE) {
                    room = new Room(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], new FreeConvenient(temp[6], temp[7], temp[8]));
                    roomList.add(room);
                    list = roomList;
                } else {
                    list = null;
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    private static void showAllNameNameRoomNotDuplicate() {
        List<Room> roomList = getRoom();
        Set<Room> setRoom = new TreeSet<>(new Comparator<Room>() {
            @Override
            public int compare(Room room1, Room room2) {
                return room1.getNameService().compareTo(room2.getNameService());
            }
        });
        setRoom.addAll(roomList);
        for (Room room : setRoom) {
            System.out.println(room.toString());
        }

    }

    private static void showAllNameHouseNotDuplicate() {
        List<House> houseList = getHouse();
        Set<House> setHouse = new TreeSet<>(new Comparator<House>() {
            @Override
            public int compare(House house1, House house2) {
                return house1.getNameService().compareTo(house2.getNameService());
            }
        });
        setHouse.addAll(houseList);
        for (House house : setHouse) {
            System.out.println(house.toString());
        }
    }

    private static void showAllNameVillaNotDuplicate() {
        List<Villa> villaList = getVilla();
        Set<Villa> setVilla = new TreeSet<>(new Comparator<>() {
            @Override
            public int compare(Villa villa1, Villa villa2) {
                return villa1.getNameService().compareTo(villa2.getNameService());
            }
        });
        setVilla.addAll(villaList);
        for (Villa villa : setVilla) {
            System.out.println(villa.toString());
        }
    }

    private static List<Villa> getVilla() {
        List<Villa> villaList = new ArrayList<>();
        villaList = readFile(VILLA_FILE);
        return villaList;
    }

    private static void showAllVilla() {
        List<Villa> villaList = getVilla();
        int index = 1;
        for (Villa villa : villaList) {
            System.out.println(index++ + "," + villa);
        }
    }

    private static List<House> getHouse() {
        List<House> houseList = new ArrayList<>();
        houseList = readFile(HOUSE_FILE);
        return houseList;
    }

    private static void showAllHouse() {
        List<House> houseList = new ArrayList<>();
        houseList = readFile(HOUSE_FILE);
        int index = 1;
        for (House house : houseList) {
            System.out.println(index++ + "," + house);
        }
    }

    private static List<Room> getRoom() {
        List<Room> roomList = new ArrayList<>();
        roomList = readFile(ROOM_FILE);
        return roomList;
    }

    private static void showAllRoom() {
        List<Room> roomList = getRoom();
        int index = 1;
        for (Room room : roomList) {
            System.out.println(index++ + "," + room);
        }
    }


}