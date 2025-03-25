// class car {
//     String brand;
    
//     // Car(String b) {   // Constructor
//     // brand = b;


//     // Constructor Overloading - multiple constructor with different parameter list

//     //     String brand;
//     //     int year;   
//     //     Car(String b) { brand = b; }
//     //     Car(String b, int y) { brand = b; year = y; }


//     void display(){
//         System.out.println("Brand: " + brand);
//     }

//     // This is a method - block of code performs action
//     // void display() {
//     //     System.out.println("Hello");
//     // }
// }

// public class classObj {
//     public static void main (String[] args) {
//         car car1 = new car();      // Object created
//         // this.brand = brand;  // 'this' refers to the current object's brand
//         car1.brand = "Hyundai";
//         car1.display();
//     }

//     // Method Overloading - multiple method with same name diff parameter
//     // class Calculator {
//     //     int add(int a, int b) { return a + b; }
//     //     double add(double a, double b) { return a + b; }
//     // }


//     // class Car {
//     //     String brand;
//     //     {
//     //         System.out.println("Instance Block Executed"); // rum before constructor when obj is created
//     //     }
//     //     Car(String brand) {
//     //         this.brand = brand;
//     //     }
//     // }
// }



class Car {
    String brand;
    int year;

    // Initializer block
    {
        System.out.println("Car object is being created...");
    }

    // Constructor Overloading
    Car(String brand) {
        this.brand = brand;
    }

    Car(String brand, int year) {
        this(brand);  // calling another constructor
        this.year = year;
    }

    // Method Overloading
    void display() {
        System.out.println("Brand: " + brand);
    }

    void display(String msg) {
        System.out.println(msg + " - " + brand + " " + year);
    }
}

public class classObj {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", 2020);
        c1.display();
        c1.display("Car Details");
    }
}
