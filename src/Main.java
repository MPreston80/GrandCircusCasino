import java.util.Scanner;
import java.util.Random;

public class Main {

    public static int diceSides()
    {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("How many sides should each die have?");
        int sides = scan1.nextInt();
        return sides;
    }

    public static int Rolldie1(int sides1)
    {
        Random num = new Random();
        int x = num.nextInt(sides1) + 1;
        return x;

    }

    public static int Rolldie2(int sides2)
    {
        Random num = new Random();
        int y = num.nextInt(sides2) + 1;
        return y;

    }





    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);

        System.out.println("Welcome to Grand Circus Casino!");


        int i = 1;
        String userinput2 = "yes";
        do {
            int x = diceSides();

            System.out.println("Roll " + i + ":");
            System.out.println(Rolldie1(x));
            System.out.println(Rolldie2(x));

            i++;

            System.out.println("Keep rolling?  Enter yes or no:");
            //scan1.nextLine();
            userinput2 = scan1.nextLine();
        }
        while (userinput2.equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing!");


    return;

    }
}
