package Lashon.Spring2021.Assignment1;

public class GameCharacterSmith extends GameCharacter{
    public GameCharacterSmith(){
        actBehavior= new Dance();
        guitarBehavior= new BMGSpecial();
    }
    public void display() {
        System.out.println("I am Smith");
 }
    
}
