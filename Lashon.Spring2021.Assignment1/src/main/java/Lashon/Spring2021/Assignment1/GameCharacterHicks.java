package Lashon.Spring2021.Assignment1;


public class GameCharacterHicks extends GameCharacter {
    public GameCharacterHicks(){
        actBehavior= new TwoGuitars();
        guitarBehavior= new BMGSpecial();
    }
    public void display() {
        System.out.println("I am Hicks");
 }
}
