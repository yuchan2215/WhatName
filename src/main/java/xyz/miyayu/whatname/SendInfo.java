package xyz.miyayu.whatname;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public final class SendInfo {
    private final static String INFO_TEXT = "§6Your Name is §f%s §7(%s)";
    private final static String OP_TEXT = "§c(OP)";
    public static void sendMessage(Player player){
        final String info_text = String.format(INFO_TEXT, player.getName(),player.getUniqueId());
        final String op_text = player.isOp() ? OP_TEXT : "";
        //プレイヤーにメッセージを送信する
        player.sendMessage(info_text + op_text);
    }
}

