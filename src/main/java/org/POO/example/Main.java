package org.POO.example;

import org.POO.example.CTD.modulo.uno.Dog;
import org.POO.example.CTD.modulo.uno.Mascota;
import org.POO.example.CTD.modulo.uno.Practice;
import org.POO.example.MET.Training;

import java.util.Arrays;
import java.util.Scanner;
//Ex1: https://docs.google.com/document/d/1SYnHLbzc9q89QADGa8SMI1UJBzbLESMhYizwmS_Z0CE/edit?usp=sharing
//Ex2: https://docs.google.com/document/d/1FPrQy3Xj0LqhdM8wvXS8iQIkTmksjAlKrdTpXmIxu28/edit?usp=sharing
//Ex3: https://drive.google.com/file/d/1BMdichZdE3HTzWtwzjg6-st3DVHpy_4T/view?usp=sharing
//Ex4: https://drive.google.com/file/d/1-qaK0-IgUqIJx0xp_tY1-aQIjn8irULB/view?usp=sharing
//Ex5: https://drive.google.com/file/d/1boyzSA8uAqja9ilG5fhWgyBILvvouEJ6/view?usp=sharing
//Ex6: https://docs.google.com/document/d/1DLRp5PzkIu2W5MiZPa5hsOB9QE-pwcf-a8QSF9v8FI8/edit?usp=sharing
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
        /*Ex6 */
        Dog dog1 = new Dog("toto", 2001, 5.30, "Caniche", true, true, false);
        System.out.println(dog1.calculateAge());
        System.out.println(dog1.getLost());
        System.out.println(dog1.fitToAdopt());

    }
}