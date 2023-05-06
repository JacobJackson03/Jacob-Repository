package weekNine;
import java.util.HashMap;
public class VideoGamesHashMap {public static void main(String[] args) {
    // Creates a new HashMap to store video game and publisher information
    HashMap<String, String> videoGames = new HashMap<String, String>();

    // Adds key-value pairs to the HashMap
    videoGames.put("Call of Duty", "Activision");
    videoGames.put("Fortnite", "Epic Games");
    videoGames.put("Minecraft", "Mojang Studios");
    videoGames.put("League of Legends", "Riot Games");

    // Access values in the HashMap using their corresponding keys
    String publisher1 = videoGames.get("Call of Duty");
    String publisher2 = videoGames.get("Fortnite");
    String publisher3 = videoGames.get("Minecraft");
    String publisher4 = videoGames.get("League of Legends");

    // Prints the values to the console
    System.out.println("Call of Duty is published by " + publisher1);
    System.out.println("Fortnite is published by " + publisher2);
    System.out.println("Minecraft is published by " + publisher3);
    System.out.println("League of Legends is published by " + publisher4);
}
}
}
