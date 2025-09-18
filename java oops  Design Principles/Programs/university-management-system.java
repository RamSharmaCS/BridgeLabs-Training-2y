import java.util.*;

class Professor {
    private String id, name;
    public Professor(String id, String name){ this.id=id; this.name=name; }
    public String getName(){ return name; }
}

class CourseUM {
    private String code; private String title;
    private Professor professor;
    private List<StudentUM> students = new ArrayList<>();
    public CourseUM(String code, String title){ this.code=code; this.title=title; }
    public void assignProfessor(Professor p){ this.professor = p; }
    public void enrollStudent(StudentUM s){ students.add(s); }
    public void list(){
        System.out.println("Course " + code + " - " + title + " Prof: " + (professor!=null?professor.getName():"None"));
    }
}

class StudentUM {
    private String id, name;
    private List<CourseUM> courses = new ArrayList<>();
    public StudentUM(String id, String name){ this.id=id; this.name=name; }
    public void enrollCourse(CourseUM c){
        courses.add(c); c.enrollStudent(this);
    }
}

public class UniversityManagement {
    public static void main(String[] args){
        Professor prof = new Professor("P1","Dr. Singh");
        CourseUM course = new CourseUM("CS101","Data Structures");
        course.assignProfessor(prof);
        StudentUM s = new StudentUM("S1","Radhika");
        s.enrollCourse(course);
        course.list();
    }
}
