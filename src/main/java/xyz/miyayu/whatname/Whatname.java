package xyz.miyayu.whatname;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Whatname extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginCommand("whatname").setExecutor(new WhatNameExecutor());
        Bukkit.getServer().getPluginManager().registerEvents(new JoinEvent(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
