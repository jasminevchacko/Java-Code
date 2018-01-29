import java.util.Random;
import java.util.Scanner;

public class CoinTosser {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        char answer;
        do {
            System.out.print("Ready to run a coin-flip simulation. Enter the  number of sequences: ");

            int flips = scan.nextInt();

            if (flips < 2){
                System.out.println("You must enter a number greater than 2!");

                System.out.println("Would you like to run another simulation? (y/n)");

                answer = scan.next().charAt(0);

                continue;
            }

            System.out.println("Simulating Flips");

            int count = 1;
            String tosses = "";
            boolean heads = false;
            boolean tails = false;

            Random gen = new Random();

            int theFlip;

            int maxTosses = 0;

            int count2 = 0;

            int totalTosses = 0;

            while (count <= flips) {
                count2 = 0;
                tosses = "";
                tosses += (count + " - ");
                heads = false;
                tails = false;

                while (!heads || !tails) {
                    theFlip = gen.nextInt(2);

                    if (theFlip == 0) {
                        heads = true;
                        tosses += "H";
                    } else {
                        tails = true;
                        tosses += "T";
                    }
                    count2++;
                    totalTosses++;
                }

                System.out.println(tosses);

                if (count2 > maxTosses) {
                    maxTosses = count2;
                }
                count++;
            }

            double avg = (double) totalTosses / flips;

            System.out.println("The average number of tosses was " + avg + " and maximum was " + maxTosses + ".");

            System.out.println("Would you like to run another simulation? (y/n)");

            answer = scan.next().charAt(0);
        } while (answer == 'y');
    }
}
