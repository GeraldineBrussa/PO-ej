package org.POO.example.CTD.modulo.uno;

import java.util.Random;
import java.util.Scanner;

//Ex1: https://docs.google.com/document/d/1SYnHLbzc9q89QADGa8SMI1UJBzbLESMhYizwmS_Z0CE/edit?usp=sharing
//Ex2: https://docs.google.com/document/d/1FPrQy3Xj0LqhdM8wvXS8iQIkTmksjAlKrdTpXmIxu28/edit?usp=sharing
//Ex3: https://drive.google.com/file/d/1BMdichZdE3HTzWtwzjg6-st3DVHpy_4T/view?usp=sharing
//Ex4: https://drive.google.com/file/d/1-qaK0-IgUqIJx0xp_tY1-aQIjn8irULB/view?usp=sharing
//Ex5: https://drive.google.com/file/d/1boyzSA8uAqja9ilG5fhWgyBILvvouEJ6/view?usp=sharing
public class Practice {
    Scanner scanner = new Scanner(System.in);
    /*Ex1 */
    public String practiceString(String string1, String string2){
        return string1.equals(string2) ? "The Strings are the same" : "The Strings are different";
    }
    public String practiceInteger (Integer num1, Integer num2){
        int compare = num1.compareTo(num2);
        return compare < 0 ? num1 + " is less than " + num2
                : compare > 0 ? num1 + " is greater than " + num2
                : num1 + " equals " + num2;
    }
    /*Ex2 */
    public void getInitials(){
        System.out.println("Please, enter your name:");
        String name= scanner.nextLine().trim();
        char initialName = name.charAt(0);
        System.out.println("Please, enter your last name:");
        String lastName= scanner.nextLine().trim();
        char initialLastName = lastName.charAt(0);
        System.out.println("Thank you, " + name + ". The initials of your full name are: " + initialName + initialLastName);
        //scanner.close();
    }
    /* Ex3 */
    public boolean isDivisible(int num1, int num2){
        return num1 % num2 == 0;
    }
    /*Ex4 */
    public void getRequiredPackages (){
        System.out.println("Enter the dog's name: ");
        String dogName = scanner.nextLine();
        System.out.println("Enter the amount of food " + dogName + " eats in kg:");
        double foodAmount = scanner.nextDouble();
        scanner.nextLine();
        double [] packageWeights = new double[]{1.2, 0.7, 1.1, 1.3};
        double totalWeight = 0.0;
        int numPackages = 0;
        for (double weight : packageWeights){
            totalWeight += weight;
            numPackages++;
            if (totalWeight >= foodAmount) {
                break;
            }
            }
        System.out.println(dogName + " needs " + numPackages + " packages.");
    }
    /*Ex5 */
    public void rockPaperScissorsLizardSpock (){
        System.out.println("Welcome! \nTo start playing 'Rock, Paper, Scissors, Lizard, Spock', please " +
                "enter your nickname:");
        String name= scanner.nextLine().trim();
        Random random = new Random();
        int playerPoints = 0;
        int programPoints = 0;
        while (true){
            System.out.println("\n---- Turn ----");
            System.out.println(name + ", choose an option: " +
                    "\n----> 0 - Rock," +
                    "\n----> 1 - Paper," +
                    "\n----> 2 - Scissors," +
                    "\n----> 3 - Lizard," +
                    "\n----> 4 - Spock," +
                    "\n----> 5 - rules," +
                    "\n----> 6 - to end");
            Integer playerOption = scanner.nextInt();
            if (playerOption.equals(6)) {
                System.out.println("\n---- Game over ----");
                break;
            }else if (playerOption.equals(5)){
                System.out.println("The rules are:" +
                        "\n--> Scissors cut the paper," +
                        "\n--> The paper wraps the stone," +
                        "\n--> The stone crushes the lizard," +
                        "\n--> The lizard poisons Spock," +
                        "\n--> Spock crushes the scissors," +
                        "\n--> The scissors decapitate the lizard," +
                        "\n--> The lizard devours the paper," +
                        "\n--> Paper disapproves of Spock," +
                        "\n--> Spock disintegrates the stone and," +
                        "\n--> as always, the rock crushes the scissors."
                );
            } else {
                Integer programOption = random.nextInt(5);
                String programOptionString = "";
                switch (programOption) {
                    case 0:
                        programOptionString = "----> 0 - Rock";
                        break;
                    case 1:
                        programOptionString = "----> 1 - Paper";
                        break;
                    case 2:
                        programOptionString = "----> 2 - Scissors";
                        break;
                    case 3:
                        programOptionString = "----> 3 - Lizard";
                        break;
                    case 4:
                        programOptionString = "----> 4 - Spock";
                        break;
                }
                System.out.println("Sheldon C3PO Cooper chooses:" + programOptionString);
                System.out.println("---- Game turn result ----");
                int result = whoWins(playerOption, programOption);
                if (result == 0) {
                    System.out.println("It was a tie");
                } else if (result == 1) {
                    System.out.println(name + " wins the turn");
                    playerPoints++;
                } else if (result == 2) {
                    System.out.println("Sheldon C3PO Cooper wins the turn");
                    programPoints++;
                } else {
                    System.out.println("Invalid option. Please try again");
                }

            }
            }

        System.out.println("\n---- Final score ----");
        System.out.println("----> "+name + ": " + playerPoints + " points");
        System.out.println("----> Sheldon C3PO Cooper: " + programPoints + " points");
        System.out.println("\n---- Game results ----");
        if (playerPoints > programPoints) {
            System.out.println("----> "+ name + " is the winner");
        } else if (programPoints > playerPoints) {
            System.out.println("----> Sheldon C3PO Cooper is the winner");
        } else {
            System.out.println("It was a tie");
        }

    }

    private int whoWins(Integer playerOption, Integer programOption) {
        if (playerOption.equals(programOption)) {
            return 0; // Empate
        }  else if ((playerOption.equals(0) && (programOption.equals(2) || programOption.equals(3)))
                || (playerOption.equals(1) && (programOption.equals(0) || programOption.equals(3))))
        {            return 1; // Gana el jugador 1
    } else if ((playerOption.equals(2) && (programOption.equals(1) || programOption.equals(3)))
            || (playerOption.equals(3) && (programOption.equals(1) || programOption.equals(4)))) {
        return 1; // Gana el jugador 1
    } else if ((playerOption.equals(3) && (programOption.equals(4) || programOption.equals(0)))
            || (playerOption.equals(4) && (programOption.equals(2) || programOption.equals(0))))
        {        return 1; // Gana el jugador 1
} else if ((programOption.equals(0) && (playerOption.equals(2) || playerOption.equals(3)))
        || (programOption.equals(1) && (playerOption.equals(0) || playerOption.equals(3))))
        {return 2; // Gana el jugador 2
        } else if ((programOption.equals(2) && (playerOption.equals(1) || playerOption.equals(3)))
        || (programOption.equals(3) && (playerOption.equals(1) || playerOption.equals(4)))) {
        return 2; // Gana el jugador 2
        } else if ((programOption.equals(3) && (playerOption.equals(4) || playerOption.equals(0)))
        || (programOption.equals(4) && (playerOption.equals(2) || playerOption.equals(0))))
        {return 2; // Gana el jugador 2
        } else {
        return -1; // Opción inválida
        }
    }
    }

