import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userChoice;
        int userChannel;

        TV newTV = new TV();

        //TODO Challenge: Using a while or do-while loop, display the menu to user repeatedly unless user choose exit
        System.out.println("1 - Change Channel");
        System.out.println("2 - Increase Channel");
        System.out.println("3 - Decrease Channel");
        System.out.println("4 - Change Volume");
        System.out.println("5 - Increase Volume");
        System.out.println("6 - Decrease Volume");
        System.out.println("7 - Exit");
        System.out.println("What do you want to do (1 - 7)? ");
        userChoice = input.nextInt();

        //TODO Challenge: Based on user choice, call the appropriate method
        switch (userChoice) {
            case 1:
                System.out.println("Which channel do you want to watch? ");
                userChannel = input.nextInt();

                newTV.setChannel(userChannel);
                break;
        }

        System.out.println(newTV.on);
        System.out.println(newTV.channel);
        System.out.println(newTV.volumeLevel);
    }
}