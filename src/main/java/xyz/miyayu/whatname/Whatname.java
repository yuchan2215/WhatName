package xyz.miyayu.whatname;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Whatname extends JavaPlugin {

    @Override
    public void onEnable() {
        //コマンドの追加
        Bukkit.getPluginCommand("whatname").setExecutor(new WhatNameExecutor());
        //参加時の処理の定義
        Bukkit.getServer().getPluginManager().registerEvents(new JoinEvent(),this);
    }

    @Override
    public void onDisable() {
    }
}
