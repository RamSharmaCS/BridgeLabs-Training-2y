public class Result {
    private int studentId;
    private int sub1, sub2, sub3, sub4, sub5;
    private int total;
    private double percentage;
    private String status;

    public Result(int studentId, int sub1, int sub2, int sub3, int sub4, int sub5) {
        this.studentId = studentId;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
        this.sub5 = sub5;

        this.total = sub1 + sub2 + sub3 + sub4 + sub5;
        this.percentage = total / 5.0;

        // pass if all subjects >= 35
        this.status = (sub1 >= 35 && sub2 >= 35 && sub3 >= 35 && sub4 >= 35 && sub5 >= 35)
                ? "PASS"
                : "FAIL";
    }

    public int getStudentId() { return studentId; }
    public int getSub1() { return sub1; }
    public int getSub2() { return sub2; }
    public int getSub3() { return sub3; }
    public int getSub4() { return sub4; }
    public int getSub5() { return sub5; }
    public int getTotal() { return total; }
    public double getPercentage() { return percentage; }
    public String getStatus() { return status; }
}
