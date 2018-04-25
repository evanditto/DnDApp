package Server;

import Campaign.Campaign;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * ServerLooder class is used for loading up a campaign to become playable.
 * Class will load all player data, logs, map data, NPC data, and mod data.
 */
public class ServerLoader {

    private String usrDir = "";
    /**
     * Will create a server loader to load the specified campaign and all data
     * associated with the campaign.
     * @param campaign
     */
    public ServerLoader(Campaign campaign){
        usrDir = System.getProperty("user.dir");
        System.out.println("Current Dir: " + usrDir);
    }
}
