package teste;

//import org.bukkit.Material;
//import org.bukkit.command.Command;
//import org.bukkit.command.CommandSender;
//import org.bukkit.entity.Player;
//import org.bukkit.inventory.ItemStack;

import org.bukkit.plugin.java.JavaPlugin;

public class walkeraway extends JavaPlugin {

//    private CommandExecutor PlayerGameModeChangeEvent;

    @Override
    public void onEnable() {

            getLogger().info("$6O plugin foi iniciado com sucesso");
            this.getCommand("awykit").setExecutor(new CommandKit());



    }

//   @Override
//    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
//        if (sender instanceof Player) {
//            Player player = (Player) sender;
//
//            // Create a new ItemStack (type: diamond)
//            ItemStack diamond = new ItemStack(Material.DIAMOND);
//
//            // Create a new ItemStack (type: brick)
//            ItemStack bricks = new ItemStack(Material.BRICK);
//
//            // Set the amount of the ItemStack
//            bricks.setAmount(20);
//
//            // Give the player our items (comma-seperated list of all ItemStack)
//            player.getInventory().addItem(bricks, diamond);
//        }
//
//        // If the player (or console) uses our command correct, we can return true
//        return true;
//    }

    @Override
    public void onDisable() {

    }








}