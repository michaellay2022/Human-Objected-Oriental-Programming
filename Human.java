import java.util.ArrayList;

public class Human {
    // attributes==========================
    // or memember of variables
    private String name;
    private int age;

    private int health = 100;

    private int wisdom = 3;
    private int strength = 55;
    private int dexterity = 3;

    // adding static variable
    // private static ArrayList<Human> allHumans = new ArrayList<Human>();
    private static int allHumans = 0;// start with 0

    // contructors ===========================
    public Human() {
        allHumans++; // the same as allHumans = allHumans +1;
    } // this is called an empty constructor

    public Human(String name) {
        this.name = name;
        allHumans++;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        allHumans++;
    }

    // instance methods =========================
    public void eat() {
        // this.name is for whomever instance call on this method.
        System.out.println(this.name + " " + "is eating an apple! Now, his health level is:");
        this.health += 5;
    }

    // example if passing argument into the parameter
    public void eat(int foodCalories) {
        // this.name is for whomever instance call on this method.
        System.out.println(this.name + " " + "is eating an apple! Now, his health level is:");
        this.health += foodCalories;
    }

    // public void getPoisoned() {
    //     // this.name is for whomever instance call on this method.
    //     System.out.println(this.name + "is poisoned!");
    //     this.health -= 7;
    // }
    public Human getPoisoned() {
        // this.name is for whomever instance call on this method.
        System.out.println(this.name + "is poisoned!");
        this.health -= 7;
        return this;
    }

    public void pastaAndCreamSauce() {
        // this.name is for whomever instance call on this method.
        System.out.println(this.name + "was fully regenerated!!");
        this.health = 100;
    }

    public void attack(Human attackee) {
        attackee.health -= this.strength;
        System.out.println("===================================");
        // attackee.setHealth(attackee.getHealth() - this.strength);
    }

    // getters and setters===========================
    public static int getAllHumans() {
        return allHumans;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDexterity() {
        return strength;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }
}