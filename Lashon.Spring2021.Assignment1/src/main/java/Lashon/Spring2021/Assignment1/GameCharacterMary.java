package Lashon.Spring2021.Assignment1;

public class GameCharacterMary extends GameCharacter {
   public GameCharacterMary(){
        actBehavior= new TwoGuitars();
        guitarBehavior= new GibsonFlying();
    }
    public void display() {
        System.out.println("I am Mary.");
 }   
}
