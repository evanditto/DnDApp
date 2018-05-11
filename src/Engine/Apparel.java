package Engine;

public class Apparel extends Item {

    private int armorClass;

    public Apparel(String name, int value, int weight, int armorClass){
        super(name, value, weight);
        this.armorClass = armorClass;
    }

}
