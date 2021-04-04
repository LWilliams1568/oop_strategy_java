package Lashon.Spring2021.Assignment1;

public class GuitarHeroIII_Lashon {
    public static void main(String[] args) {
        // Collier Character
        GameCharacter player1 = new GameCharacterSmith();
        System.out.println("player 1:");
        player1.playGuitar();
        player1.playAct(); 
        
        //Setting behaviors 
        player1.setGuitarBehavior(new GibsonFlying());
        player1.setActBehavior(new Sing());
        System.out.println("player 1:");
        player1.playGuitar();
        player1.playAct(); 
        player1.display();
                
        
        //Denial Character
        GameCharacter player2 = new GameCharacterCollier();
        System.out.println("player 2:");
        player2.playGuitar();
        player2.playAct();
        player2.display();
        
        //Hicks Character
        GameCharacter player3 = new GameCharacterDenial();
        System.out.println("player 3:");
        player3.playGuitar();
        player3.playAct();    
        
        //Joe Character
        GameCharacter player4 = new GameCharacterHicks();
        System.out.println("player 4:");
        player4.playGuitar();
        player4.playAct();  
        
        //John Character
        GameCharacter player5 = new GameCharacterMegan();
        System.out.println("player 5:");
        player5.playGuitar();
        player5.playAct();  
        
        //Mary Character
        GameCharacter player6 = new GameCharacterJohn();
        System.out.println("player 6:");
        player6.playGuitar();
        player6.playAct();  
        
        //Megan Character
        GameCharacter player7 = new GameCharacterJoe();
        System.out.println("player 7:");
        player7.playGuitar();
        player7.playAct();
        
        //Smith Character
        GameCharacter player8 = new GameCharacterMary();
        System.out.println("player 8:");
        player8.playGuitar();
        player8.playAct();
        
        //Thomas Character
        GameCharacter player9 = new GameCharacterThomas();
          System.out.println("player 9:");
        player9.playGuitar();
        player9.playAct();
              
    }
 
}
