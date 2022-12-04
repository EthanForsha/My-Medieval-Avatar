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
        allHeads.add(new Image("File:Images/Heads/Head5.png"));
        allHeads.add(new Image("File:Images/Heads/Head6.png"));
        allHeads.add(new Image("File:Images/Heads/Head7.png"));
        allHeads.add(new Image("File:Images/Heads/Head8.png"));
        allHeads.add(new Image("File:Images/Heads/Head9.png"));
        allHeads.add(new Image("File:Images/Heads/Head10.png"));
        allHeads.add(new Image("File:Images/Heads/Head11.png"));
        allHeads.add(new Image("File:Images/Heads/Head12.png"));
        allHeads.add(new Image("File:Images/Heads/Head13.png"));
        allHeads.add(new Image("File:Images/Heads/Head14.png"));
        allHeads.add(new Image("File:Images/Heads/Head15.png"));
        allHeads.add(new Image("File:Images/Heads/Head16.png"));
        allHeads.add(new Image("File:Images/Heads/Head17.png"));
        allHeads.add(new Image("File:Images/Heads/Head18.png"));
        allHeads.add(new Image("File:Images/Heads/Head19.png"));
        allHeads.add(new Image("File:Images/Heads/Head20.png"));
        allHeads.add(new Image("File:Images/Heads/Head21.png"));
        allHeads.add(new Image("File:Images/Heads/Head22.png"));
        allHeads.add(new Image("File:Images/Heads/Head23.png"));
        allHeads.add(new Image("File:Images/Heads/Head24.png"));
        allHeads.add(new Image("File:Images/Heads/Head25.png"));
        allHeads.add(new Image("File:Images/Heads/Head26.png"));
        allHeads.add(new Image("File:Images/Heads/Head27.png"));
        allHeads.add(new Image("File:Images/Heads/Head28.png"));
        allHeads.add(new Image("File:Images/Heads/Head29.png"));
        allHeads.add(new Image("File:Images/Heads/Head30.png"));
        allHeads.add(new Image("File:Images/Heads/Head31.png"));
        allHeads.add(new Image("File:Images/Heads/Head32.png"));
        allHeads.add(new Image("File:Images/Heads/Head33.png"));
        allHeads.add(new Image("File:Images/Heads/Head34.png"));
        allHeads.add(new Image("File:Images/Heads/Head35.png"));
        allHeads.add(new Image("File:Images/Heads/Head36.png"));
        allHeads.add(new Image("File:Images/Heads/Head37.png"));
        allHeads.add(new Image("File:Images/Heads/Head38.png"));
        allHeads.add(new Image("File:Images/Heads/Head39.png"));
        allHeads.add(new Image("File:Images/Heads/Head40.png"));
        allHeads.add(new Image("File:Images/Heads/Head41.png"));
        allHeads.add(new Image("File:Images/Heads/Head42.png"));
        allHeads.add(new Image("File:Images/Heads/Head43.png"));
        allHeads.add(new Image("File:Images/Heads/Head44.png"));
        allHeads.add(new Image("File:Images/Heads/Head45.png"));
        allChests.add(new Image("File:Images/Chests/Chest1.png"));
        allChests.add(new Image("File:Images/Chests/Chest2.png"));
        allChests.add(new Image("File:Images/Chests/Chest3.png"));
        allChests.add(new Image("File:Images/Chests/Chest4.png"));
        allLegs.add(new Image("File:Images/Legs/Legs1.png"));
        allLegs.add(new Image("File:Images/Legs/Legs2.png"));
        allLegs.add(new Image("File:Images/Legs/Legs3.png"));
        allLegs.add(new Image("File:Images/Legs/Legs4.png"));
        this.Head = allHeads.get(headIndex);
        this.Chest = allChests.get(chestIndex);
        this.Legs = allLegs.get(legsIndex);
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

    public void toggleArmorOn(){
        this.Head = new Image("File:Images/Heads/Head Armor.png");
        this.Legs = new Image("File:Images/Legs/Legs Armor.png");
        this.Chest = new Image("File:Images/Chests/Chest Armor.png");
    }

    public void toggleArmorOff(){
        this.Legs = allLegs.get(legsIndex);
        this.Head = allHeads.get(headIndex);
        this.Chest = allChests.get(chestIndex);
    }
}