package Lashon.Spring2021.Assignment1;

public class GameCharacterCollier extends GameCharacter {
     public GameCharacterCollier(){
        actBehavior= new Rap();
        guitarBehavior= new BMGSpecial();
    }
    public void display() {
        System.out.println("I am Collier");
 }  
}
