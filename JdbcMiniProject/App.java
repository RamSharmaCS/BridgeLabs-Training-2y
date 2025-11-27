import java.sql.SQLException;
import java.util.*;

public class App {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        StudentDAO studentDAO = new StudentDAO();
        ResultDAO resultDAO = new ResultDAO();

        while (true) {
            System.out.println("\n----- Student Result Management -----");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Add Result");
            System.out.println("5. View Results");
            System.out.println("6. Delete Result");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    studentDAO.insertStudent(new Student(id, name, course));
                    break;

                case 2:
                    studentDAO.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    studentDAO.deleteStudent(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter Student ID: ");
                    int sid = sc.nextInt();

                    System.out.print("Enter Marks for Subject 1: ");
                    int s1 = sc.nextInt();

                    System.out.print("Enter Marks for Subject 2: ");
                    int s2 = sc.nextInt();

                    System.out.print("Enter Marks for Subject 3: ");
                    int s3 = sc.nextInt();

                    System.out.print("Enter Marks for Subject 4: ");
                    int s4 = sc.nextInt();

                    System.out.print("Enter Marks for Subject 5: ");
                    int s5 = sc.nextInt();

                    Result res = new Result(sid, s1, s2, s3, s4, s5);
                    resultDAO.insertResult(res);
                    break;

                case 5:
                    System.out.print("Enter Student ID to view result: ");
                    int sidView = sc.nextInt();
                    resultDAO.viewResultById(sidView);
                    break;


                case 6:
                    System.out.print("Enter Student ID: ");
                    resultDAO.deleteResult(sc.nextInt());
                    break;

                case 7:
                    System.out.println("Exiting...");
                    System.exit(0);
            }
            System.out.println("Program Finished.");
            break;

        }

    }
}

