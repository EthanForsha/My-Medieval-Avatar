import java.util.ArrayList;
import javafx.scene.image.Image;

public class Character 
{
    Head head;
    Chest chest;
    Legs legs;
    ArrayList<Head> allHeads = new ArrayList<Head>();
    ArrayList<Chest> allChests = new ArrayList<Chest>();
    ArrayList<Legs> allLegs = new ArrayList<Legs>();

    int headIndex = 0;
    int chestIndex = 0;
    int legsIndex = 0;

    public Character()
    {

        // Sets up arraylists for all head, chest, and leg images
        // It is messy, but it gets the job done and is easy to add to

        // Sets up all head images
        allHeads.add(new Head("File:Images/Heads/Head1.png"));
        allHeads.add(new Head("File:Images/Heads/Head2.png"));
        allHeads.add(new Head("File:Images/Heads/Head3.png"));
        allHeads.add(new Head("File:Images/Heads/Head4.png"));
        allHeads.add(new Head("File:Images/Heads/Head5.png"));
        allHeads.add(new Head("File:Images/Heads/Head6.png"));
        allHeads.add(new Head("File:Images/Heads/Head7.png"));
        allHeads.add(new Head("File:Images/Heads/Head8.png"));
        allHeads.add(new Head("File:Images/Heads/Head9.png"));
        allHeads.add(new Head("File:Images/Heads/Head10.png"));
        allHeads.add(new Head("File:Images/Heads/Head11.png"));
        allHeads.add(new Head("File:Images/Heads/Head12.png"));
        allHeads.add(new Head("File:Images/Heads/Head13.png"));
        allHeads.add(new Head("File:Images/Heads/Head14.png"));
        allHeads.add(new Head("File:Images/Heads/Head15.png"));
        allHeads.add(new Head("File:Images/Heads/Head16.png"));
        allHeads.add(new Head("File:Images/Heads/Head17.png"));
        allHeads.add(new Head("File:Images/Heads/Head18.png"));
        allHeads.add(new Head("File:Images/Heads/Head19.png"));
        allHeads.add(new Head("File:Images/Heads/Head20.png"));
        allHeads.add(new Head("File:Images/Heads/Head21.png"));
        allHeads.add(new Head("File:Images/Heads/Head22.png"));
        allHeads.add(new Head("File:Images/Heads/Head23.png"));
        allHeads.add(new Head("File:Images/Heads/Head24.png"));
        allHeads.add(new Head("File:Images/Heads/Head25.png"));
        allHeads.add(new Head("File:Images/Heads/Head26.png"));
        allHeads.add(new Head("File:Images/Heads/Head27.png"));
        allHeads.add(new Head("File:Images/Heads/Head28.png"));
        allHeads.add(new Head("File:Images/Heads/Head29.png"));
        allHeads.add(new Head("File:Images/Heads/Head30.png"));
        allHeads.add(new Head("File:Images/Heads/Head31.png"));
        allHeads.add(new Head("File:Images/Heads/Head32.png"));
        allHeads.add(new Head("File:Images/Heads/Head33.png"));
        allHeads.add(new Head("File:Images/Heads/Head34.png"));
        allHeads.add(new Head("File:Images/Heads/Head35.png"));
        allHeads.add(new Head("File:Images/Heads/Head36.png"));
        allHeads.add(new Head("File:Images/Heads/Head37.png"));
        allHeads.add(new Head("File:Images/Heads/Head38.png"));
        allHeads.add(new Head("File:Images/Heads/Head39.png"));
        allHeads.add(new Head("File:Images/Heads/Head40.png"));
        allHeads.add(new Head("File:Images/Heads/Head41.png"));
        allHeads.add(new Head("File:Images/Heads/Head42.png"));
        allHeads.add(new Head("File:Images/Heads/Head43.png"));
        allHeads.add(new Head("File:Images/Heads/Head44.png"));
        allHeads.add(new Head("File:Images/Heads/Head45.png"));

        // Sets up all chest images
        allChests.add(new Chest("File:Images/Chests/Chest1.png"));
        allChests.add(new Chest("File:Images/Chests/Chest2.png"));
        allChests.add(new Chest("File:Images/Chests/Chest3.png"));
        allChests.add(new Chest("File:Images/Chests/Chest4.png"));
        allChests.add(new Chest("File:Images/Chests/Chest5.png"));
        allChests.add(new Chest("File:Images/Chests/Chest6.png"));
        allChests.add(new Chest("File:Images/Chests/Chest7.png"));

        // Sets up all leg images
        allLegs.add(new Legs("File:Images/Legs/Legs1.png"));
        allLegs.add(new Legs("File:Images/Legs/Legs2.png"));
        allLegs.add(new Legs("File:Images/Legs/Legs3.png"));
        allLegs.add(new Legs("File:Images/Legs/Legs4.png"));
        allLegs.add(new Legs("File:Images/Legs/Legs5.png"));
        allLegs.add(new Legs("File:Images/Legs/Legs6.png"));
        allLegs.add(new Legs("File:Images/Legs/Legs7.png"));
        this.head = allHeads.get(headIndex);
        this.chest = allChests.get(chestIndex);
        this.legs = allLegs.get(legsIndex);
    }

