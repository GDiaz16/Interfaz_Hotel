package Interfaz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class CRUD {

    private static Connection conexion;
    private static String bd = "hotel";
     private static String host = "localhost";
    private static String server = "jdbc:mysql://" + host + "/" + bd;

    public void call() {
        try {
            //esta variable es para colocar el parametro del metodo que se esta llamando
            String parameter = "";
            // Llamar procedimientos almacenados
            PreparedStatement parametro = conexion.prepareStatement(
                    "CALL aumento(?);");
            parametro.setString(1, parameter);

            int retorno = parametro.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Imposible realizar llamada ... FAIL");
        }
    }

    public void delete() {
        //id de lo que se vaya a borrar
        String id = "";
        try {
            // Preparamos el delete
            PreparedStatement borrar = conexion.prepareStatement(
                    "DELETE FROM obra WHERE Id_obra = ?");
            borrar.setString(1, id);

            int retorno = borrar.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Imposible realizar delete ... FAIL");
        }
    }

    public void insert() {

        try {
            // Preparamos la actualización del registro con id = 5
            PreparedStatement insertar = conexion.prepareStatement(
                    "INSERT obra VALUES (650,'Esfinge', 'Escultura',1420,1005);");
            insertar.execute();

            int retorno = insertar.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Imposible realizar insercion ... FAIL");
        }
    }

    public void update() {
        //realizar update
        int idObra = 0;
        int costoObra = 0 ;
        try {
            // Preparamos la actualización del registro con id = 5
            PreparedStatement actualizar = conexion.prepareStatement(
                    "UPDATE obra SET Costo = ? WHERE  Id_obra = ?");
            actualizar.setString(1, costoObra + "");
            actualizar.setString(2, idObra + "");

            int retorno = actualizar.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Imposible realizar actualizacion ... FAIL");
        }
    }

    public void consulta() {
        String tabla = "";
        try {
            // Preparamos la consulta
            Statement s = conexion.createStatement();
            ResultSet rs = s.executeQuery("select * from " + tabla + ";");
            // Recorremos el resultado, mientras haya registros para leer, y escribimos el resultado en pantalla            .
            if (tabla.equals("museo")) {
                System.out.println("ID" + "\t nombre museo");
            } else if (tabla.equals("obra")) {
                System.out.println("ID" + "\tobr_nombre" + "\t\t\tobr_tipo");
            }

            while (rs.next()) {
                if (tabla.equals("museo")) {
                    System.out.println(rs.getInt(1) + "\t" + rs.getString(2));

                } else if (tabla.equals("obra")) {
                    System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t\t\t" + rs.getString("Tipo_obra"));
                } else {
                    System.out.println("La tabla no existe");
                }
            }
        } catch (SQLException ex) {
            System.out.println("Imposible realizar consulta ... FAIL");
        }
    }

    public void principal(String user, String password) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(server, user, password);
            JOptionPane.showMessageDialog(null,"Conexión a base de datos " + bd + " ... OK", "Informaccion Conexion",1);
           
        } catch (ClassNotFoundException ex) {
            System.out.println("Error cargando el Driver MySQL JDBC ... FAIL");
        } catch (SQLException ex) {
            System.out.println("Imposible realizar conexion con " + server + " ... FAIL");
        }
        
        try {
            conexion.close();
            System.out.println("Cerrar conexion con " + server + " ... OK");
        } catch (SQLException ex) {
            System.out.println("Imposible cerrar conexion ... FAIL");
        }
    }

}
