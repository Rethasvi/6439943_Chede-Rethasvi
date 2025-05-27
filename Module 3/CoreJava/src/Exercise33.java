import java.sql.*;
public class Exercise33 {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:bank.db";
        try (Connection conn = DriverManager.getConnection(url)) {
            conn.setAutoCommit(false);
            Statement stmt = conn.createStatement();
            try {
                stmt.executeUpdate("UPDATE accounts SET balance = balance - 100 WHERE id = 1");
                stmt.executeUpdate("UPDATE accounts SET balance = balance + 100 WHERE id = 2");
                conn.commit();
                System.out.println("Transaction successful");
            } catch (SQLException e) {
                conn.rollback();
                System.out.println("Transaction failed, rollback done");
            }
        } catch (SQLException e) {
            System.out.println("Connection error: " + e.getMessage());
        }
    }
}