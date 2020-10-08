package models;

public class House extends Services {
    private String standardRoomOfHouse = " ";
    private String anotherConvenientOfHouse = "";
    private String floorOfHouse;

    public House(String id, String name, String areaOfUse, String rentalCost, String maxPeople, String rentalType, String standardRoomOfVilla, String anotherConvenientOfVilla, String poolArea, String floorVilla) {
    }

    public House(String standardRoomOfHouse, String anotherConvenientOfHouse, String floorsOfhouse) {
        this.standardRoomOfHouse = standardRoomOfHouse;
        this.anotherConvenientOfHouse = anotherConvenientOfHouse;
        this.floorOfHouse = floorsOfhouse;
    }


    public House(String id, String nameService, String areaOfUse, String costOfUse, String maxPeople, String rentalType, String standardRoomOfHouse, String anotherConvenientOfHouse, String floors) {
        super(id, nameService, areaOfUse, costOfUse, maxPeople, rentalType);
        this.standardRoomOfHouse = standardRoomOfHouse;
        this.anotherConvenientOfHouse = anotherConvenientOfHouse;
        this.floorOfHouse = floors;
    }

    public String getStandardRoomOfHouse() {
        return standardRoomOfHouse;
    }

    public void setStandardRoomOfHouse(String standardRoomOfHouse) {
        this.standardRoomOfHouse = standardRoomOfHouse;
    }

    public String getAnotherConvenientOfHouse() {
        return anotherConvenientOfHouse;
    }

    public void setAnotherConvenientOfHouse(String anotherConvenientOfHouse) {
        this.anotherConvenientOfHouse = anotherConvenientOfHouse;
    }

    public String getFloors() {
        return floorOfHouse;
    }

    public void setFloors(String floors) {
        this.floorOfHouse = floors;
    }


    @Override
    public String toString() {
        return "House{" + super.toString() +
                "standardRoomOfHouse='" + standardRoomOfHouse + '\'' +
                ", anotherConvenientOfHouse='" + anotherConvenientOfHouse + '\'' +
                ", floorOfHouse=" + floorOfHouse +
                '}';
    }

    @Override
    public String showInfo() {
        return toString();
    }
}
