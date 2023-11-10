//Ex04_GRA_AllauiganMJT
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex04_gra_allauiganmjt;

import java.util.Scanner;
/**
 *
 * @author mika
 */
public class Ex04_GRA_AllauiganMJT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (true){
        Scanner sc = new Scanner(System.in);
        
	Move rock = new Move("Rock");
	Move paper = new Move("Paper");
	Move scissors = new Move("Scissors");
		
	rock.setStrongAgainst(scissors);
	paper.setStrongAgainst(rock);
	scissors.setStrongAgainst(paper);
		
	int roundsToWin = 2;
       
        System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option:\n" + 
                           "1. Start game\n" + 
                           "2. Change number of rounds\n" +
                           "3. Exit application");
        System.out.print("> "); 
        String option = sc.nextLine();
            if ("1".equals(option)){
              int playerScore = 0;
              int computerScore = 0;
            while (playerScore < roundsToWin && computerScore < roundsToWin){ 
                System.out.println("--------------------------------------------------");
                Move userMove;
                Move computerMove;
                String winner;
                System.out.println("Player: " + playerScore + " - " + "Computer: " + computerScore); 
                System.out.println("This match will be first to " + roundsToWin + " wins.\n" +
                                   "The computer has selected its move. Select your move:\n" +
                                   "1. Rock\n" +
                                   "2. Paper\n" +
                                   "3. Scissors");
                System.out.print("> ");
                    String userChoice = sc.nextLine();
                if ("1".equals(userChoice)){
                    userMove = rock;
                }
                else if ("2".equals(userChoice)){
                    userMove = paper;
                }
                else if ("3".equals(userChoice)){
                    userMove = scissors;
                }
                else {
                    userMove = null;
                }

               int computerChoice = (int) Math.floor(Math.random()*3) + 1;
                if (computerChoice == 1){
                    computerMove = rock;
                }
                else if (computerChoice == 2){
                    computerMove = paper;
                }
                else if (computerChoice == 3){
                    computerMove = scissors;
                }
                else {
                    computerMove = null;
                }

               int winnerValue = Move.compareMoves(userMove, computerMove);
                if (winnerValue == 0){
                    winner = "player";
                    playerScore++;
                    System.out.println("The winner of this round is the player!");
                }
                else if (winnerValue == 1){
                    winner = "computer";
                    computerScore++;
                    System.out.println("The winner of this round is the computer!");
                }
                else if (winnerValue == 2){
                    winner = "tie";
                    System.out.println("There was a tie :(");
                }
                else{
                    winner = null;
                }
            }    
                if (playerScore > computerScore){
                    System.out.println("The winner of the game is the player!");
                }
                else if (computerScore > playerScore ){
                    System.out.println("The winner of the game is the computer!"); 
                }
            }
        else if ("2".equals(option)){
            System.out.println("--------------------------------------------------");
            System.out.println("How many wins are needed to win a match?");
            roundsToWin = sc.nextInt();
            sc.nextLine();
            System.out.println("New setting has been saved!");
            System.out.println("--------------------------------------------------");
        }
        else if ("3".equals(option)){
            System.out.println("Thank you for playing!");
            System.exit(0);
        }
        else {
            System.out.println("Invalid choice. Please choose a valid option!");
            System.out.println("--------------------------------------------------");
        }
     }
   }
}  

