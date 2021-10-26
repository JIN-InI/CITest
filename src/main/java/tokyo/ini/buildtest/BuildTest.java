package tokyo.ini.buildtest;

import org.bukkit.plugin.java.JavaPlugin;

public final class BuildTest extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getLogger().info("Hello World!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
