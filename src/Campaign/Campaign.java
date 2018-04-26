package Campaign;

public class Campaign {

    public String name;
    private int numPlayers;
    private Character[] characters;

    public Campaign(String name, int numPlayers) {
        this.name = name;
        this.numPlayers = numPlayers;
        characters = new Character[numPlayers];
    }

    public String toString() {
        return name;
    }
}