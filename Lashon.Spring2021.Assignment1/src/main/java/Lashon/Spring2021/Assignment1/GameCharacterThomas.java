
package Lashon.Spring2021.Assignment1;

public class GameCharacterThomas extends GameCharacter {
      public GameCharacterThomas(){
        actBehavior= new Dance();
        guitarBehavior= new GibsonFlying();
    }
    public void display() {
        System.out.println("I am Thomas.");
 }
}
