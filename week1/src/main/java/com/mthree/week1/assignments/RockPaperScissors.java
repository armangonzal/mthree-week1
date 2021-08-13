/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.week1.assignments;

import java.util.*;
/**
 * Classic game of Rock, Paper, Scissors
 * 
 * @author ArmandoGonzalez
 */
public class RockPaperScissors {
    static int playerWins = 0, computerWins = 0, ties = 0;
    public static void main(String[] args){   
        startGame();
    }
    
    //reset game statistics and start a new game
    public static void startGame() {
        playerWins = 0; computerWins = 0; ties = 0;
        String winner = "tie";
        
        int rounds = askRounds();  
        if(rounds > 0){
            playRounds(rounds);
            endGame(winner);
            promptUserToPlayAgain();
        } 
    }
    
    //ask for user input for number of rounds
    //must be in range 1-10 else returns 0
    public static int askRounds(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many rounds would you like to play? (1 to 10)");
        try {
            int val = userInput.nextInt();
            if(val < 1 || val > 10){
                System.out.println("Invalid number of rounds requested.");
                return 0;
            }
            else return val;
        }
        catch (NumberFormatException nfe){
            return 0;
        }
    }
    
    //updates game statics with each iteration of play
    public static void playRounds(int rounds)
    {
        String roundWinner;
        for(int r=0; r < rounds; r++)
        {
            roundWinner = playRound();
            System.out.printf("Round Winner: %s\n\n", roundWinner);
            if(roundWinner.equals("player")) playerWins++;
            else if(roundWinner.equals("computer")) computerWins++;
            else ties++;
        }
    }
    
    //output game statistics at the end of the game
    public static void endGame(String winner)
    {
        if(playerWins > computerWins) winner = "player";
        else if(computerWins > playerWins) winner = "computer";
        System.out.printf("Player wins: %d, Computer wins: %d,"
                + " ties: %d\n\nOVERALL WINNER: %s\n", 
                playerWins, computerWins, ties, winner);
    }
    
    //starts a new game if the user responds with a 'yes'
    public static void promptUserToPlayAgain(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Would you like to play again? y/n");
        String answer = userInput.nextLine();
        if(answer.charAt(0)== 'y' || answer.charAt(0)=='Y') startGame();
        else System.out.println("Thanks for playing!");
    }
   
    //prompts for a single round
    public static String playRound(){
        Random rnd = new Random();
        int userPlay = promptUserPlay();
        
        int computerPlay = rnd.nextInt(3) + 1;
        System.out.println("Computer play: "+computerPlay);
        
        if(userPlay == computerPlay) return "tie";
        else if(computerPlay == getBeatingValue(userPlay)) return "computer";
        else return "player";
    }
    
    //returns value that beats the play value
    public static int getBeatingValue(int play){
        switch(play)
        {
            case 1: return 2;
            case 2: return 3;
            default: return 1;
        }
    }
    
    public static int promptUserPlay()
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Make your play: 1 = Rock, 2 = Paper, 3 = Scissors");
        try {
            int userPlay = userInput.nextInt();
            if(userPlay < 0 || userPlay > 3)
                return promptUserPlay();
            else return userPlay;
        }
        catch(NumberFormatException nfe){
            System.out.println("Invalid input: you must choose a number 1 to 3.");
            return promptUserPlay();
        }
    }
}
