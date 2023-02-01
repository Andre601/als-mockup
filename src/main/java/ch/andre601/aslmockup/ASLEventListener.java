package ch.andre601.aslmockup;

import ch.andre601.advancedserverlist.api.profiles.ProfileEntry;
import ch.andre601.advancedserverlist.spigot.events.PreServerListSetEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.logging.Logger;

public class ASLEventListener implements Listener{
    
    private final Logger logger;
    
    public ASLEventListener(ASLMockup plugin){
        this.logger = plugin.getLogger();
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
    
    @EventHandler
    public void onPreServerLisSet(PreServerListSetEvent event){
        logger.info("PreServerListSetEvent fired!");
        logger.info("ProfileEntry: " + getProfileEntryContent(event.getEntry()));
    }
    
    private String getProfileEntryContent(ProfileEntry entry){
        return String.format(
            "ProfileEntry{" +
                "motd=[%s], " +
                "players=[%s], " +
                "playerCountText=\"%s\", " +
                "favicon=\"%s\", " +
                "hidePlayersEnabled=%b, " +
                "extraPlayersEnabled=%b, " +
                "extraPlayersCount=%d" +
            "}",
            String.join(", ", entry.getMotd()),
            String.join(", ", entry.getPlayers()),
            entry.getPlayerCountText(),
            entry.getFavicon(),
            entry.isHidePlayersEnabled(),
            entry.isExtraPlayersEnabled(),
            entry.getExtraPlayersCount()
        );
    }
}
