import java.util.Scanner;

public class Operations {

    public static Player createPLayer() {
        Scanner scan = new Scanner(System.in);
        Player player = new Player(scan.nextLine(),createBalance());
        return player;
    }

    public static Balance createBalance() {
        Balance balance = new Balance(1000);
        return balance;
    }

    public static int rollDice() {
        int min = 2;
        int max = 12;
        int range = max - min + 1;
        return (int)((Math.random() * range) + min);
    }

    public static int landOnFields() {

        int field = 0;

        switch (rollDice()) {
            case 2:
                System.out.println(" hit 2 with his dice and landed on the Tower! His result will be increased by " + 250);
                field = +250;
                break;
            case 3:
                System.out.println(" hit 3 with his dice and landed on the Crater! His result will be reduced by " + 100);
                field = -100;
                break;
            case 4:
                System.out.println(" hit 4 with his dice and landed on the Palace Gates! His result will be increased by " + 100 );
                field = +100;
                break;
            case 5:
                System.out.println(" hit 5 with his dice and landed on the Cold Desert! His result will be reduced by " + 20);
                field = -20;
                break;
            case 6:
                System.out.println(" hit 6 with his dice and landed on the Walled City! His result will be increased by " + 180);
                field = +180;
                break;
            case 7:
                System.out.println(" hit 7 with his dice and landed on the Monastery! His result will remain the same");
                field = 0;
                break;
            case 8:
                System.out.println(" hit 8 with his dice and landed on the Black Cave! His result will be reduced by " + 70);
                field = -70;
                break;
            case 9:
                System.out.println(" hit 9 with his dice and landed on the Huts in the mountain! His result will be increased by " + 60);
                field = +60;
                break;
            case 10:
                System.out.println(" hit 10 with his dice and landed on the The Werewall! His result will be reduced by " + 80);
                field = -80;
                break;
            case 11:
                System.out.println(" hit 11 with his dice and landed on the The Pit! His result will be reduced by " + 50);
                field = -50;
                break;
            case 12:
                System.out.println(" hit 12 with his dice and landed on the Goldmine! His result will be increased by " + 650);
                field = +650;
                break;
        }

        return field;
    }

}
