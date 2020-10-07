package models;

public abstract class Services {
    private String id = " ";
    private String nameService = " ";
    private String areaOfUse;
    private String rentalCost;
    private String maxPeople;
    private String rentalType = " ";


    public Services() {
    }

    public Services(String id, String nameService, String areaOfUse, String rentalCost, String maxPeople, String rentalType) {
        this.id = id;
        this.nameService = nameService;
        this.areaOfUse = areaOfUse;
        this.rentalCost = rentalCost;
        this.maxPeople = maxPeople;
        this.rentalType = rentalType;
    }

    public  String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getAreaOfUse() {
        return areaOfUse;
    }

    public void setAreaOfUse(String areaOfUse) {
        this.areaOfUse = areaOfUse;
    }

    public String getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(String rentalCost) {
        this.rentalCost = rentalCost;
    }

    public String getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(String maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return
                "id='" + id + '\'' +
                ", nameService='" + nameService + '\'' +
                ", areaOfUse='" + areaOfUse + '\'' +
                ", rentalCost='" + rentalCost + '\'' +
                ", maxPeople='" + maxPeople + '\'' +
                ", rentalType='" + rentalType + '\''
                ;
    }

    public abstract String showInfo();

}
