package com.deeznuts.test;

import org.bukkit.plugin.java.JavaPlugin;

public class Tutorial extends JavaPlugin {


	@Override
	public void onEnable() {
		getLogger().info("Youtube Tutorial EP 1 enabled!");
		getCommand("message").setExecutor(new Command());
	}

    @Override 
    public void onDisable() {
    	getLogger().info("Youtube Tutorial EP 1 disabled!");
    }
    
}