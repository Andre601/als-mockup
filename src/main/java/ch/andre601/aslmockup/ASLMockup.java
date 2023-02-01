package ch.andre601.aslmockup;

import ch.andre601.advancedserverlist.api.AdvancedServerListAPI;
import org.bukkit.plugin.java.JavaPlugin;

public class ASLMockup extends JavaPlugin{
    
    @Override
    public void onEnable(){
        AdvancedServerListAPI api = AdvancedServerListAPI.get();
        
        api.addPlaceholderProvider(new MyPlaceholders());
        
        new ASLEventListener(this);
    }
}
