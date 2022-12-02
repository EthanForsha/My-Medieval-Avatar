import java.io.InputStream;

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
        gPane.add(btnHeadRight, 2,0,1,1);
        gPane.add(btnHeadLeft,0,0,1,1);
        gPane.add(btnChestRight, 2,1,1,1);
        gPane.add(btnChestLeft,0,1,1,1);
        gPane.add(btnLegsRight, 2,2,1,1);
        gPane.add(btnLegsLeft,0,2,1,1);
        pane.setCenter(gPane);

        Character defaultCharacter = new Character();
        gPane.add(new ImageView(defaultCharacter.getHead()), 1, 0);
        gPane.add(new ImageView(defaultCharacter.getChest()), 1, 1);
        gPane.add(new ImageView(defaultCharacter.getLegs()), 1, 2);

        
    }

    public GridPane getGridPane(){
        return this.gPane;
    }
}
