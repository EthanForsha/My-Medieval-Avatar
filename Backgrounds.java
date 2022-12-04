import java.util.ArrayList;
import javafx.scene.image.Image;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;

public class Backgrounds
{

    private ArrayList<BackgroundImage> allBackgrounds = new ArrayList<BackgroundImage>();
    private int index = 0;
    private BackgroundImage background;

    public Backgrounds()
    {
        // Creates an arraylist of background items 
        allBackgrounds.add(new BackgroundImage(new Image("File:Images/Backgrounds/Castle.jpg", 600, 600, false, true), BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT));
        allBackgrounds.add(new BackgroundImage(new Image("File:Images/Backgrounds/Tavern.jpg", 600, 600, false, true), BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT));
        background = new BackgroundImage(new Image("File:Images/Backgrounds/Home.jpg", 600, 600, false, true), BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
    }

    // Returns current selected background
    public BackgroundImage getBackground()
    {
        return this.background;
    }

    // Returns the next background in the selection
    public BackgroundImage getNextBackground()
    {
        this.index += 1;
        if (index == allBackgrounds.size())
        {
            this.index = 0;
        }
        this.background = allBackgrounds.get(index);
        return this.background;
    }

    // Resets the background back to the customization screen background
    public void resetBackground()
    {
        this.background = new BackgroundImage(new Image("File:Images/Backgrounds/Home.jpg", 600, 600, false, true), BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
    }

}
