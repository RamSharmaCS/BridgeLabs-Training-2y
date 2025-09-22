interface Controllable {
    void turnOn();
    void turnOff();
}

class Appliance implements Controllable {
    protected String name;

    Appliance(String n) {
        name = n;
    }

    public void turnOn() {
        System.out.println(name + " activated");
    }

    public void turnOff() {
        System.out.println(name + " deactivated");
    }
}

class Light extends Appliance {
    Light(String n) {
        super(n);
    }

    public void turnOn() {
        System.out.println("Light " + name + " is on");
    }

    public void turnOff() {
        System.out.println("Light " + name + " is off");
    }
}

class Fan extends Appliance {
    Fan(String n) {
        super(n);
    }

    public void turnOn() {
        System.out.println("Fan " + name + " started");
    }

    public void turnOff() {
        System.out.println("Fan " + name + " stopped");
    }
}

class AC extends Appliance {
    AC(String n) {
        super(n);
    }

    public void turnOn() {
        System.out.println("AC " + name + " cooling");
    }

    public void turnOff() {
        System.out.println("AC " + name + " shutdown");
    }
}

class UserController {
    private Appliance[] appliances;

    UserController(Appliance[] a) {
        appliances = a;
    }

    void activateAll() {
        for (Appliance a : appliances) {
            a.turnOn();
        }
    }

    void deactivateAll() {
        for (Appliance a : appliances) {
            a.turnOff();
        }
    }
}
