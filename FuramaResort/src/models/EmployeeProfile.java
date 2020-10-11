package models;

public class EmployeeProfile {
    int id;
    Employee employee;

    public EmployeeProfile(int id, Employee employee) {
        this.id = id;
        this.employee = employee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "EmployeeProfile{" +
                "id=" + id +
                ", " + employee +
                '}';
    }
}
