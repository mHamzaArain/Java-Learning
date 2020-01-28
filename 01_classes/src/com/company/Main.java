package com.company;

class Circle {
    // // 1. Contructors
    double radius;

    // Constructors
    Circle()
    {
        this(1.0);
        System.out.append("Zero parameter constructor");
    }
    Circle(double r)
    {
        this(r, 2);
        radius = r;
        System.out.append("One parameter constructor");
    }
    Circle (double r, double i){
        radius = r+2;
    }
}

class Rectangle {
    /*
    Constructors
    ============
    Arguments
    ---------
    1. None : (By default) 1 for width & height of type double
    2. w: double
    3. h: double

    Methods
    =======
    1. toString: String (Overide from parent class)
    2. getArea: double
           width * height
    3. getParimeter:  double
            2 * width * height
     */
    double width;
    double height;

    // Constructors
    Rectangle(){
        this(1, 1);
    }
    Rectangle(double w, double h){
        this.width = w;
        this.height = h;
    }

    // This implement as child
    @Override   // Imnplementation b/w parent & child
    public String toString(){
        return "Height: " + this.height+ "\n"
                + "Width: "+ this.width;
    }

    // Methods
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*(width+height);
    }
}

class GoldCustomer extends Customer {
    GoldCustomer () {}
    GoldCustomer(String name){
        this.customerName = name;
    }

    @Override
    public String toString(){
        return ("name: " + this.customerName + "\n" +
                "Balance: " + this.balance + "\n" +
                "Mins: " + this.min);
    }

    @Override
    protected double RecordCall(String callType, int min){
        this.min += min;
        if (callType == "Phone"){
            if (this.min >= 60){
                return this.balance += 0.2*min;
            }
            return this.balance += 0.5*min;
        }
        return this.balance += 1*min;
    }
}

class Customer {
    public String customerName;
    protected double balance;
    public int min;


    Customer() {}
    Customer(String name){
        this.customerName = name;
    }


    @Override
    public String toString(){
        return ("name: " + this.customerName + "\n" +
                "Balance: " + this.balance);
    }

    protected double  RecordPayment(){
        return balance;
    }


    protected double RecordCall(String callType,  int min){
        if (callType == "Landline"){
            return this.balance += 0.5*min;
        }
        this.min += min;
        return this.balance += 1*min;
    }

}

public class Main {

    public static void main(String[] args) {
	    // // write your code here

        // /////////////// 1. Constructor
        // Circle obj1 = new Circle(1.4); // One parameter constructor
        // Circle obj2 = new Circle();  // Zero parameter constructor, Reference constructor calling

        // /////////////// 2. Overiding methds
        // Rectangle rect1 = new Rectangle();
        // System.out.println(rect1.getArea());
        // Rectangle rect2 = new Rectangle(3,4);
        // System.out.println(rect2.getPerimeter());
        // Rectangle rect3 = new Rectangle(4,5);
        // System.out.println(rect3);

        // ////////////// 3. child class
        // Customer c1 = new Customer("Hamza");
        // c1.RecordCall("Landline",  20);
        // c1.RecordCall("Landline",  210);
        // c1.RecordCall("phone",  210);
        //System.out.println(c1.RecordPayment());
        // System.out.println(c1.toString());

        // GoldCustomer gc1 = new GoldCustomer("hamza");
        // gc1.RecordCall("Phone", 55);
        // gc1.RecordCall("Phnoe", 32);
        // System.out.println(gc1.toString());

    }
}
