package Lashon.Spring2021.Assignment1;

public abstract class GameCharacter {
    GuitarBehavior guitarBehavior;
    ActBehavior actBehavior;
    
    public GameCharacter(){
    }
    public abstract void display();
    
    public void playGuitar() {
        guitarBehavior.guitarType();
    }
 
    public void playAct() {
        actBehavior.actType();
    } 
    
    public void setGuitarBehavior(GuitarBehavior gb) {
        guitarBehavior = gb;
    }

    public void setActBehavior(ActBehavior ab) {
        actBehavior = ab;
    }
    
}
