import java.sql.*;

public class BankService {

    // ---------------- CREATE ACCOUNT ----------------
    public void createAccount(Account account) {
        String sql = "INSERT INTO accounts (name, balance) VALUES (?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, account.getName());
            ps.setDouble(2, account.getBalance());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //to be continued...
}
