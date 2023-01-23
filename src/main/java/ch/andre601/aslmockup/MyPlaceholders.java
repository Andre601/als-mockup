package ch.andre601.aslmockup;

import ch.andre601.advancedserverlist.api.PlaceholderProvider;
import ch.andre601.advancedserverlist.api.objects.GenericPlayer;
import ch.andre601.advancedserverlist.api.objects.GenericServer;

public class MyPlaceholders extends PlaceholderProvider{
    
    public MyPlaceholders(){
        super("myplaceholders");
    }
    
    @Override
    public String parsePlaceholder(String placeholder, GenericPlayer genericPlayer, GenericServer genericServer){
        if(placeholder.equals("hello"))
            return "Hi!";
        
        return null;
    }
}
