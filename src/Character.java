public class Character {
    private String name;
    private int rarity;

    public Character(String vname, int vrarity){
        setName(vname);
        setRarity(vrarity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRarity() {
        return rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }
}
