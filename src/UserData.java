public class UserData {
    private static int mainScreenUserInput = 0;
    private static int summonScrollAmount = 50;
    private static int amountOfCharacters = 0;
    private static Character[] userCharacters = new Character[50];

    public static Character[] getUserCharacters() {
        return userCharacters;
    }

    public static Boolean isUserCharacterEmpty() {
        for (int i=0; i<userCharacters.length; i++) {
            if (userCharacters[i] != null) {
                return false;
            }
        }
        return true;
    }

    public static void minusOneScroll() {
        summonScrollAmount--;
    }

    public static void addOneCharacterCounter() {
        amountOfCharacters++;
    }

    public static void addNewUserCharacter(Character userCharacter) {
        for (int i=0; i<userCharacters.length; i++) {
            if (userCharacters[i] == null) {
                userCharacters[i] = userCharacter;
                UserData.minusOneScroll();
                UserData.addOneCharacterCounter();
                break;
            }
        }
    }

    public static void displayUserCharacters() {

        if (isUserCharacterEmpty()) {
            System.out.println("\nYou have no characters!");
        } else {
            System.out.println("\nYour Characters");
            System.out.println("------------------");
            System.out.println("Rarity Names");
            for (int i=0; i<userCharacters.length; i++) {
                if (userCharacters[i] !=null) {
                    System.out.println(userCharacters[i].getRarity()+"      "+ userCharacters[i].getName());
                } else {
                    break;
                }
            }
        }

    }

    public static int getMainScreenUserInput(){
        return mainScreenUserInput;
    }
    public static void setMainScreenUserInput(int userInput){
        mainScreenUserInput = userInput;
    }
    public static int getSummonScrollAmount(){
        return summonScrollAmount;
    }
    public static int getAmountOfCharacters(){
        return amountOfCharacters;
    }
}
