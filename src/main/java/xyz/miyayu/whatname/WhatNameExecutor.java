package xyz.miyayu.whatname;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public final class WhatNameExecutor implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        //全ユーザーにメッセージを送信する
        Bukkit.getOnlinePlayers().forEach(SendInfo::sendMessage);
        return true;
    }
}
