interface ISchedulable {
    void schedule();
    void reschedule(String newDate);
    void cancel();
}

class Event implements ISchedulable {
    private String eventName;
    private String location;
    private String date;
    private int attendees;
    private final int eventId;

    Event(String name, String loc, String d, int att, int id) {
        eventName = name;
        location = loc;
        date = d;
        attendees = att;
        eventId = id;
    }

    public int getEventId() {
        return eventId;
    }

    public void schedule() {
    }

    public void reschedule(String newDate) {
        date = newDate;
    }

    public void cancel() {
        attendees = 0;
    }
}

class BirthdayEvent extends Event {
    BirthdayEvent(String name, String loc, String d, int att, int id) {
        super(name, loc, d, att, id);
    }

    public void schedule() {
    }
}

class ConferenceEvent extends Event {
    ConferenceEvent(String name, String loc, String d, int att, int id) {
        super(name, loc, d, att, id);
    }

    public void schedule() {
    }
}

class User {
    private String userName;

    User(String n) {
        userName = n;
    }

    public String getUserName() {
        return userName;
    }
}
