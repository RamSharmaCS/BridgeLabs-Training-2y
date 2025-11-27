import java.sql.*;
import java.util.Scanner;

public class prepared {
    public static void main(String[] args) throws Exception {

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "12345678");

        String sqlQuery = "INSERT INTO STUDENT VALUES(?, ?, ?,?)";

// create PreparedStatement
        PreparedStatement ps = conn.prepareStatement(sqlQuery);
// create Scanner
        Scanner scan = new Scanner(System.in);
// insert 3 records
        for (int i = 1; i <= 3; i++) {
            System.out.println("enter sid : ");
            int sid = scan.nextInt();
            scan.nextLine(); // consume newline
            System.out.println("enter sname : ");
            String sname = scan.nextLine();
            System.out.println("enter section : ");
            String section = scan.nextLine();
            System.out.println("enter marks : ");
            int marks = scan.nextInt();
// set the values
            ps.setInt(1, sid);
            ps.setString(2, sname);
            ps.setString(3, section);
            ps.setInt(4, marks);

    }

  }
}
