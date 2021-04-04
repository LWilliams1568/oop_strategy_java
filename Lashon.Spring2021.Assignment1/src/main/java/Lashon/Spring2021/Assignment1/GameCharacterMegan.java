package Lashon.Spring2021.Assignment1;

public class GameCharacterMegan extends GameCharacter{
    public GameCharacterMegan(){
        actBehavior= new Dance();
        guitarBehavior= new GibsonFlying();
    }
    public void display() {
        System.out.println("I am Megan.");
 }
}
