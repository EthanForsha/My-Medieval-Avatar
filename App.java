import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application{

    public void start(Stage primaryStage) {
        BorderPane bPane = new BorderPane();
        Scene scene = new Scene(bPane, 600, 600);
        Button btn = new Button("Start Customizing Avatar");
        CharacterPane characterPane = new CharacterPane();
        GridPane gPane = characterPane.getGridPane();
        btn.setOnAction(e -> {
            btn.setVisible(false);
            bPane.setCenter(gPane);
        });
        bPane.setCenter(btn);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
        primaryStage.setTitle("MyAvatar");
    }
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}