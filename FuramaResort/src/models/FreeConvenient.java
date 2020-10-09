package models;

public class FreeConvenient {
    private String nameService;
    private String unit;
    private String price;

    public FreeConvenient(String nameService, String unit, String price) {
        this.nameService = nameService;
        this.unit = unit;
        this.price = price;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "nameService='" + nameService + '\'' +
                        ", unit=" + unit +
                        ", price=" + price;

    }
}
