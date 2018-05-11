package Campaign;

public class Campaign {

    public String name;
    private int numPlayers;
    private Character[] characters;

    public Campaign(String name) {
        this.name = name;
        characters = new Character[numPlayers];
    }

    public int addCharacter(Character character){
        if(characters.length == 0){
            characters = new Character[1];
            characters[0] = character;
            return 1;
        }
        else{
            int len = characters.length;
            for(int a = 0;a < len;a++){
                if(characters[a].name.equals(character.name)){
                    return -1;
                }
            }
            Character[] newCharacters = new Character[len + 1];
            int b;
            for(b = 0;b < len;b++){
                newCharacters[b] = characters[b];
            }
            newCharacters[b+1] = character;
            return 1;
        }
    }

    public String toString() {
        return name;
    }
}