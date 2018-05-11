package Engine;

public class Weapon extends Item {

    private int type;
    private int damage;

    public Weapon(String name, int value, int weight, int type, int damage){
        super(name, value, weight);
        this.type = type;
        this.damage = damage;
    }
}
