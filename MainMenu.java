import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class MainMenu {
    private BorderPane bPane;
    
    public MainMenu(){
        
        bPane = new BorderPane();
        Button btnPlay = new Button("Play");
        Button btnExit = new Button("Exit");
        btnPlay.setPrefWidth(100);
        btnExit.setPrefWidth(100);
        Font font = Font.font("Serif", FontWeight.BOLD, 20);
        btnPlay.setFont(font);
        btnExit.setFont(font);
        ImageView title = new ImageView(new Image("File:Images/Backgrounds/Title.png"));
        title.setFitHeight(360);
        title.setFitWidth(360);
        title.setPreserveRatio(true);
        BackgroundImage backgroundMain = new BackgroundImage(new Image("File:Images/Backgrounds/Main Menu.jpg", 600, 600, false, true), BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        bPane.setBackground(new Background(backgroundMain));
        CharacterPane characterPane = new CharacterPane();
        GridPane gPane = characterPane.getGridPane();

        // Allows the user to enter the game from the main menu
        btnPlay.setOnAction(e -> {
            btnPlay.setVisible(false);
            btnExit.setVisible(false);
            title.setVisible(false);
            BackgroundImage backgroundHome = new BackgroundImage(new Image("File:Images/Backgrounds/Home.jpg", 600, 600, false, true), BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
            bPane.setBackground(new Background(backgroundHome));
            bPane.setCenter(gPane);
        });

        // Allows the user to exit the application using the exit button on the main menu
        btnExit.setOnAction( e -> {
            Platform.exit();
        });

        AnchorPane titlePane = new AnchorPane();
        AnchorPane.setLeftAnchor(title, 15d);
        AnchorPane.setTopAnchor(title, 60d);
        bPane.getChildren().add(titlePane);
        titlePane.getChildren().add(title);

        AnchorPane customizePane = new AnchorPane();
        AnchorPane.setLeftAnchor(btnPlay, 145d);
        AnchorPane.setTopAnchor(btnPlay, 115d);
        bPane.getChildren().add(customizePane);
        customizePane.getChildren().add(btnPlay);

        AnchorPane exitPane = new AnchorPane();
        AnchorPane.setLeftAnchor(btnExit, 145d);
        AnchorPane.setTopAnchor(btnExit, 160d);
        bPane.getChildren().add(exitPane);
        customizePane.getChildren().add(btnExit);

    }

    public BorderPane getBorderPane(){
        return this.bPane;
    }
}
