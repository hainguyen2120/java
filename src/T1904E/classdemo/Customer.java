package T1904E.classdemo;

public class Customer {
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;

    public static void main(String[] args){
        Customer cus1 = new Customer();
        cus1.customerID = 100;
        cus1.customerName = "John";
        cus1.customerAddress = "HN";
        cus1.customerAge = 30;

        System.out.println("Customer ID: "+cus1.customerID);
        System.out.println("Customer Name: "+cus1.customerName);
        System.out.println("Customer Address: "+cus1.customerAddress);
        System.out.println("Customer Age: " +cus1.customerAge);
    }
}
