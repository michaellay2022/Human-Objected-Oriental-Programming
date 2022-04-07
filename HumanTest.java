public class HumanTest {
    public static void main(String[] args) {
        Human sbeve = new Human("Sbeve Tyler", 37); //will get error without the empty constructor
        Human rafaelangelo = new Human("Rafaelangelo Turtle", 22); 
        Human bobothy = new Human("Bobothy Jones", 45);
        
        System.out.println("Sbeve's health level: "+ sbeve.getHealth());
        System.out.println(rafaelangelo.getHealth());
        System.out.println(bobothy.getHealth());

        sbeve.eat();
        System.out.println(sbeve.getName() + " " + sbeve.getHealth());

        sbeve.eat(10); //passing value 10 into this int foodCalories
        System.out.println(sbeve.getName() + " " + sbeve.getHealth());

        bobothy.getPoisoned().getPoisoned().getPoisoned().getPoisoned();
        System.out.println(bobothy.getName() + " " + bobothy.getHealth());
        // System.out.println(rafaelangelo.getName() + " " + rafaelangelo.getHealth());
        // System.out.println(bobothy.getName() + " " + bobothy.getHealth());

        bobothy.pastaAndCreamSauce();
        System.out.println(bobothy.getName() + " " + bobothy.getHealth());

        System.out.println("The number of humans is:" + Human.getAllHumans()); //call Human class directly

        rafaelangelo.attack(sbeve);
        System.out.println(sbeve.getName() + " " + bobothy.getHealth());
    }

}
