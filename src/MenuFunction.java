import java.util.Scanner;

public class MenuFunction {
    private static Scanner scanner = new Scanner(System.in);

    public static void mainMenuDisplay() {
        System.out.println("\nMain Menu");
        System.out.println("Scrolls Remaining: "+ UserData.getSummonScrollAmount()+" Characters summoned: "+ UserData.getAmountOfCharacters());
        System.out.println("Input a number of one of the options below.");
        System.out.println("1) Summon 2) Your Characters 3) List of Possible Summons 4)Get More Summon Scrolls 5) Exit Terminal");
        System.out.print("Your Input: ");
        UserData.setMainScreenUserInput(Integer.parseInt(scanner.nextLine()));
        whenUserInput(UserData.getMainScreenUserInput());
    }

    public static void whenUserInput(int userInput){
        switch (userInput) {
            case 1 -> UserData.addNewUserCharacter(new Character("Common1",1));
            case 2 -> UserData.displayUserCharacters();
            case 3 -> CharacterData.displayCharacters();
        }
    }
}
