package org.POO.example.CTD.modulo.uno;
/**
 * Exercise to solve:
 * https://drive.google.com/file/d/1MXd_ROTN_HGqBtuJ_zNKOlCMLOyq7SFk/view?usp=sharing
 * **/
public class Mascota {
    String type;
    String name;
    Integer age;
    Integer food;
    String sound;

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getFood() {
        return food;
    }

    public void setFood(Integer food) {
        this.food = food;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public Mascota(String type, String name, Integer age, Integer food, String sound) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.food = food;
        this.sound = sound;
    }

    public void showPet() {
        System.out.println(name + " es un " + type + ", tiene " + age + " años");
        System.out.println(name + " come " + food + " kilos y hace " + sound);
    }

}
