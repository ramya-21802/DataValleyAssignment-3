import java.io.*;

class Customer implements Serializable {
    private int id;
    private String name;
    private String contact_no;
    private String address;

    public Customer(int id, String name, String contact_no, String address) {
        this.id = id;
        this.name = name;
        this.contact_no = contact_no;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContact_no() {
        return contact_no;
    }

    public String getAddress() {
        return address;
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Michel Derre", "9087654321", "2/262 Peter Road");

        try (FileOutputStream fileOut = new FileOutputStream("JavaObject.txt");
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(customer);
            System.out.println("Customer object serialized and saved to JavaObject.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
