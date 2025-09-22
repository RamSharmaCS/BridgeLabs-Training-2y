interface Rentable {
    double calculateRent(int days);
}

class Vehicle {
    protected String brand;
    protected double baseRate;

    Vehicle(String b, double br) {
        brand = b;
        baseRate = br;
    }
}

class Car extends Vehicle implements Rentable {
    Car(String b, double br) {
        super(b, br);
    }

    public double calculateRent(int days) {
        double surcharge = 200;
        return baseRate * days + surcharge;
    }
}

class Bike extends Vehicle implements Rentable {
    Bike(String b, double br) {
        super(b, br);
    }

    public double calculateRent(int days) {
        double surcharge = 50;
        return baseRate * days + surcharge;
    }
}

class Truck extends Vehicle implements Rentable {
    Truck(String b, double br) {
        super(b, br);
    }

    public double calculateRent(int days) {
        double surcharge = 300;
        return baseRate * days + surcharge;
    }
}

class Customer {
    private String name;

    Customer(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}
