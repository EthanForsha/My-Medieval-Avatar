import java.io.CharArrayReader;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class CharacterPane extends Pane {

    public BorderPane pane;

    public CharacterPane(){
        pane = new BorderPane();
        HBox hbox = new HBox();
        Label characterTemp = new Label("[Add Character Image Here]");
        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().add(characterTemp);
        characterTemp.setAlignment(Pos.CENTER);
        pane.setCenter(hbox);
    }
}
