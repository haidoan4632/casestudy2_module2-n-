package model.person;

public class Customer extends Person{
    private String customerCode; //mã khách hàng
    private String customerType; //loại khách hàng
    private String address; //địa chỉ

    public Customer() {
    }
    public Customer(String name, String dateOfBirth, String gender, String idCard, String phoneNumber, String email, String customerCode, String customerType, String address) {
        super(name, dateOfBirth, gender, idCard, phoneNumber, email);
        this.customerCode = customerCode;
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerCode='" + customerCode + '\'' +
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                "} " + super.toString();
    }
}
