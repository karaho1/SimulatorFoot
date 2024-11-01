package SimulatorFoot;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Random;


public class SimulatorFoot {

	public static void main(String[] args) {
		//open lists and scanners and random 
		//welcome user
		//ask for home and away team names
		//loop through 4 random numbers (home team)
		//loop through 4 random numbers (away team)
		//add all the numbers to a linked list and sum up
		//if numbers aren't equal, determine winner
		//if they are, run overtime
		//congratulate winning team
		
		Scanner userInput = new Scanner(System.in);
		LinkedList<Integer> homeScore = new LinkedList<>();
		LinkedList<Integer> awayScore = new LinkedList<>();
		int homeTotal = 0;
		int awayTotal = 0;
		//opening the scanner, linked list, and defining the empty sums
		
		System.out.println("Hello there... please enter a username: ");
		String userName = userInput.nextLine();
		System.out.println("Welcome to the Football Simulator " + userName);
		System.out.println("First you'll be determining the teams in this game.");
		System.out.println("Please enter the name of the Home Team: ");
		String homeTeam = userInput.nextLine();
		System.out.println("Please enter the name of the Away Team: ");
		String awayTeam = userInput.nextLine();
		//allowing the user to input their own name and the names of their favorite teams
	
		for (int i = 1; i <= 4; i++) {
			Random first = new Random();
			int score = first.nextInt(25);
			homeTotal = homeTotal + score;
			homeScore.add(score);
		}
		//a for loop that generates 4 random numbers for each quarter of the game and adds it to the sum of the home team score
	
		for (int j = 1; j <= 4; j++) {
			Random second = new Random();
			int score2 = second.nextInt(25);
			awayTotal = awayTotal +score2;
			awayScore.add(score2);
		}
		//a for loop that does the same thing for the away team
		
		//loop that compares the sum of the random numbers
		if(awayTotal > homeTotal) {
			System.out.println("Congratulations to the Away Team: " + awayTeam);
			System.out.println(" Q1  Q2  Q3  Q4  Total  Team Name");
			System.out.println(homeScore + "  " + homeTotal + "      " + homeTeam);
			System.out.println(awayScore + "  " + awayTotal + "      " + awayTeam);
			//I added the points display to each facet of the loop so that it would not play twice given the game goes into overtime
		}
		else if(awayTotal < homeTotal) {
			System.out.println("Congratulations to the Home Team: " + homeTeam);
			System.out.println(" Q1  Q2  Q3  Q4  Total  Team Name");
			System.out.println(homeScore + "  " + homeTotal + "      " + homeTeam);
			System.out.println(awayScore + "  " + awayTotal + "      " + awayTeam);
		}
		else {
			System.out.println("It was a tie! Let's roll overtime!");
			Random over1 = new Random();
			int time1 = over1.nextInt(10);
			Random over2 = new Random();
			int time2 = over2.nextInt(10);
			System.out.println(homeTeam +" scored " + time1 + " and " + awayTeam + " scored " + time2);
			if (time1 > time2) {
				System.out.println("Congratulations to the Home Team: " + homeTeam);
			}
			else if (time2 > time1) {
				System.out.println("congratulations to the Away Team: " + awayTeam);
			}
			else {
				System.out.println("Wow! A tie! What are the odds?");
			}
			System.out.println(" Q1  Q2  Q3  Q4  Total  Team Name");
			System.out.println(homeScore + "  " + homeTotal + "      " + homeTeam);
			System.out.println(awayScore + "  " + awayTotal + "      " + awayTeam);
			//this if else loop runs a quick overtime simulation, offering less total points
		}
		//the else section is in case of a tie- the game simulates again
		System.out.println("Thank you for playing the Football Simulation Game, " + userName + "!");
		//thank you message to the user
		userInput.close();
		//closing the scanner

	}
	
	

}
