package brokenGameEngineStorage;

import com.game.adventure.GameEngine;

public class GameEngineTest02 {
    
    public static void main(String[] args) {
    
    // Initialize the GameEngine
    GameEngine engine = new GameEngine();
    
    // Create rooms
    engine.createRoom("Classroom", "A room in Salazar Hall");
   
    
     // Start the game with a player in the Entrance
    engine.startGame("Classroom", "Player1", 10);

    engine.addItemToInventory("fancy rock");

    String[] myInvent = engine.getInventory();
    System.out.println(myInvent[0]);
    
    // Test complete
    }
 
}
