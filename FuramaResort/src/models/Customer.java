package models;

public class Customer {
    private String fullName;
    private String birthDay;
    private String sex;
    private String idCard;
    private String numberPhone;
    private String email;
    private String typeOfCustomer;
    private String address;
    private Services services;

    public Customer(String fullName, String idCard, String sex,String numberPhone, String email, String typeOfCustomer, String address, Services services) {
    }

    public Customer(String fullName, String birthDay, String sex, String idCard, String numberPhone, String email, String typeOfCustomer, String address, Services services) {
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.sex = sex;
        this.idCard = idCard;
        this.numberPhone = numberPhone;
        this.email = email;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
        this.services = services;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "fullName='" + fullName + '\'' +
                ", birthDay=" + birthDay +
                ", sex='" + sex + '\'' +
                ", cMND=" + idCard +
                ", numberPhone=" + numberPhone +
                ", email='" + email + '\'' +
                ", typeOfCustomer='" + typeOfCustomer + '\'' +
                ", address='" + address + '\'' +
                ", services=" + services +
                '}';
    }
}
