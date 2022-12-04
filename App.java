import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

// App is responsible for launching the application to the main menu
public class App extends Application{

    public void start(Stage primaryStage) {
        MainMenu mainMenu = new MainMenu();
        BorderPane bPane = mainMenu.getBorderPane();
        Scene scene = new Scene(bPane, 600, 600);

        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
        primaryStage.setTitle("My Medieval Avatar");
        primaryStage.getIcons().add(new Image("File:Images/Backgrounds/Icon.png"));
    }
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}