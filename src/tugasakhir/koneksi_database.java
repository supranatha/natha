import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Supranatha
 */
public class koneksi_database {

    // Deklarasi variabel koneksi
    private static Connection koneksi;

    // Method untuk mendapatkan koneksi ke database
    public static Connection getKoneksi() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/kasir_hp"; // URL database
                String user = "root"; // Username database
                String password = ""; // Password database
                
                // Membuat koneksi ke database
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi berhasil!");
            } catch (SQLException e) {
                System.out.println("Koneksi gagal: " + e.getMessage());
            }
        }
        return koneksi;
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        // Mencoba untuk melakukan koneksi ke database
        Connection conn = koneksi_database.getKoneksi();
        
        // Memastikan apakah koneksi berhasil
        if (conn != null) {
            System.out.println("Connection is successful!");
        } else {
            System.out.println("Failed to establish a connection.");
        }
    }
}
