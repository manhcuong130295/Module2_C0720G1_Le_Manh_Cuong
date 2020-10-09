package models;

public class Room extends Services  {
  private FreeConvenient freeConvenient ;

    public Room() {
    }

    public Room(FreeConvenient freeConvenient) {
        this.freeConvenient = freeConvenient;
    }

    public Room(String id, String nameService, String areaOfUse, String rentalCost, String maxPeople, String rentalType, FreeConvenient freeConvenient) {
        super(id,nameService, areaOfUse, rentalCost, maxPeople, rentalType);
        this.freeConvenient = freeConvenient;
    }

    public FreeConvenient getFreeConvenient() {
        return freeConvenient;
    }

    public void setFreeConvenient(FreeConvenient freeConvenient) {
        this.freeConvenient = freeConvenient;
    }

    @Override
    public String toString() {
        return "Room {" +super.toString()+
                "freeConvenient='" + freeConvenient + '\''+
                "}";
    }

    @Override
    public String showInfo() {
        return toString();
    }

}

