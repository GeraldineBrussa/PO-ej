package org.POO.example;

import org.POO.example.CTD.modulo.uno.Mascota;
import org.POO.example.CTD.modulo.uno.Practice;
import org.POO.example.MET.Training;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello world!");
        /* Ejercicio 1: Mascota */
        Mascota pet1 = new Mascota("perro", "Manchitas", 2, 2,"guau, guau");
        Mascota pet2 = new Mascota("gato", "Dmitry", 5, 1,"miau, miau");
        pet1.showPet();
        pet2.showPet();
        /* Resolución de Desafíos */
        Training training = new Training();
        System.out.println(training.areaOrPerimeter(20,2));
        System.out.println(training.enough(11,5,5));
        System.out.println(Arrays.toString(training.pipeFix(new int[]{1, 12, 3, 6})));
        /* Prácticas de CTD */
        Practice practice = new Practice();
        /*Ex1 */
        System.out.println(practice.practiceString("Hello World","Hello World"));
        System.out.println(practice.practiceString("Hello World","Hola Mundo"));
        System.out.println(practice.practiceInteger(15,33));
        System.out.println(practice.practiceInteger(7,7));
        /*Ex2 */
        practice.getInitials();
        /*Ex3 */
        System.out.println("Please enter a number:");
        int n = scanner.nextInt();
        System.out.println("Please enter another number:");
        int divisor = scanner.nextInt();
        boolean result = practice.isDivisible(n,divisor);
        System.out.println("Is "+ n + " divisible by " + divisor +"? " + result);
        /*Ex4 */
        practice.getRequiredPackages();

        /*Ex5 */
        practice.rockPaperScissorsLizardSpock();
        practice.firstPrimeNumber();
        practice.payroll();
    }
}