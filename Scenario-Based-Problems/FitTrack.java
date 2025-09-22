interface ITrackable {
    void startWorkout();
    void stopWorkout();
}

class UserProfile {
    private String name;
    private int age;
    private double weight;
    private String goal;

    UserProfile(String n, int a, double w, String g) {
        name = n;
        age = a;
        weight = w;
        goal = g;
    }
}

class Workout implements ITrackable {
    private String type;
    private int duration;
    private double caloriesBurned;

    Workout(String t, int d, double c) {
        type = t;
        duration = d;
        caloriesBurned = c;
    }

    public void startWorkout() {
    }

    public void stopWorkout() {
    }
}
