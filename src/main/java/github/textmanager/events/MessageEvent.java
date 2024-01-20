package github.textmanager.events;

import github.textmanager.entity.Text;
import github.textmanager.service.SendTextService;
import github.textmanager.utils.ConfigUtil;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.List;

public class MessageEvent implements Listener {
    private static final boolean enable_relay= ConfigUtil.getBoolean("enable-relay");
    @EventHandler
    public void onMessage(AsyncPlayerChatEvent event){
        Player player = event.getPlayer();
        String message = event.getMessage();
        if (enable_relay){
            Text text = new Text(player.getName(),player.getUniqueId().toString(),message);
            List<String> servers = ConfigUtil.getList("relay-servers");
            SendTextService.send(text,servers);
        }
    }

}
