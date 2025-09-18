import java.util.*;

class Patient {
    private int id; private String name;
    public Patient(int id, String name){ this.id=id; this.name=name; }
    public String getName(){ return name; }
}

class Doctor {
    private int id; private String name;
    public Doctor(int id, String name){ this.id=id; this.name=name; }
    public void consult(Patient p){
        System.out.println("Doctor " + name + " consults patient " + p.getName());
    }
}

public class HospitalDoctorsPatients {
    public static void main(String[] args){
        Doctor d = new Doctor(1, "Dr. Kumar");
        Patient p = new Patient(101, "Sunita");
        d.consult(p);
    }
}
