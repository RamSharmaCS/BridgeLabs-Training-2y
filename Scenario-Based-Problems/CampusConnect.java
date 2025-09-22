interface ICourseActions {
    void enrollCourse(String courseId);
    void dropCourse(String courseId);
}

class Person {
    protected String name;
    protected String email;
    protected int id;

    Person(String n, String e, int i) {
        name = n;
        email = e;
        id = i;
    }
}

class Student extends Person implements ICourseActions {
    Student(String n, String e, int i) {
        super(n, e, i);
    }

    public void enrollCourse(String courseId) {
    }

    public void dropCourse(String courseId) {
    }
}

class Faculty extends Person implements ICourseActions {
    Faculty(String n, String e, int i) {
        super(n, e, i);
    }

    public void enrollCourse(String courseId) {
    }

    public void dropCourse(String courseId) {
    }
}
