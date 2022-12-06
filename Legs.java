import javafx.scene.image.Image;

// Class for all Chest items
public class Legs implements Gear {
    private String gearType;
    private Image image;

    // Head constructor that sets the image
    public Legs(String x)
    {
        this.gearType = "Legs";
        this.image = new Image(x);
    }

    // Returns the type of gear
    public String getGearType()
    {
        return this.gearType;
    }

    // Returns the image of the gear
    public Image getImage()
    {
        return this.image;
    }

    /* The following Methods are for future implementations

    // public String getGearStats()
    {

    }

    // public Int getGearLevelRequirement()
    {

    }

    // public String getGearSource()
    {

    }

    */
}