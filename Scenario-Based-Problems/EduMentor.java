interface ICertifiable {
    String generateCertificate();
}

class User {
    protected String name;
    protected String email;
    protected int userId;

    User(String n, String e, int u) {
        name = n;
        email = e;
        userId = u;
    }
}

class Learner extends User {
    Learner(String n, String e, int u) {
        super(n, e, u);
    }
}

class Instructor extends User {
    Instructor(String n, String e, int u) {
        super(n, e, u);
    }
}

class Quiz {
    private String[] questions;
    private String[] answers;
    private int score;

    Quiz(String[] q, String[] a) {
        questions = q;
        answers = a;
        score = 0;
    }

    public int getScore() {
        return score;
    }
}

class Certificate implements ICertifiable {
    public String generateCertificate() {
        return "Certificate Issued";
    }
}
