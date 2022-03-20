package co.edu.unbosque.model.persistences;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Santiago
 */
// Clase en la capa de datos, desde la que se realiza la conexión a la base de datos.
public abstract class ManejoConexion {

    protected Connection conexion;
    protected String driver = "oracle.jdbc.OracleDriver";

    private String host ="jdbc:oracle:thin:@localhost:1521:XE";
    private String User="Focus";
    private String password ="1234";
    
    protected void establecerConexion() throws SQLException {
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            conexion = DriverManager.getConnection(host, User, password);

        } catch (SQLException exception) {
            throw new SQLException("ERROR: ConsultaDAO obteniendo una conexi�n.");
        }
    }

    protected void cerrarCon() {
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
        }
    }
}

