import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String args[]) {
        System.out.println("Lets play Rock, Paper, Scissors! \n");
        new RockPaperScissors();
    }

    public RockPaperScissors() {
        System.out.println("How many rounds do you want to play? Choose a number between 1 and 10");

        Scanner s = new Scanner(System.in);
        int userMove, compMove;
        int userScore = 0, compScore = 0, draws = 0;

        if (!s.hasNextInt()) {
            System.out.println("Error: This needs to be a number \n");
        }
        else {
            int rounds = s.nextInt();

            if (rounds < 1 || rounds > 10) {
                System.out.println("Error: This needs to be a number between 1 and 10 \n");
            }
            else {
                System.out.println("Okay " + rounds + " rounds! Lets play \n");

                for (int i = 0; i < rounds; i++) {
                    System.out.println("Your turn, choose between Rock, Paper, Scissors");
                    System.out.println("Rock: 1, Paper: 2, Scissors: 3 \n");


                        userMove = s.nextInt();
                        if (userMove < 1 || userMove > 3) {
                            System.out.println("Error: You need to pick from 1,2 and 3 \n");
                            i--;

                        } else {
                            compMove = computerMove();


                            if (userMove == compMove) {
                                System.out.println("Draw! \n");
                                draws++;
                            } else {
                                if (compWinner(userMove, compMove)) {
                                    System.out.println("I win! \n");
                                    compScore++;
                                } else {
                                    System.out.println("You win! \n");
                                    userScore++;
                                }

                        }
                    }
                }
                    System.out.println("Score: user = " + userScore + " computer = " + compScore + " draws = " + draws + "\n");
                    if (compScore == userScore) {
                        System.out.println("Game over, its a draw! \n");
                    } else if (compScore > userScore) {
                        System.out.println("Game over, I win! \n");
                    } else {
                        System.out.println("Game over, you win! \n");
                    }

            }
        }

        replay();
    }

    public void replay() {
        System.out.println("Do you want to play again?");

        Scanner s = new Scanner(System.in);
        if (s.next().toUpperCase().equals("YES")) {
            new RockPaperScissors();

        } else {
            System.out.println("Thanks for playing!");
        }
    }


    public int computerMove() {
        Random rand = new Random();
        int move = rand.nextInt(3) + 1;

        if (move == 1) {
            System.out.println("Rock");
        } else if (move == 2) {
            System.out.println("Paper");
        } else {
            System.out.println("Scissors");
        }
        return move;
    }

    public boolean compWinner(int userMove, int compMove) {
        if (userMove == 1) {
            return (compMove == 2); //if user picks 1 and comp picks 2 then comp wins so this will return a true, else comp chose 3 and lost so false
        } else if (userMove == 2) {
            return (compMove == 3);
        } else {
            return (compMove == 1);
        }
    }
}

