package org.POO.example.CTD.modulo.uno;

import java.time.LocalDate;

//Ex6: https://docs.google.com/document/d/1DLRp5PzkIu2W5MiZPa5hsOB9QE-pwcf-a8QSF9v8FI8/edit?usp=sharing
public class Dog {
    String name;
    int yearOfBirth;
    double weight;
    String race;
    boolean isAdopted;
    boolean chip;
    boolean injured;

    public Dog(String name, int yearOfBirth, double weight, String race, boolean isAdopted, boolean chip, boolean injured) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.weight = weight;
        this.race = race;
        this.isAdopted = isAdopted;
        this.chip = chip;
        this.injured = injured;
    }

    public Dog(String name, int yearOfBirth, double weight, String race, boolean isAdopted) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.weight = weight;
        this.race = race;
        this.isAdopted = isAdopted;
        this.chip= false;
        this.injured= false;
    }

    public String calculateAge(){
        int presentYear = LocalDate.now().getYear();
        int age = presentYear - yearOfBirth;
        return "The dog "+ name + " is " + age + " years old";
    }
    public String getLost (){
        return chip ?  name + " can't get lost because he has a chip." : name + " can get lost " +
                "because he does not have a chip.";
    }
    public String fitToAdopt (){
        return !injured && !isAdopted && weight > 5.0 ? name + " is in perfect condition to be adopted." :
                "Unfortunately, " + name + " doesn't meet the conditions to be adopted.";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public boolean isAdopted() {
        return isAdopted;
    }

    public void setAdopted(boolean adopted) {
        isAdopted = adopted;
    }

    public boolean isChip() {
        return chip;
    }

    public void setChip(boolean chip) {
        this.chip = chip;
    }

    public boolean isInjured() {
        return injured;
    }

    public void setInjured(boolean injured) {
        this.injured = injured;
    }
}
