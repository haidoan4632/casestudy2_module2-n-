package model.person;

public class Employee extends Person{
    private String employeeCode; //mã nhân viên
    private String degree; //trình độ
    private String position; //vị trí
    private String salary; // lương

    public Employee() {
    }
    public Employee(String name, String dateOfBirth, String gender, String idCard, String phoneNumber, String email, String employeeCode, String degree, String position, String salary) {
        super(name, dateOfBirth, gender, idCard, phoneNumber, email);
        this.employeeCode = employeeCode;
        this.degree = degree;
        this.position = position;
        this.salary = salary;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeCode='" + employeeCode + '\'' +
                ", degree='" + degree + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                "} " + super.toString();
    }
}
