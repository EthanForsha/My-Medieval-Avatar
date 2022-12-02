import java.util.ArrayList;

import javafx.scene.image.Image;

public class Character {
    Image Head;
    Image Chest;
    Image Legs;
    ArrayList<Image> allHeads = new ArrayList<Image>();
    ArrayList<Image> allChests = new ArrayList<Image>();
    ArrayList<Image> allLegs = new ArrayList<Image>();
    int headIndex = 0;
    int chestIndex = 0;
    int legsIndex = 0;

    public Character(){
        allHeads.add(new Image("File:Images/Heads/Head1.png"));
        allHeads.add(new Image("File:Images/Heads/Head2.png"));
        allHeads.add(new Image("File:Images/Heads/Head3.png"));
        allHeads.add(new Image("File:Images/Heads/Head4.png"));
        allChests.add(new Image("File:Images/Chests/Chest1.png"));
        allChests.add(new Image("File:Images/Chests/Chest2.png"));
        allLegs.add(new Image("File:Images/Legs/Legs1.png"));
        allLegs.add(new Image("File:Images/Legs/Legs2.png"));
        this.Head = allHeads.get(headIndex);
        this.Chest = allChests.get(chestIndex);
        this.Legs = allChests.get(legsIndex);
    }

    public Image getHead(){
        return this.Head;
    }

    public Image getChest(){
        return this.Chest;
    }

    public Image getLegs(){
        return this.Legs;
    }

    public Image getNextHead(){
        this.headIndex += 1;
        if (headIndex == allHeads.size())
        {
            this.headIndex = 0;
        }
        this.Head = allHeads.get(headIndex);
        return this.Head;
    }

    public Image getNextChest(){
        this.chestIndex += 1;
        if (chestIndex == allChests.size())
        {
            this.chestIndex = 0;
        }
        this.Chest = allChests.get(chestIndex);
        return this.Chest;
    }

    public Image getNextLegs(){
        this.legsIndex += 1;
        if (legsIndex == allLegs.size())
        {
            this.legsIndex = 0;
        }
        this.Legs = allLegs.get(legsIndex);
        return this.Legs;
    }

    public Image getPreviousHead(){
        this.headIndex -= 1;
        if (headIndex < 0)
        {
            this.headIndex = allHeads.size()-1;
        }
        this.Head = allHeads.get(headIndex);
        return this.Head;
    }

    public Image getPreviousChest(){
        this.chestIndex -= 1;
        if (chestIndex < 0)
        {
            this.chestIndex = allChests.size()-1;
        }
        this.Chest = allChests.get(chestIndex);
        return this.Chest;
    }

    public Image getPreviousLegs(){
        this.legsIndex -= 1;
        if (legsIndex < 0)
        {
            this.legsIndex = allLegs.size()-1;
        }
        this.Legs = allLegs.get(legsIndex);
        return this.Legs;
    }
}
