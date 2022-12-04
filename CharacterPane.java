import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class CharacterPane extends Pane {

    public BorderPane bPane;
    public GridPane gPane;

    public CharacterPane(){
        bPane = new BorderPane();
        gPane = new GridPane();
        gPane.setAlignment(Pos.CENTER);
        gPane.setHgap(30);
        gPane.setVgap(-10);

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
        bPane.setCenter(gPane);

        Character character = new Character();
        Image Head = character.getHead();
        Image Chest = character.getChest();
        Image Legs = character.getLegs();
        ImageView HeadView = new ImageView(Head);
        ImageView ChestView = new ImageView(Chest);
        ImageView LegsView = new ImageView(Legs);
        gPane.add(HeadView, 1, 0);  
        gPane.add(LegsView, 1, 2);
        gPane.add(ChestView, 1, 1);

        btnHeadLeft.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                gPane.getChildren().removeIf( node -> GridPane.getColumnIndex(node) == 1);
                gPane.add(new ImageView(character.getPreviousHead()), 1, 0);
                gPane.add(new ImageView(character.getLegs()), 1, 2);
                gPane.add(new ImageView(character.getChest()), 1, 1);
            }
        });
        btnHeadRight.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                gPane.getChildren().removeIf( node -> GridPane.getColumnIndex(node) == 1);
                gPane.add(new ImageView(character.getNextHead()), 1, 0);
                gPane.add(new ImageView(character.getLegs()), 1, 2);
                gPane.add(new ImageView(character.getChest()), 1, 1);
            }
        });
        btnChestLeft.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                gPane.getChildren().removeIf( node -> GridPane.getColumnIndex(node) == 1);
                gPane.add(new ImageView(character.getHead()), 1, 0);
                gPane.add(new ImageView(character.getLegs()), 1, 2);
                gPane.add(new ImageView(character.getPreviousChest()), 1, 1);
            }
        });
        btnChestRight.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                gPane.getChildren().removeIf( node -> GridPane.getColumnIndex(node) == 1);
                gPane.add(new ImageView(character.getHead()), 1, 0);
                gPane.add(new ImageView(character.getLegs()), 1, 2);
                gPane.add(new ImageView(character.getNextChest()), 1, 1);
            }
        });
        btnLegsLeft.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                gPane.getChildren().removeIf( node -> GridPane.getColumnIndex(node) == 1);
                gPane.add(new ImageView(character.getPreviousLegs()), 1, 2);
                gPane.add(new ImageView(character.getHead()), 1, 0);
                gPane.add(new ImageView(character.getChest()), 1, 1);
            }
        });
        btnLegsRight.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                gPane.getChildren().removeIf( node -> GridPane.getColumnIndex(node) == 1);
                gPane.add(new ImageView(character.getNextLegs()), 1, 2);
                gPane.add(new ImageView(character.getHead()), 1, 0);
                gPane.add(new ImageView(character.getChest()), 1, 1);
            }
        });
    }


    public GridPane getGridPane(){
        return this.gPane;
    }
}
