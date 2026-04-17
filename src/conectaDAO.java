
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */
public class conectaDAO {
    
    public Connection connectDB(){
        Connection con;
   
        try {

            String url = "jdbc:mysql://localhost:3306/leilao";
            String user = "root";
            String password = "Lala.2510";

            con = DriverManager.getConnection(url, user, password);
            return con;

        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
            return null;
        }
    }

    public void desconectar(Connection con) {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
                System.out.println("Você se desconectou do banco de dados");

            }

        } catch (SQLException e) {
            System.out.println("Não foi possível desconectar do banco de dados.");
        }
    }
    
}
