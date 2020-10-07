package models;

public class Room extends Services  {
  private   String freeConvenient = " ";

    public Room() {
    }

    public Room(String freeConvenient) {
        this.freeConvenient = freeConvenient;
    }

    public Room(String id,String nameService, String areaOfUse, String rentalCost, String maxPeople, String rentalType, String freeConvenient) {
        super(id,nameService, areaOfUse, rentalCost, maxPeople, rentalType);
        this.freeConvenient = freeConvenient;
    }

    public String getFreeConvenient() {
        return freeConvenient;
    }

    public void setFreeConvenient(String freeConvenient) {
        this.freeConvenient = freeConvenient;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "freeConvenient='" + freeConvenient + '\''
                ;
    }

    @Override
    public String showInfo() {
        return toString();
    }

}

