package repository.impl;

import common.ReadFile;
import model.person.Customer;
import repository.ICustomerRepository;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static common.WriteFile.write;

public class CustomerRepository implements ICustomerRepository {
    public static final String CUSTOMER_PATH = "src\\data\\customer.csv";
    static List<Customer> customerList = new LinkedList<>();
    public static ReadFile readFile = new ReadFile();


    public List<Customer> getALl() {
        List<String> stringList = ReadFile.read("src\\data\\customer.csv");
        List<Customer> customerList = new LinkedList<>();
        for (String str : stringList) {
            String[] temp = str.split(",");
            Customer customer = new Customer(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8]);
            customerList.add(customer);
        }
        return customerList;
    }

    @Override
    public Boolean findCode(String code) {
        List<Customer> result = getALl();
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i).getCustomerCode().equals(code)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void display() {
        List<Customer> result = getALl();
        for (Customer customer : result) {
            System.out.println(customer);
        }
    }

    @Override
    public void add(Customer customer) {
        String str = toCSV(customer);
        List<String> stringList = ReadFile.read("src\\data\\customer.csv");
        stringList.add(str);
        try {
            write("src\\data\\customer.csv", stringList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String toCSV(Customer customer) {
        return customer.getName() + "," + customer.getDateOfBirth() + "," + customer.getGender() + ","
                + customer.getIdCard() + "," + customer.getPhoneNumber() + "," + customer.getEmail() + ","
                + customer.getCustomerCode() + "," + customer.getCustomerType() + "," + customer.getAddress();
    }


    @Override
    public void edit(Customer customer) {
        List<Customer> result = getALl();
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i).getCustomerCode().equals(customer.getCustomerCode())) {
                result.set(i, customer);
            }
        }
        List<String> stringList = new ArrayList<>();
        String[] temp = new String[10];
        String string;
        for (Customer customer1 : result) {
            temp[0] = customer1.getName();
            temp[1] = customer1.getDateOfBirth();
            temp[2] = customer1.getGender();
            temp[3] = customer1.getIdCard();
            temp[4] = customer1.getPhoneNumber();
            temp[5] = customer1.getEmail();
            temp[6] = customer1.getCustomerCode();
            temp[7] = customer1.getCustomerType();
            temp[8] = customer1.getAddress();
            string = new String(temp[0] + "," + temp[1] + "," + temp[2] + "," + temp[3] + "," + temp[4] + ","
                    + temp[5] + "," + temp[6] + "," + temp[7] + "," + temp[8]);
            stringList.add(string);
            try {
                write("src\\data\\customer.csv", stringList);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
