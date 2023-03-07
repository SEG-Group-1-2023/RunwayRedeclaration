package View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        //sdf
        Scene scene = new Scene(root);

        stage.setTitle("SEG Runway Project");
        stage.setScene(scene);
        stage.show();
    }
}
