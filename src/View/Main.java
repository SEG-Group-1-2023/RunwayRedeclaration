package View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    private static Stage classStage;
    private static boolean status;
    private static String username;

    public Main(){}

    public Main(String username) {
        Main.username = username;
    }

    public static String getUsername() {
        return username;
    }

    public static Stage getStage(){
        return classStage;
    }

    public static boolean isReset(){
        return status;
    }

    public static void setReset(boolean reset){
        status = reset;

    }

    @Override
    public void start(Stage stage) throws Exception {
        Main.classStage = stage;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Main.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);

        stage.setTitle("SEG Runway Project");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}
