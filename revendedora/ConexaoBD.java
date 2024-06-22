package revendedora;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoBD {

    private static final String URL = "jdbc:h2:mem:revendedora";
    private static final String USER = "sa";
    private static final String PASS = "";

    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar ao banco de dados", e);
        }
    }

    public static void criarTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS veiculo ("
                   + "id INT AUTO_INCREMENT PRIMARY KEY, "
                   + "marca VARCHAR(50), "
                   + "modelo VARCHAR(50), "
                   + "ano INT, "
                   + "preco DOUBLE)";
        try (Connection conn = conectar();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
