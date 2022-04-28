package me.welcomehyunseo.remotepet;

import net.minecraft.server.v1_15_R1.WorldServer;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_15_R1.CraftWorld;
import org.bukkit.entity.Player;

public class CustomPigCommandKit implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(!(commandSender instanceof Player)) return false;

        Player player= (Player) commandSender;
        World world = player.getWorld();
        Location loc = player.getLocation();
        CustomPig customPig = new CustomPig(loc);
        WorldServer worldServer = ((CraftWorld) world).getHandle();
        worldServer.addEntity(customPig);

        return true;
    }
}
