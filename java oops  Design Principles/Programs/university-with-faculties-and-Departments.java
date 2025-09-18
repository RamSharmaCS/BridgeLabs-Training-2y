import java.util.*;

class Faculty {
    private String name;
    public Faculty(String name){ this.name=name; }
    public String getName(){ return name; }
}

class Department {
    private String name;
    private List<Faculty> faculties = new ArrayList<>();
    public Department(String name){ this.name = name; }
    public void assignFaculty(Faculty f){ faculties.add(f); }
    public void listFaculty(){
        System.out.println("Dept: " + name);
        for(Faculty f: faculties) System.out.println("- " + f.getName());
    }
}

class University {
    private String name;
    private List<Department> depts = new ArrayList<>();
    public University(String name){ this.name=name; }
    public Department createDepartment(String name){
        Department d = new Department(name);
        depts.add(d);
        return d;
    }
    public void closeUniversity(){ depts.clear(); }
}

public class UniversityFacultyDept {
    public static void main(String[] args){
        University u = new University("StateUni");
        Department cs = u.createDepartment("Computer Science");
        Faculty f1 = new Faculty("Dr. A");
        cs.assignFaculty(f1);
        cs.listFaculty();
        // faculty f1 could exist independently (aggregation)
    }
}
