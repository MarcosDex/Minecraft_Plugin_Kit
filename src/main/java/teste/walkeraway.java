package teste;

import org.bukkit.plugin.java.JavaPlugin;

public class walkeraway extends JavaPlugin {

//    private CommandExecutor PlayerGameModeChangeEvent;

    @Override
    public void onEnable() {

            getLogger().info("$6O plugin foi iniciado com sucesso");
            this.getCommand("awykit").setExecutor(new CommandKit());



    }

    @Override
    public void onDisable() {

    }



}
