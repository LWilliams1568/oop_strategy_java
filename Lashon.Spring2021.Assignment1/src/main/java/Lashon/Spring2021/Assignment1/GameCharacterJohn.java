package Lashon.Spring2021.Assignment1;

public class GameCharacterJohn extends GameCharacter{
    public GameCharacterJohn(){
        actBehavior= new Rap();
        guitarBehavior= new GibsonFlying();
    }
    public void display() {
        System.out.println("I am John.");
    }
}
