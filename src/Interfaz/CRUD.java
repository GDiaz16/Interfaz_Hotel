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
    public int retorno;
    public int conect;
    public int estado;

    public void insertarHuesped(long documento, String nombre, String apellido,
            long telefono, String fechaNacimiento, String modoPago, long idResponsable, int huesped) {
        System.out.println("retorno inicio");
        try {
            PreparedStatement parametro;
            if (huesped == 0) {
                parametro = conexion.prepareStatement("CALL agregar_huesped_responsable(?,?,?,?,?,?);");
                parametro.setString(6, modoPago);
            } else {
                parametro = conexion.prepareStatement("CALL agregar_huesped_acompañante(?,?,?,?,?,?);");
                parametro.setString(6, idResponsable + "");
            }
            parametro.setString(1, documento + "");
            parametro.setString(2, nombre);
            parametro.setString(3, apellido);
            parametro.setString(4, telefono + "");
            parametro.setString(5, fechaNacimiento);
            retorno = 1;
            parametro.executeUpdate();
//            parametro.
//                   System.out.println("estado"+parametro.executeUpdate());
//            System.out.println("retorno try" + retorno);

        } catch (SQLException ex) {
            System.out.println("Imposible realizar llamada ... FAIL");
            retorno = 0;
        }
    }

    public void insertarAuto(String placa, long idHuesped) {
        try {

            System.out.println("estado " + estado);
            PreparedStatement parametro;
            parametro = conexion.prepareStatement("call agregar_automovil(?,?);");
            parametro.setString(1, placa);
            parametro.setString(2, idHuesped + "");
            parametro.executeUpdate();
            estado = 1;
            JOptionPane.showMessageDialog(null, "Auto Guardado", "Informacion", 1);
//            System.out.println("estado"+parametro.executeUpdate());
//            System.out.println("estado " + estado);
////if(estado = 1)
        } catch (SQLException ex) {
            estado = 0;
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
        int costoObra = 0;
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

    public void conexionUsuario(String user, String password) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(server, user, password);
            JOptionPane.showMessageDialog(null, "Conexión a base de datos " + bd + " ... OK", "Informacion Conexion", 1);
            conect = 1;
        } catch (ClassNotFoundException ex) {
            System.out.println("Error cargando el Driver MySQL JDBC ... FAIL");
        } catch (SQLException ex) {
            System.out.println("Imposible realizar conexion con " + server + " ... FAIL");
            conect = 0;
        }

    }

    public void cerrarConexion() {
        try {
            conexion.close();
            System.out.println("Cerrar conexion con " + server + " ... OK");
        } catch (SQLException ex) {
            System.out.println("Imposible cerrar conexion ... FAIL");
        }
    }
}
