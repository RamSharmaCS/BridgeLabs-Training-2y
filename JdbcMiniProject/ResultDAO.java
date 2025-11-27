import java.sql.*;

public class ResultDAO {

    public void insertResult(Result r) {
        try (Connection conn = DBConnection.getConnection()) {

            PreparedStatement ps = conn.prepareStatement(
                    "INSERT INTO result(studentId, sub1, sub2, sub3, sub4, sub5, total, percentage, status) " +
                            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)"
            );

            ps.setInt(1, r.getStudentId());
            ps.setInt(2, r.getSub1());
            ps.setInt(3, r.getSub2());
            ps.setInt(4, r.getSub3());
            ps.setInt(5, r.getSub4());
            ps.setInt(6, r.getSub5());
            ps.setInt(7, r.getTotal());
            ps.setDouble(8, r.getPercentage());
            ps.setString(9, r.getStatus());

            ps.executeUpdate();
            System.out.println("Result Added Successfully!");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewResultById(int studentId) {
        try (Connection conn = DBConnection.getConnection()) {

            PreparedStatement ps = conn.prepareStatement(
                    "SELECT * FROM result WHERE studentId = ?"
            );
            ps.setInt(1, studentId);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("-------------------------------");
                System.out.println("Student ID : " + rs.getInt("studentId"));
                System.out.println("Subject 1  : " + rs.getInt("sub1"));
                System.out.println("Subject 2  : " + rs.getInt("sub2"));
                System.out.println("Subject 3  : " + rs.getInt("sub3"));
                System.out.println("Subject 4  : " + rs.getInt("sub4"));
                System.out.println("Subject 5  : " + rs.getInt("sub5"));
                System.out.println("Total Marks: " + rs.getInt("total"));
                System.out.println("Percentage : " + rs.getDouble("percentage"));
                System.out.println("Status     : " + rs.getString("status"));
                System.out.println("-------------------------------");
            } else {
                System.out.println("No result found for Student ID: " + studentId);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteResult(int studentId) {
        try (Connection conn = DBConnection.getConnection()) {

            PreparedStatement ps = conn.prepareStatement(
                    "DELETE FROM result WHERE studentId = ?"
            );
            ps.setInt(1, studentId);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Result Deleted Successfully!");
            } else {
                System.out.println("No result found for Student ID " + studentId);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
