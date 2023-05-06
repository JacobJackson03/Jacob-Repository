public class ProjectTwo {// Import Scanner to take input
import java.util.Scanner;
// Import Random to produce random value
import java.util.Random;

    public class {

        // Variables to store pokemon data
        static String P1Name;
        static int P1HP;
        static String P1Move;
        static int P1movePower;
        static float P1Speed;
        static int P1totalWins = 0;

        static String P2Name;
        static int P2HP;
        static String P2Move;
        static int P2movePower;
        static float P2Speed;
        static int P2totalWins = 0;

        static void P1AttackFirst(){
            // Logic to perform player 1 attack first then player 2 attack
            System.out.println("Player 1's turn");
            P2HP -= P1movePower;
            System.out.println(P1Name + " used " + P1Move);
            System.out.println(P1Name + " hits " + P2Name + " for " + P1movePower + " damage.");
            System.out.println(P2Name + " HP left: " + P2HP);

            if(P2HP <= 0){
                System.out.println("Player 1 is the round winner");
                P1totalWins++;
                return;
            }
            System.out.println("Player 2's turn");

            P1HP -= P2movePower;
            System.out.println(P2Name + " used " + P2Move);
            System.out.println(P2Name + " hits " + P1Name + " for " + P2movePower + " damage.");
            System.out.println(P1Name + " HP left: " + P1HP);

            if(P1HP <= 0){
                System.out.println("Player 2 is the round winner");
                P2totalWins++;
                return;
            }
        }
        static void P2AttackFirst(){
            // Logic to perform player 2 attack first then player 1 attack
            System.out.println("Player 2's turn");
            P1HP -= P2movePower;
            System.out.println(P2Name + " used " + P2Move);
            System.out.println(P2Name + " hits " + P1Name + " for " + P2movePower + " damage.");
            System.out.println(P1Name + " HP left: " + P1HP);


            if(P1HP <= 0){
                System.out.println("Player 2 is the round winner");
                P2totalWins++;
                return;
            }
            System.out.println("Player 1's turn");
            P2HP -= P1movePower;
            System.out.println(P1Name + " used " + P1Move);
            System.out.println(P1Name + " hits " + P2Name + " for " + P1movePower + " damage.");
            System.out.println(P2Name + " HP left: " + P2HP);

            if(P2HP <= 0){
                System.out.println("Player 1 is the round winner");
                P1totalWins++;
                return;
            }
        }

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            // Take input for no of rounds
            System.out.println("Please enter Odd number of rounds: ");
            int rounds = Integer.parseInt((scanner.nextLine()));

            if(rounds % 2 == 0){
                System.out.println("Invalid Input!");
                return;
            }
            // Loop for number of rounds
            for(int i=0; i<rounds; i++){
                // Input pokemon info from player 1
                System.out.println("Select your pokemon player 1: ");
                System.out.println("Pokemon Name: ");
                P1Name = scanner.nextLine();
                System.out.println("Pokemon Hit Points: ");
                P1HP = Integer.parseInt((scanner.nextLine()));
                System.out.println("Pokemon Move: ");
                P1Move = scanner.nextLine();
                System.out.println("Pokemon Move Power: ");
                P1movePower = Integer.parseInt((scanner.nextLine()));
                System.out.println("Pokemon Speed: ");
                P1Speed = Float.parseFloat(scanner.nextLine());

                // Input pokemon info from player 2
                System.out.println("Select your pokemon player 2: ");
                System.out.println("Pokemon Name: ");
                P2Name = scanner.nextLine();
                System.out.println("Pokemon Hit Points: ");
                P2HP = Integer.parseInt((scanner.nextLine()));
                System.out.println("Pokemon Move: ");
                P2Move = scanner.nextLine();
                System.out.println("Pokemon Move Power: ");
                P2movePower = Integer.parseInt((scanner.nextLine()));
                System.out.println("Pokemon Speed: ");
                P2Speed = Float.parseFloat(scanner.nextLine());

                // Loop until one of the pokemon reaches 0 hp
                while(P1HP > 0 && P2HP > 0){
                    // If speed of Player 1 pokemon is more than player 2 pokemon, then P1 attack first
                    if(P1Speed > P2Speed){
                        P1AttackFirst();
                    }
                    // If speed of Player 2 pokemon is more than player 1 pokemon, then P2 attack first
                    else if(P2Speed > P1Speed){
                        P2AttackFirst();
                    }
                    // If speed is same then select one at random
                    else{
                        Random r = new Random();
                        int chance = r.nextInt(2);
                        if (chance == 1) {
                            P1AttackFirst();
                        } else {
                            P2AttackFirst();
                        }
                    }
                }
            }

            // Print player scores
            System.out.println("Player 1 Score: " + P1totalWins);
            System.out.println("Player 2 Score: " + P2totalWins);
            // If player 1 has more score print player 1 won
            if(P1totalWins > P2totalWins){
                System.out.println("Player 1 has won the game!");
            }
            // If player 2 has more score print player 2 won
            else{
                System.out.println("Player 2 has won the game!");
            }
        }
    }
}
