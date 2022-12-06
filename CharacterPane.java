import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class CharacterPane extends Character
{

    public BorderPane bPane;
    public GridPane gPane;
    private Character character;
    public Button btnPreview;

    public CharacterPane()
    {
        bPane = new BorderPane();
        gPane = new GridPane();
        Backgrounds background = new Backgrounds();
        bPane.setBackground(new Background(background.getBackground()));
        gPane.setAlignment(Pos.CENTER);
        gPane.setHgap(30);
        gPane.setVgap(-10);

        // Sets up the customization slider buttons
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

        // Sets up 3 buttons for the customization page
        // Exit button to exit the app
        // Preview button to preview character on different backgrounds 
        // Armor button to preview "end game" armor on character
        // Finalize Character button to save the character and return to the main menu
        Label emptySpace = new Label("");
        Label emptySpace2 = new Label("");
        Label emptySpace3 = new Label("");
        gPane.add(emptySpace, 0, 3);
        gPane.add(emptySpace2, 1, 3);
        gPane.add(emptySpace3, 2, 3);
        Font font2 = Font.font("Serif", FontWeight.BOLD, 12);
        btnPreview = new Button("      Preview Avatar      ");
        btnPreview.setFont(font2);
        gPane.add(btnPreview, 1, 4);
        Button btnExit = new Button(" Exit ");
        btnExit.setFont(font2);
        gPane.add(btnExit, 0, 4);
        Button btnArmor = new Button("Armor");
        btnArmor.setFont(font2);
        gPane.add(btnArmor, 2, 4);

        // Creates a character for the user to customize
        // Starts with a default character
        character = new Character();
        Image Head = character.getHead();
        Image Chest = character.getChest();
        Image Legs = character.getLegs();
        ImageView HeadView = new ImageView(Head);
        ImageView ChestView = new ImageView(Chest);
        ImageView LegsView = new ImageView(Legs);
        gPane.add(HeadView, 1, 0);  
        gPane.add(LegsView, 1, 2);
        gPane.add(ChestView, 1, 1);

        // Creates the options to stop previewing character and
        // creates the option to change the background
        GridPane gridPreview = new GridPane();
        Button btnExitPreview = new Button("Stop Previewing");
        btnExitPreview.setFont(font2);
        btnExitPreview.setVisible(false);
        Button btnChangeBackground = new Button("Change Background");
        btnChangeBackground.setFont(font2);
        btnChangeBackground.setVisible(false);
        gridPreview.add(btnExitPreview, 0, 0);
        gridPreview.add(btnChangeBackground, 1, 0);
        bPane.setBottom(gridPreview);

        // Setups up functionality for the previous head option button
        btnHeadLeft.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
                gPane.getChildren().removeIf( node -> GridPane.getColumnIndex(node) == 1);
                gPane.add(new ImageView(character.getPreviousHead()), 1, 0);
                gPane.add(new ImageView(character.getLegs()), 1, 2);
                gPane.add(new ImageView(character.getChest()), 1, 1);
                gPane.add(btnPreview, 1, 4);
            }
        });

        // Setups up functionality for the next head option button
        btnHeadRight.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
                gPane.getChildren().removeIf( node -> GridPane.getColumnIndex(node) == 1);
                gPane.add(new ImageView(character.getNextHead()), 1, 0);
                gPane.add(new ImageView(character.getLegs()), 1, 2);
                gPane.add(new ImageView(character.getChest()), 1, 1);
                gPane.add(btnPreview, 1, 4);
            }
        });

        // Setups up functionality for the previous chest option button
        btnChestLeft.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
                gPane.getChildren().removeIf( node -> GridPane.getColumnIndex(node) == 1);
                gPane.add(new ImageView(character.getHead()), 1, 0);
                gPane.add(new ImageView(character.getLegs()), 1, 2);
                gPane.add(new ImageView(character.getPreviousChest()), 1, 1);
                gPane.add(btnPreview, 1, 4);
            }
        });

        // Setups up functionality for the next chest option button
        btnChestRight.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
                gPane.getChildren().removeIf( node -> GridPane.getColumnIndex(node) == 1);
                gPane.add(new ImageView(character.getHead()), 1, 0);
                gPane.add(new ImageView(character.getLegs()), 1, 2);
                gPane.add(new ImageView(character.getNextChest()), 1, 1);
                gPane.add(btnPreview, 1, 4);
            }
        });

        // Setups up functionality for the previous legs option button
        btnLegsLeft.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
                gPane.getChildren().removeIf( node -> GridPane.getColumnIndex(node) == 1);
                gPane.add(new ImageView(character.getPreviousLegs()), 1, 2);
                gPane.add(new ImageView(character.getHead()), 1, 0);
                gPane.add(new ImageView(character.getChest()), 1, 1);
                gPane.add(btnPreview, 1, 4);
            }
        });

        // Setups up functionality for the next legs option button
        btnLegsRight.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
                gPane.getChildren().removeIf( node -> GridPane.getColumnIndex(node) == 1);
                gPane.add(new ImageView(character.getNextLegs()), 1, 2);
                gPane.add(new ImageView(character.getHead()), 1, 0);
                gPane.add(new ImageView(character.getChest()), 1, 1);
                gPane.add(btnPreview, 1, 4);
            }
        });

        // Sets up functionality for the armor toggle button
        // Switches armor on the character and hides current customization options and buttons
        // Switches back to avatar after user presses again
        btnArmor.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
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
                else if(btnArmor.getText().equals("Avatar"))
                {
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

        // Sets up the functionality for the preview button which allows the
        // user to preview their avatar on different backgrounds
        btnPreview.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event)
            {
                btnChestLeft.setVisible(false);
                btnChestRight.setVisible(false);
                btnHeadLeft.setVisible(false);
                btnHeadRight.setVisible(false);
                btnLegsLeft.setVisible(false);
                btnLegsRight.setVisible(false);
                btnPreview.setVisible(false);
                btnArmor.setVisible(false);
                btnExit.setVisible(false);
                btnExitPreview.setVisible(true);
                btnChangeBackground.setVisible(true);
                bPane.setBackground(new Background(background.getNextBackground()));
            }
        });

        // Sets up functionality for exiting the preview
        btnExitPreview.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (btnArmor.getText().equals("Armor"))
                {
                    btnChestLeft.setVisible(true);
                    btnChestRight.setVisible(true);
                    btnHeadLeft.setVisible(true);
                    btnHeadRight.setVisible(true);
                    btnLegsLeft.setVisible(true);
                    btnLegsRight.setVisible(true);
                }
                btnExitPreview.setVisible(false);
                btnChangeBackground.setVisible(false);
                btnPreview.setVisible(true);
                btnArmor.setVisible(true);
                btnExit.setVisible(true);
                background.resetBackground();    
                bPane.setBackground(new Background(background.getBackground()));
            }
        });

        // Sets up the functionality for changing the background during preview
        btnChangeBackground.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event)
            {
                bPane.setBackground(new Background(background.getNextBackground()));
            }
        });

        // Sets up the functionality for the exit button which exits the app
        btnExit.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
                Platform.exit();
            }
        });
    }

    // Returns the borderpane that contains the background
    public BorderPane getBorderPane()
    {
        return this.bPane;
    }

    // Returns the gridpane that contains the character
    public GridPane getGridPane()
    {
        return this.gPane;
    }

    // Returns the customized avatar
    public Character getCharacter()
    {
        return this.character;
    }
}
