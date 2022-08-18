package hellofx;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class Main extends Application
{
    @Override public void start(Stage primaryStage) throws Exception
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("hellofx.fxml"));
            Scene scene = new Scene(root, 600, 600);
            scene.getStylesheets().add(getClass().getResource("Style.css").toExternalForm());
            primaryStage.setTitle("Mi apps");
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}