package com.aefonix.autoreferee;

import org.bukkit.plugin.java.JavaPlugin;

public class AutoReferee extends JavaPlugin {
  @Override
  public void onEnable() {
    getLogger().info("ENABLED");
  }

  @Override
  public void onDisable() {
    getLogger().info("DISABLED");
  }
}
