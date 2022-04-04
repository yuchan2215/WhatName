package xyz.miyayu.whatname;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class SendInfo {
    public static void sendMessage(Player player){
        //プレイヤーにメッセージを送信する
        player.sendMessage(
                ChatColor.GOLD + "Your Name is " + ChatColor.WHITE + player.getName() + " " +
                        ChatColor.GRAY + "(" + player.getUniqueId() + ")" +
                        (player.isOp()? ChatColor.RED + "(OP)" : "")
        );
    }
}

