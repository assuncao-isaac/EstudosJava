package A_JDBC.conn;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConectionFactory {

    public Connection getConnection() {

        Properties properties = new Properties();

        try (InputStream input = ConectionFactory.class
                .getClassLoader()
                .getResourceAsStream("db.properties")) {

            properties.load(input);

            String url = properties.getProperty("db.url");
            String username = properties.getProperty("db.username");
            String password = properties.getProperty("db.password");

            return DriverManager.getConnection(url, username, password);

        } catch (IOException | SQLException e) {
            throw new RuntimeException("Erro ao conectar com o banco de dados", e);
        }
    }
}