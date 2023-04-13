package View;

import Controller.AirportManagerController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class UserManager extends Application {
    private static Stage classStage;
    private static String username;

    //default constructor
    public UserManager(){}

    public UserManager(String username) {
        UserManager.username = username;
    }

    public static String getUsername() {
        return username;
    }

    public static Stage getStage(){
        return classStage;
    }

    @Override
    public void start(Stage stage) throws Exception {
        classStage = stage;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/UserManager.fxml"));
        Parent root = loader.load();
        loader.setController(new AirportManagerController());

        Scene scene = new Scene(root);
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("/CSS/MainStylesheet.css")).toExternalForm());

        stage.setTitle("SEG Runway Project");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}
