package com.foxdev.abilitys;

import org.bukkit.plugin.java.JavaPlugin;

public final class Abilitys extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new RakketWerper(), this);
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
