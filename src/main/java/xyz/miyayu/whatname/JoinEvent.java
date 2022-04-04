package xyz.miyayu.whatname;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
        //参加したユーザーにメッセージを送信する
        SendInfo.sendMessage(e.getPlayer());
    }
}
