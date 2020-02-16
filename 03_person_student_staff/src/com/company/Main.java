package com.company;

class Person {
    /*
    Constructors
    ============
    None

    Attributes
    ---------
    name: String
    address: String

    Methods
    =======
    toString: Override String
    getName: String
    getAddtress: String
    setName: String
    */

    // ATTRIBUTES
    protected String name;
    protected String address;

    //CONSTRUCTOR
    public Person(){
        this.name = name;
        this.address = address;
    }

    // METHODS
    @Override
    public String toString(){
        return "Name: " + this.name + "\n" +
                "Address: " + this.address;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }
}

class Student extends Person{
    /*
        This class Student is a child class of Person.
    Constructors
    ============
    Student(name: String, address: String, program: String, year: int, fee: double)

    Attributes
    ----------
    program: String
    year: int
    fee: double

    Methods
    =======
    toString: Override String

    Getter Methods
    --------------
    getProgram: String
    getYear: int
    getFee: double

    Setter Methods
    --------------
    setProgram(program: String): None
    setYear(year: int): None
    setFee(fee: double): None
    */

    //ATTRIBUTES
    private String program;
    private int year;
    private double fee;

    // CONSTRUCTOR
    public Student(String name, String address, String program, int year, double fee){
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    // METHODS
    @Override
    public String toString(){
        return "\n=======================================\n" +
                "Name: " + this.name + "\n" +
                "Address: " + this.address + "\n" +
                "Program: " + this.program + "\n" +
                "Year: " + this.year + "\n" +
                "Fee: " + this.fee +
                "\n=======================================\n";
    }

    public String getProgram(){
        return this.program;
    }

    public String setProgram(String program){
        return this.program = program;
    }

    public int getYear(){
        return this.year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public double getFee(){
        return this.fee;
    }

    public void setFee(double fee){
        this.fee = fee;
    }
}

class Staff extends Person{
    /*
    Constructors
    ============
    Staff(name: String, address String, school String, pay double)

    Attributes
    ----------
    school: String
    pay: double

    Methods
    =======
    toString: Override String

    Getter Methods
    --------------
    getSchool: String
    getPay: double

    Setter Mothods
    --------------
    setSchool(school: String): None
    setPay(pay: double): None
    */

    //ATTRIBUTES
    private String school;
    private double pay;

    // CONSTRUCTOR
    Staff(String name, String address, String school, double pay){
        this.school = school;
        this.pay = pay;
    }

    // METHODS
    @Override
    public String toString(){
        return "\n=======================================\n" +
                "Name: " + this.name + "\n" +
                "Address: " + this.address + "\n" +
                "School: " + this.school + "\n" +
                "Pay: " + this.pay +
                "\n=======================================\n";
    }

    public String getSchool(){
        return this.school;
    }

    public void setSchool(String school){
        this.school = school;
    }

    public double getPay(){
        return this.pay = pay;
    }

    public void setPay(double pay){
        this.pay = pay;
    }
}

public class Main {

    public static void main(String[] args) {
	    /////////// Person class
        Person p1 = new Person();
        p1.name = "Pikachu";
        p1.address = "Pokemonia, Mars";

        p1.setAddress("Pokemonia, Neptune");

        System.out.println("Name: " + p1.getName());
        System.out.println("Address: " + p1.getAddress());

        System.out.println(p1.toString());

        //////////// Student
        Student s1 = new Student("hamza", "A-91", "2nd Yr", 2018, 5000);
        System.out.println("Fee: " + s1.getFee());
        System.out.println("Program: " + s1.getProgram());
        System.out.println("Year: " + s1.getYear());

        s1.setFee(6000);
        s1.setProgram("3rd Yr");

        System.out.println(s1.toString());

        ////////////// Staff
        Staff st1 = new Staff("Farhan", "KU", "UBIT", 25000);
        System.out.println("Pay: " + st1.getPay());
        System.out.println("School: " + st1.getSchool());

        st1.setSchool("Fast");

        System.out.println(st1.toString());
    }
}
