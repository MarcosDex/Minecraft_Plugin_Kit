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
            player.getInventory().addItem(key);
        }
        return true;
    }
}
