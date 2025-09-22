interface Payable {
    double calculatePayment();
}

class Patient {
    private String name;
    private String medicalHistory;
    private int age;

    Patient(String n, int a, String mh) {
        name = n;
        age = a;
        medicalHistory = mh;
    }

    Patient(String n, int a) {
        name = n;
        age = a;
        medicalHistory = "";
    }

    public String getSummary() {
        return name + ", " + age;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    void displayInfo() {
        System.out.println(name + " (" + age + ")");
    }
}

class InPatient extends Patient {
    private String ward;

    InPatient(String n, int a, String mh, String w) {
        super(n, a, mh);
        ward = w;
    }

    public String getWard() {
        return ward;
    }

    @Override
    void displayInfo() {
        System.out.println(getSummary() + ", Ward: " + ward);
    }
}

class OutPatient extends Patient {
    private String appointmentDate;

    OutPatient(String n, int a, String mh, String ad) {
        super(n, a, mh);
        appointmentDate = ad;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    @Override
    void displayInfo() {
        System.out.println(getSummary() + ", Appointment: " + appointmentDate);
    }
}

class Doctor {
    private String name;
    private String specialization;

    Doctor(String n, String s) {
        name = n;
        specialization = s;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    void displayInfo() {
        System.out.println(name + " [" + specialization + "]");
    }
}

class Bill implements Payable {
    private Patient patient;
    private Doctor doctor;
    private double amount;
    private double discount;
    private double tax;

    Bill(Patient p, Doctor d, double a, double ds, double t) {
        patient = p;
        doctor = d;
        amount = a;
        discount = ds;
        tax = t;
    }

    @Override
    public double calculatePayment() {
        double afterDiscount = amount - discount;
        return afterDiscount + tax;
    }
}
