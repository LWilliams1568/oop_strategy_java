package Lashon.Spring2021.Assignment1;

public class GameCharacterDenial extends GameCharacter{
    public GameCharacterDenial(){
        actBehavior= new Sing();
        guitarBehavior= new BMGSpecial();
    }
    public void display() {
        System.out.println("I am Denial");
 }
}
