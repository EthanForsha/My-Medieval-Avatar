import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

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
        Font font = Font.font("Arial", FontWeight.NORMAL, 25);
        btnHeadLeft.setFont(font);
        Button btnHeadRight = new Button(">");
        btnHeadRight.setFont(font);
        Button btnChestLeft = new Button("<");
        btnChestLeft.setFont(font);
        Button btnChestRight = new Button(">");
        btnChestRight.setFont(font);
        Button btnLegsLeft = new Button("<");
        btnLegsLeft.setFont(font);
        Button btnLegsRight = new Button(">");
        btnLegsRight.setFont(font);
        gPane.add(btnHeadRight,2,0);
        gPane.add(btnHeadLeft,0,0);
        gPane.add(btnChestRight,2,1);
        gPane.add(btnChestLeft,0,1);
        gPane.add(btnLegsRight,2,2);
        gPane.add(btnLegsLeft,0,2);
        bPane.setCenter(gPane);

        Label emptySpace = new Label("");
        Label emptySpace2 = new Label("");
        Label emptySpace3 = new Label("");
        gPane.add(emptySpace, 0, 3);
        gPane.add(emptySpace2, 1, 3);
        gPane.add(emptySpace3, 2, 3);
        Font font2 = Font.font("Serif", FontWeight.BOLD, 12);
        Button btnPreview = new Button("      Preview Avatar      ");
        btnPreview.setFont(font2);
        gPane.add(btnPreview, 1, 4);
        Button btnExit = new Button(" Exit ");
        btnExit.setFont(font2);
        gPane.add(btnExit, 0, 4);
        Button btnArmor = new Button("Armor");
        btnArmor.setFont(font2);
        gPane.add(btnArmor, 2, 4);

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
                gPane.add(btnPreview, 1, 4);
            }
        });

        btnHeadRight.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                gPane.getChildren().removeIf( node -> GridPane.getColumnIndex(node) == 1);
                gPane.add(new ImageView(character.getNextHead()), 1, 0);
                gPane.add(new ImageView(character.getLegs()), 1, 2);
                gPane.add(new ImageView(character.getChest()), 1, 1);
                gPane.add(btnPreview, 1, 4);
            }
        });

        btnChestLeft.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                gPane.getChildren().removeIf( node -> GridPane.getColumnIndex(node) == 1);
                gPane.add(new ImageView(character.getHead()), 1, 0);
                gPane.add(new ImageView(character.getLegs()), 1, 2);
                gPane.add(new ImageView(character.getPreviousChest()), 1, 1);
                gPane.add(btnPreview, 1, 4);
            }
        });

        btnChestRight.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                gPane.getChildren().removeIf( node -> GridPane.getColumnIndex(node) == 1);
                gPane.add(new ImageView(character.getHead()), 1, 0);
                gPane.add(new ImageView(character.getLegs()), 1, 2);
                gPane.add(new ImageView(character.getNextChest()), 1, 1);
                gPane.add(btnPreview, 1, 4);
            }
        });

        btnLegsLeft.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                gPane.getChildren().removeIf( node -> GridPane.getColumnIndex(node) == 1);
                gPane.add(new ImageView(character.getPreviousLegs()), 1, 2);
                gPane.add(new ImageView(character.getHead()), 1, 0);
                gPane.add(new ImageView(character.getChest()), 1, 1);
                gPane.add(btnPreview, 1, 4);
            }
        });

        btnLegsRight.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                gPane.getChildren().removeIf( node -> GridPane.getColumnIndex(node) == 1);
                gPane.add(new ImageView(character.getNextLegs()), 1, 2);
                gPane.add(new ImageView(character.getHead()), 1, 0);
                gPane.add(new ImageView(character.getChest()), 1, 1);
                gPane.add(btnPreview, 1, 4);
            }
        });

        btnArmor.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                gPane.getChildren().removeIf( node -> GridPane.getColumnIndex(node) == 1);
                if(btnArmor.getText().equals("Armor"))
                {   
                    btnChestLeft.setVisible(false);
                    btnChestRight.setVisible(false);
                    btnHeadLeft.setVisible(false);
                    btnHeadRight.setVisible(false);
                    btnLegsLeft.setVisible(false);
                    btnLegsRight.setVisible(false);
                    btnArmor.setText("Avatar");
                    character.toggleArmorOn();
                    gPane.add(new ImageView(character.getLegs()), 1, 2);
                    gPane.add(new ImageView(character.getHead()), 1, 0);
                    gPane.add(new ImageView(character.getChest()), 1, 1);
                }
                else if(btnArmor.getText().equals("Avatar")){
                    btnChestLeft.setVisible(true);
                    btnChestRight.setVisible(true);
                    btnHeadLeft.setVisible(true);
                    btnHeadRight.setVisible(true);
                    btnLegsLeft.setVisible(true);
                    btnLegsRight.setVisible(true);
                    btnArmor.setText("Armor");
                    character.toggleArmorOff();
                    gPane.add(new ImageView(character.getLegs()), 1, 2);
                    gPane.add(new ImageView(character.getHead()), 1, 0);
                    gPane.add(new ImageView(character.getChest()), 1, 1);
                }
                gPane.add(btnPreview, 1, 4);
            }
        });

        btnExit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Platform.exit();
            }
        });
    }

    public GridPane getGridPane(){
        return this.gPane;
    }
}
