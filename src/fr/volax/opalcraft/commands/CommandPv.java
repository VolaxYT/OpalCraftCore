package fr.volax.opalcraft.commands;

import fr.volax.opalcraft.utils.*;
import org.bukkit.command.*;
import org.bukkit.World;
import org.bukkit.entity.Player;

public class CommandPv implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!Messages.noplayer(sender)) return false;
        Player player = (Player)sender;
        World world = player.getWorld();
        if(world.getName().equals("greenfield") || world.getName().equals("spawn")){
            player.sendMessage(Config.getString("messages.GTA-dk"));
            return false;
        }
        return false;
    }
}
