import java.util.Scanner;

public class Game {

    public void startGame() throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        boolean endGame = true;

        System.out.println("Welcome to our dice game!");

        System.out.println("Please enter the name of the first player:");
        Player player1 = Operations.createPLayer();

        System.out.println("Please enter the name of the second player:");
        Player player2 = Operations.createPLayer();

        System.out.println("Welcome to menu, please choose the option: \n1. Roll dice for both players \n2. Quit game");

        int choice = scan.nextInt();

        while (endGame) {

            Thread.sleep(2000);

            int playerOneBalance = player1.getBalance().getBalance();
            int playerTwoBalance = player2.getBalance().getBalance();

            switch (choice) {
                case 1:
                    System.out.print(player1.getName());
                    player1.getBalance().setBalance(playerOneBalance + Operations.landOnFields());

                    System.out.print(player2.getName());
                    player2.getBalance().setBalance(playerTwoBalance + Operations.landOnFields());

                    System.out.println(player1.getName() + "'s balance is: " + player1.getBalance() + "\nAnd " + player2.getName() + "'s balance is: " + player2.getBalance() + "\n");
                    if (playerOneBalance >= 3000 || playerTwoBalance >= 3000) {
                        if (playerOneBalance > playerTwoBalance) {
                            System.out.println(player1.getName() + " won the game!");
                        } else {
                            System.out.println(player2.getName() + " won the game!");
                        }
                        endGame = false;
                        break;
                    }
                    break;
                case 2:
                    endGame = false;
            }
        }
    }

}
