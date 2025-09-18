import java.util.*;

class Subject {
    private String name;
    private double marks;
    public Subject(String name, double marks) {
        this.name = name; this.marks = marks;
    }
    public String getName(){ return name; }
    public double getMarks(){ return marks; }
}

class Student {
    private int id;
    private String name;
    private List<Subject> subjects = new ArrayList<>();
    public Student(int id, String name){ this.id=id; this.name=name; }
    public void addSubject(Subject s){ subjects.add(s); }
    public List<Subject> getSubjects(){ return subjects; }
    public String getName(){ return name; }
    public int getId(){ return id; }
}

class GradeCalculator {
    public double calculateAverage(Student s){
        List<Subject> subs = s.getSubjects();
        if(subs.isEmpty()) return 0.0;
        double sum=0;
        for(Subject sb: subs) sum += sb.getMarks();
        return sum / subs.size();
    }
    public String calculateGrade(Student s){
        double avg = calculateAverage(s);
        if(avg >= 90) return "A+";
        if(avg >= 80) return "A";
        if(avg >= 70) return "B";
        if(avg >= 60) return "C";
        return "F";
    }
}

public class SchoolResults {
    public static void main(String[] args){
        Student john = new Student(1,"John");
        john.addSubject(new Subject("Maths", 90));
        john.addSubject(new Subject("Science",85));
        GradeCalculator gc = new GradeCalculator();
        System.out.println(john.getName() + " avg: " + gc.calculateAverage(john));
        System.out.println(john.getName() + " grade: " + gc.calculateGrade(john));
    }
}