    // Returns the currently selected head image
    public Image getHead()
    {
        return this.head.getImage();
    }

    // Returns the currently selected chest image
    public Image getChest()
    {
        return this.chest.getImage();
    }

    // Returns the currently selected legs image
    public Image getLegs()
    {
        return this.legs.getImage();
    }

    // Returns the next head image from the selection
    public Image getNextHead()
    {
        this.headIndex += 1;
        if (headIndex == allHeads.size())
        {
            this.headIndex = 0;
        }
        this.head = allHeads.get(headIndex);
        return this.head.getImage();
    }

    // Returns the next chest image from the selection
    public Image getNextChest()
    {
        this.chestIndex += 1;
        if (chestIndex == allChests.size())
        {
            this.chestIndex = 0;
        }
        this.chest = allChests.get(chestIndex);
        return this.chest.getImage();
    }

    // Returns the next legs image from the selection
    public Image getNextLegs()
    {
        this.legsIndex += 1;
        if (legsIndex == allLegs.size())
        {
            this.legsIndex = 0;
        }
        this.legs = allLegs.get(legsIndex);
        return this.legs.getImage();
    }

    // Returns the previous head image from the selection
    public Image getPreviousHead()
    {
        this.headIndex -= 1;
        if (headIndex < 0)
        {
            this.headIndex = allHeads.size()-1;
        }
        this.head = allHeads.get(headIndex);
        return this.head.getImage();
    }

    // Returns the previous chest image from the selection
    public Image getPreviousChest()
    {
        this.chestIndex -= 1;
        if (chestIndex < 0)
        {
            this.chestIndex = allChests.size()-1;
        }
        this.chest = allChests.get(chestIndex);
        return this.chest.getImage();
    }

    // Returns the previous legs image from the selection
    public Image getPreviousLegs()
    {
        this.legsIndex -= 1;
        if (legsIndex < 0)
        {
            this.legsIndex = allLegs.size()-1;
        }
        this.legs = allLegs.get(legsIndex);
        return this.legs.getImage();
    }

    // Toggles "end game" armor preview on character
    public void toggleArmorOn()
    {
        this.head = new Head("File:Images/Heads/Head Armor.png");
        this.legs = new Legs("File:Images/Legs/Legs Armor.png");
        this.chest = new Chest("File:Images/Chests/Chest Armor.png");
    }

    // Toggles "end game" armor off and returns to the custom character
    public void toggleArmorOff()
    {
        this.legs = allLegs.get(legsIndex);
        this.head = allHeads.get(headIndex);
        this.chest = allChests.get(chestIndex);
    }

}