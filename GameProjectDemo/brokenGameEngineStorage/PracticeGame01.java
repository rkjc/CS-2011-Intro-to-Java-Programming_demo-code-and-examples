package brokenGameEngineStorage;

import com.game.adventure.GameEngine;
import com.game.adventure.Enemy;
import com.game.adventure.Inventory;
import com.game.adventure.NPC;
import com.game.adventure.Player;
import com.game.adventure.Room;
import com.game.adventure.Vendor;


public class PracticeGame01 {
    // Buggy getAvailableDirections method
    public static String getAvailableDirections(Room room) {
        String[] directions = new String[4]; // Assume max 4 directions (N, E, S, W)
        int count = 0;

        // Collect connected room directions
        for (String direction : room.getConnectedRooms().keySet()) {
            directions[count++] = direction; // Fill array with directions
        }

        // Build a result string
        String result = "Available directions: ";
        for (int i = 0; i < count; i++) {
            result += directions[i];
            if (i < count - 1) result += ", "; // Add commas between directions
        }

        // Bug: Doesn't handle empty rooms or null input correctly
        return result;
    }

    public static void main(String[] args) {
        // Instantiate the game engine
        GameEngine engine = new GameEngine();

        // Player zondar = new Player();

        // Print a welcome message
        System.out.println("Welcome to MY GAME");

        // Example of using the buggy getAvailableDirections method
        Room currentRoom =  engine.createRoom("Entrance", "A dark and musty cave.");

        //engine.createRoom("Entrance", "A dark and musty cave.");

        // Room currentRoom = engine. findRoomByName("Entrance");

        String currentRoomStr = engine.getCurrentRoom();
        System.out.println("currentRoomStr " + currentRoomStr);

        //System.out.println(getAvailableDirections(currentRoom));
    }
}

