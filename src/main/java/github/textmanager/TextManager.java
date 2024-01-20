package github.textmanager;

import org.bukkit.plugin.java.JavaPlugin;

public final class TextManager extends JavaPlugin {
    public static TextManager instance;
    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("插件已加载！作者：" + getDescription().getAuthors());
        instance=this;
        saveDefaultConfig();
        saveConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("插件已卸载！作者：" + getDescription().getAuthors());
        instance=null;
        saveConfig();
    }
}
