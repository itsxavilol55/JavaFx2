package hellofx;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import com.mysql.cj.exceptions.ExceptionFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class Controller
{
    @FXML private Label label1;
    private Button boton1;
    private TextField input1;
    private TextField input2;
    private TextField input3;
    public void initialize()
    {
        // String javaVersion = System.getProperty("java.version");
        // String javafxVersion = System.getProperty("javafx.version");
        // label1.setText("Hello, JavaFX");
    }
    @FXML private void enviar(ActionEvent event)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplo", "root", "javi54321");
            Statement stmt = con.createStatement();
            String nombre = input1.getText();
            ResultSet rs = stmt.executeQuery("select * from tabla1;");
            int rs1 = stmt.executeUpdate("INSERT INTO tabla1 (nombre, edad) VALUES ('" + nombre + "', 562)");
        }
        catch (Exception e)
        {
            System.err.println(e);
        }
    }
}