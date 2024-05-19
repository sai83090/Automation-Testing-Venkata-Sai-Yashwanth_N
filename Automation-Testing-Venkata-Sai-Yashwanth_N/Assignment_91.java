package Assignment;

class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    void move() {
        System.out.println("Car is moving");
    }

    void drift() {
        System.out.println("Car is drifting");
    }
}

class Truck extends Vehicle {
    void move() {
        System.out.println("Truck is moving");
    }

    void load() {
        System.out.println("Truck is loading cargo");
    }
}

public class Assignment_91{
    public static void main(String[] args) {
        
        Vehicle vehicle1 = new Car(); 
        Vehicle vehicle2 = new Truck(); 

        vehicle1.move(); 
        vehicle2.move(); 

        Car car = (Car) vehicle1;
        Truck truck = (Truck) vehicle2;

        car.drift(); 
        truck.load(); 
    }
}

	