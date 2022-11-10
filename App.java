import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App extends Application{

    public void start(Stage primaryStage) {
        BorderPane bPane = new BorderPane();
        Scene scene = new Scene(bPane, 600, 600);
        scene.setFill(Color.BLACK);
        Button btn = new Button("Start Customizing Avatar");
        CharacterPane characterPane = new CharacterPane();
        btn.setOnAction(e -> {
            btn.setVisible(false);
            Scene characterScene = new Scene(characterPane, 600, 600);
            primaryStage.setScene(characterScene);
        });
        bPane.setCenter(btn);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
        primaryStage.setTitle("Avatar Customization");
    }
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}