interface IInteractable {
    void feed();
    void play();
    void sleep();
}

class Pet {
    protected String name;
    protected String type;
    protected int age;

    Pet(String n, String t, int a) {
        name = n;
        type = t;
        age = a;
    }
}

class Dog extends Pet implements IInteractable {
    private int hunger;
    private int mood;

    Dog(String n, int a) {
        super(n, "Dog", a);
        hunger = 50;
        mood = 50;
    }

    public void feed() {
        hunger -= 10;
    }

    public void play() {
        mood += 15;
    }

    public void sleep() {
        hunger += 5;
    }

    public String makeSound() {
        return "Woof";
    }
}

class Cat extends Pet implements IInteractable {
    private int hunger;
    private int mood;

    Cat(String n, int a) {
        super(n, "Cat", a);
        hunger = 40;
        mood = 60;
    }

    public void feed() {
        hunger -= 8;
    }

    public void play() {
        mood += 12;
    }

    public void sleep() {
        hunger += 6;
    }

    public String makeSound() {
        return "Meow";
    }
}

class Bird extends Pet implements IInteractable {
    private int hunger;
    private int mood;

    Bird(String n, int a) {
        super(n, "Bird", a);
        hunger = 30;
        mood = 70;
    }

    public void feed() {
        hunger -= 5;
    }

    public void play() {
        mood += 10;
    }

    public void sleep() {
        hunger += 3;
    }

    public String makeSound() {
        return "Tweet";
    }
}
