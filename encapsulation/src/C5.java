public class C5 {
    public static void main(String[] args) {
        System.out.println("Student Details");
        Student16 s1 = new Student16(101, "Neharika");
        s1.printDetails();
        System.out.println();
        //skipping from 17 to 20
        System.out.println("Rectangle Area");
        Rectangle21 r1 = new Rectangle21();
        r1.setLength(12);
        r1.setBreadth(12);
        r1.calculateArea();
        System.out.println();
        //skipping 22 as it's same as 21
        System.out.println("Electricity Bill");
        ElectricityBill23 eb1 = new ElectricityBill23();
        eb1.setUnits(101);
        System.out.println("Bill: Rs "+eb1.calculateBill());
        System.out.println();
        //skipping till 24q
        //provide 25q code and explain how it works

    }
}

class Student16 {
    private int id;
    private String name;

    Student16 (int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printDetails() {
        System.out.println("ID: "+id+"\nName: "+name);
    }
}



class Rectangle21 {
    private double length;
    private double breadth;

    public void setLength(double length) {
        this.length = length;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public void calculateArea() {
        System.out.println("Area: "+length*breadth);
    }
}

class ElectricityBill23 {
    private int units;

    public void setUnits(int units) {
        this.units = units;
    }

    public int calculateBill() {
        return units*5;
    }
}