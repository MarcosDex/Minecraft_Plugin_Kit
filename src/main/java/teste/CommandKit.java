package teste;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;


public class CommandKit implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;


            ItemStack key = new ItemStack(Material.TRIPWIRE_HOOK);
            ItemMeta meta = key.getItemMeta();
            meta.setDisplayName(ChatColor.DARK_BLUE + "" + ChatColor.BOLD + "Chavinha Especial");
            meta.setLore(Arrays.asList(ChatColor.DARK_PURPLE + "Esta chave foi encontrada nos confins do mundo!"));
            key.setItemMeta(meta);

//            ItemStack craft1 = new ItemStack(Material.FLINT);
//            ItemMeta craft1M = craft1.getItemMeta();
//            craft1M.setDisplayName(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Silex à Aiguiser Brute");
//            craft1M.setLore(Arrays.asList(ChatColor.DARK_PURPLE + "Composant d'Artisanat"));
//            craft1.setItemMeta(craft1M);


            // Give the player our items (comma-seperated list of all ItemStack)
            player.getInventory().addItem(key);
        }

        // If the player (or console) uses our command correct, we can return true
        return true;
    }
}
