import java.io.InputStream;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class CharacterPane extends Pane {

    public BorderPane pane;
    public GridPane gPane;

    public CharacterPane(){
        // Maybe try not making a grid pane and instead put the buttons and images
        // directly on the pane?
        pane = new BorderPane();
        gPane = new GridPane();
        gPane.setAlignment(Pos.CENTER);
        gPane.setHgap(50);
        gPane.setVgap(50);

        Button btnHeadLeft = new Button("<");
        Button btnHeadRight = new Button(">");
        Button btnChestLeft = new Button("<");
        Button btnChestRight = new Button(">");
        Button btnLegsLeft = new Button("<");
        Button btnLegsRight = new Button(">");
        gPane.add(btnHeadRight,2,0,1,1);
        gPane.add(btnHeadLeft,0,0,1,1);
        gPane.add(btnChestRight,2,1,1,1);
        gPane.add(btnChestLeft,0,1,1,1);
        gPane.add(btnLegsRight,2,2,1,1);
        gPane.add(btnLegsLeft,0,2,1,1);
        pane.setCenter(gPane);

        Character character = new Character();
        Image Head = character.getHead();
        Image Chest = character.getChest();
        Image Legs = character.getLegs();
        gPane.add(new ImageView(Head), 1, 0);
        gPane.add(new ImageView(Chest), 1, 1);
        gPane.add(new ImageView(Legs), 1, 2);

        btnHeadLeft.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //gPane.add(new ImageView(character.getPreviousHead()), 1, 0); // works but puts on top of old
            }
        });
        btnHeadRight.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //gPane.add(new ImageView(character.getNextHead()), 1, 0); // works but puts on top of old
            }
        });
        btnChestLeft.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Implement
            }
        });
        btnChestRight.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Implement
            }
        });
        btnLegsLeft.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Implement
            }
        });
        btnLegsRight.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Implement
            }
        });
    }

    public GridPane getGridPane(){
        return this.gPane;
    }
}
