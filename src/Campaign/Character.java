package Campaign;

public class Character {

    public String name;
    public String race;
    public int level;
    private int faction;
    private int experience;
    private String characterClass;
    private String alignment;
    private String background;

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int hitPoints;
    private int speed;
    private int initiative;
    private int armorClass;
    private int tempHitPoints;
    private int inspiration;
    private int proficiencyBonus;
    private int perception;
    private Item[] items;
    private String[] savingThrows;
    private String[] skills;
    private String[] personalityTraits;
    private String[] ideals;
    private String[] Bonds;
    private String[] flaws;
    private String[] languages;
    private String[] Proficiencies;
    private Attack[] attacks;
    private Equipment[] equipment;

    public Character(String name){
        this.name = name;
    }
}
