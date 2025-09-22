interface IRideService {
    void bookRide();
    void endRide();
}

class Vehicle {
    protected String vehicleNumber;
    protected int capacity;
    protected String type;

    Vehicle(String vNum, int cap, String t) {
        vehicleNumber = vNum;
        capacity = cap;
        type = t;
    }
}

class Mini extends Vehicle {
    Mini(String vNum, int cap) {
        super(vNum, cap, "Mini");
    }
}

class Sedan extends Vehicle {
    Sedan(String vNum, int cap) {
        super(vNum, cap, "Sedan");
    }
}

class SUV extends Vehicle {
    SUV(String vNum, int cap) {
        super(vNum, cap, "SUV");
    }
}

class Driver {
    private String name;
    private String licenseNumber;
    private double rating;

    Driver(String n, String l, double r) {
        name = n;
        licenseNumber = l;
        rating = r;
    }

    public String getName() {
        return name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public double getRating() {
        return rating;
    }
}

class Ride implements IRideService {
    private Vehicle vehicle;
    private Driver driver;
    private double location;
    private double baseFare;
    private double rate;
    private double distance;
    private double fare;

    Ride(Vehicle v, Driver d, double bf, double r, double dist) {
        vehicle = v;
        driver = d;
        baseFare = bf;
        rate = r;
        distance = dist;
        fare = 0;
    }

    public void bookRide() {
        fare = baseFare + distance * rate;
    }

    public void endRide() {
        fare = 0;
    }

    public double getFare() {
        return fare;
    }
}
