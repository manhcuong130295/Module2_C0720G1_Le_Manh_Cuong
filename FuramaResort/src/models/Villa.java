package models;

public class Villa extends Services {
    private String standardRoomOfVilla = " ";
    private String anotherConvenient = " ";
    private String poolArea;
    private String floorOfVilla;

    public Villa(String id, String name, String areaOfUse, String rentalCost, String maxPeople, String rentalType, String standardRoomOfVilla, String anotherConvenient, String poolArea, int floorOfVilla) {
    }

    public Villa(String standardRoomOfVilla, String anotherConvenient, String poolArea, String floorOfVilla) {
        this.standardRoomOfVilla = standardRoomOfVilla;
        this.anotherConvenient = anotherConvenient;
        this.poolArea = poolArea;
        this.floorOfVilla = floorOfVilla;
    }

    public Villa(String id, String nameService, String areaOfUse, String rentalCost, String maxPeople, String rentalType, String standardRoomOfVilla, String anotherConvenient, String poolArea, String floorOfVilla) {
        super(id, nameService, areaOfUse, rentalCost, maxPeople, rentalType);
        this.standardRoomOfVilla = standardRoomOfVilla;
        this.anotherConvenient = anotherConvenient;
        this.poolArea = poolArea;
        this.floorOfVilla = floorOfVilla;
    }

    public String getStandardRoomOfVilla() {
        return standardRoomOfVilla;
    }

    public void setStandardRoomOfVilla(String standardRoomOfVilla) {
        this.standardRoomOfVilla = standardRoomOfVilla;
    }

    public String getAnotherConvenient() {
        return anotherConvenient;
    }

    public void setAnotherConvenient(String anotherConvenient) {
        this.anotherConvenient = anotherConvenient;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public String getFloorOfVilla() {
        return floorOfVilla;
    }

    public void setFloorOfVilla(String floorOfVilla) {
        this.floorOfVilla = floorOfVilla;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString() +
                "standardRoomOfVilla='" + standardRoomOfVilla + '\'' +
                ", anotherConvenient='" + anotherConvenient + '\'' +
                ", poolArea=" + poolArea +
                ", floorOfVilla=" + floorOfVilla +
                '}';
    }

    @Override
    public String showInfo() {
        return toString();
    }
}