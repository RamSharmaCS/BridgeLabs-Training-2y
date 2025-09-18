import java.util.*;

class Course {
    private String code, title;
    private List<Student> enrolled = new ArrayList<>();
    public Course(String code, String title){ this.code=code; this.title=title; }
    public void enroll(Student s){ if(!enrolled.contains(s)) enrolled.add(s); }
    public String getCode(){ return code; }
    public List<Student> getEnrolled(){ return enrolled; }
}

class Student {
    private int id; private String name;
    private List<Course> courses = new ArrayList<>();
    public Student(int id, String name){ this.id=id; this.name=name; }
    public void enrollCourse(Course c){
        if(!courses.contains(c)){ courses.add(c); c.enroll(this); }
    }
    public void viewCourses(){
        System.out.println(name + " courses:");
        for(Course c: courses) System.out.println("- " + c.getCode());
    }
}

class School {
    private String name;
    private List<Student> students = new ArrayList<>();
    public School(String name){ this.name=name; }
    public void addStudent(Student s){ students.add(s); }
}

public class SchoolStudentsCourses {
    public static void main(String[] args){
        School school = new School("MySchool");
        Student s1 = new Student(1,"Anoop");
        Course c1 = new Course("CS101","Intro to CS");
        s1.enrollCourse(c1);
        school.addStudent(s1);
        s1.viewCourses();
    }
}
