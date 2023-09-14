package CursoJava.BasesDeDatos;
import java.sql.*;

public class Estudiantes {
    public static void main(String[] args) {
        // Datos de conexi�n a la base de datos (ajusta estos valores seg�n tu configuraci�n)
        String url = "jdbc:mysql://localhost:3306/universidad";
        String usuario = "root";
        String pass = "";

        try {
            // Establecer la conexi�n a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, pass);

            // Crear una declaraci�n SQL
            Statement statement = conexion.createStatement();

            // Ejecutar una consulta para obtener todos los datos de estudiantes
            String consulta = "SELECT * FROM estudiantes";
            ResultSet resultado = statement.executeQuery(consulta);

            // Iterar a trav�s de los resultados y mostrarlos por consola
            while (resultado.next()) {
                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                String legajo = resultado.getString("legajo");
                String dni = resultado.getString("dni");

                System.out.println("ID: " + id);
                System.out.println("Nombre: " + nombre);
                System.out.println("Apellido: " + apellido);
                System.out.println("Legajo: " + legajo);
                System.out.println("DNI: " + dni);
                System.out.println("-----------------------");
            }

            // Cerrar la conexi�n y recursos
            resultado.close();
            statement.close();
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
