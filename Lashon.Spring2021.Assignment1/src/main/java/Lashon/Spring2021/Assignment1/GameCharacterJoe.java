package Lashon.Spring2021.Assignment1;

public class GameCharacterJoe extends GameCharacter {
    public GameCharacterJoe(){
        actBehavior= new Sing();
        guitarBehavior= new GibsonFlying();
    }
    public void display() {
        System.out.println("I am Joe.");
 }  
}
