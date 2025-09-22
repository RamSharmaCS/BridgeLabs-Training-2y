interface Graded {
    void assignGrade(double value);
}

class Student {
    private String name;
    private double gpa;

    Student(String n, double g) {
        name = n;
        gpa = g;
    }

    public String getTranscript() {
        return name + ", GPA: " + gpa;
    }
}

class Undergraduate extends Student {
    Undergraduate(String n, double g) {
        super(n, g);
    }
}

class Postgraduate extends Student {
    Postgraduate(String n, double g) {
        super(n, g);
    }
}

class Faculty {
    private String name;

    Faculty(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

class Course implements Graded {
    private String title;
    private double grade;

    Course(String t) {
        title = t;
    }

    public String getTitle() {
        return title;
    }

    public void assignGrade(double value) {
        grade = value;
    }
}

class Enrollment {
    private Student student;
    private Course course;

    Enrollment(Student s, Course c) {
        student = s;
        course = c;
    }
}
