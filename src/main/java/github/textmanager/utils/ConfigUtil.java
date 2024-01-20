package github.textmanager.utils;

import github.textmanager.TextManager;

import java.util.List;

public class ConfigUtil {
    public static int getInt(String path){
        return TextManager.instance.getConfig().getInt(path);
    }

    public static boolean getBoolean(String path){
        return TextManager.instance.getConfig().getBoolean(path);
    }

    public static String getString(String path){
        return TextManager.instance.getConfig().getString(path);
    }

    public static List<String> getList(String path){
        return TextManager.instance.getConfig().getStringList(path);
    }
}
