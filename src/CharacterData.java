import java.util.concurrent.TimeUnit;
public class CharacterData {
    private static Character[] characterArr = {new Character("Common1", 1),
            new Character("Common2", 1),
            new Character("Common3", 1),
            new Character("Common4", 1),
            new Character("Uncommon1", 2),
            new Character("Uncommon2", 2),
            new Character("Uncommon3", 2),
            new Character("Uncommon4", 2),
            new Character("Rare1", 3),
            new Character("Rare2", 3),
            new Character("Rare3", 3),
            new Character("Rare4", 3)
    };

    public static Character[] getCharacterArr() {
        return characterArr;
    }

    public static void displayCharacters(){

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\nPossible Summons");
        System.out.println("------------------");
        System.out.println("Rarity Names");

        for (Character characterData: characterArr) {
            System.out.println(characterData.getRarity()+"      "+ characterData.getName());
        }
    }
}
