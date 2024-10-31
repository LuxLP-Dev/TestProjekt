package lux.luxlp.testprojekt;

import org.bukkit.plugin.java.JavaPlugin;

public final class TestProjekt extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("TestProjekt wurde erfolgreich aktiviert!");
    }

    @Override
    public void onDisable() {
        System.out.println("TestProjekt wurde erfolgreich deaktiviert!");
    }
}
