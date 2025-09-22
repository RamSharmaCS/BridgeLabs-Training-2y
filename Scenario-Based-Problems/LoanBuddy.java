interface IApprovable {
    boolean approveLoan();
    double calculateEMI();
}

class Applicant {
    private String name;
    private int creditScore;
    private double income;
    private double loanAmount;

    Applicant(String n, int cs, double inc, double amt) {
        name = n;
        creditScore = cs;
        income = inc;
        loanAmount = amt;
    }

    public String getName() {
        return name;
    }

    public double getLoanAmount() {
        return loanAmount;
    }
}

class LoanApplication implements IApprovable {
    private String type;
    private int term;
    private double interestRate;
    private Applicant applicant;
    private boolean status;

    LoanApplication(Applicant a, String t, int tm, double r) {
        applicant = a;
        type = t;
        term = tm;
        interestRate = r;
        status = false;
    }

    public boolean approveLoan() {
        status = applicant.getLoanAmount() < applicant.income * 5 && applicant.creditScore > 650;
        return status;
    }

    public double calculateEMI() {
        double P = applicant.getLoanAmount();
        double R = interestRate / 12 / 100;
        int N = term * 12;
        double emi = P * R * Math.pow(1 + R, N) / (Math.pow(1 + R, N) - 1);
        return emi;
    }
}

class HomeLoan extends LoanApplication {
    HomeLoan(Applicant a, int tm, double r) {
        super(a, "Home", tm, r);
    }

    public double calculateEMI() {
        return super.calculateEMI() * 0.98;
    }
}

class AutoLoan extends LoanApplication {
    AutoLoan(Applicant a, int tm, double r) {
        super(a, "Auto", tm, r);
    }

    public double calculateEMI() {
        return super.calculateEMI() * 1.02;
    }
}
