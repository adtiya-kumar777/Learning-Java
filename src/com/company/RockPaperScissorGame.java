package com.company;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorGame {
    public static String generatecomputerChoice(Random random) {
        int wordNumber;
        wordNumber = random.nextInt(3) + 1;
        String computerChoice = "";

        if(wordNumber == 1) {
            computerChoice = "rock";
        } else if(wordNumber == 2) {
            computerChoice = "paper";
        } else if(wordNumber == 3) {
            computerChoice = "scissors";
        }
        System.out.println("\nThe computer already made a choice ");
        return computerChoice;
    }

    public static void showMenu() {
        System.out.println("Option to choose from :\n1.Rock\n2.Paper\n3.Sciccors");
    }
    public static String getUserChoice(Scanner scanner) {
        String userWordChoice = "";
        System.out.print("\nPlease make your : ");
        userWordChoice = scanner.nextLine();
        return userWordChoice;
    }
    public static String chooseWinner(String computerChoice , String userChoice) {
        String winner = "No winner";
        String customMessage = "Both choose same ";
        String finalMesasage = "";

        String rockCustomMessage = "rock smashes the scissors";
        String scissorsCustomMessage = "scissors cuts the paper";
        String paperCustomMessage = "paper wraps rock";

        if(computerChoice.equals("rock") && userChoice.equalsIgnoreCase("scissors")) {
            winner = "Computer";
            customMessage = rockCustomMessage;
        } else if(userChoice.equalsIgnoreCase("rock") && computerChoice.equals("scissors")) {
            winner = "User";
            customMessage = rockCustomMessage;
        }
        if(computerChoice.equals("scissors") && userChoice.equalsIgnoreCase("paper")) {
            winner = "Computer";
            customMessage = scissorsCustomMessage;
        } else if(userChoice.equalsIgnoreCase("scissors") && computerChoice.equals("paper")) {
            winner = "User";
            customMessage = scissorsCustomMessage;
        }
        if(computerChoice.equals("paper") && userChoice.equalsIgnoreCase("rock")) {
            winner = "Computer";
            customMessage = paperCustomMessage;
        } else if (userChoice.equalsIgnoreCase("paper") && computerChoice.equalsIgnoreCase("rock")) {
            winner = "User";
            customMessage = paperCustomMessage;
        }
        finalMesasage = winner + "won (" + customMessage + ")";
        return finalMesasage;
    }

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String computerChoice;
        String userChoice;
        String winner;

        showMenu();
        computerChoice = generatecomputerChoice(random);
        userChoice = getUserChoice(scanner);
        winner = chooseWinner(computerChoice, userChoice);

        System.out.println("\n You choose: " + userChoice + "\nComputer choose: " + computerChoice);
        System.out.println(winner);
    }
}
