package me.welcomehyunseo.remotepet;

import net.minecraft.server.v1_15_R1.*;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_15_R1.CraftWorld;

public class CustomPig extends EntityPig {
    public CustomPig(Location loc) {
        super(EntityTypes.PIG, ((CraftWorld)loc.getWorld()).getHandle());
        this.setPosition(
                loc.getX(),
                loc.getY(),
                loc.getZ()
        );
        this.setHealth(20.0f); // Sets Health
        this.setCustomName(new ChatComponentText(ChatColor.LIGHT_PURPLE + "PIG"));
        this.setCustomNameVisible(true); // Makes the name visible to the player in-game
        this.setInvulnerable(true);
    }

    @Override
    protected void initPathfinder() {
        this.goalSelector.a(0, new PathfinderGoalWalkToDestination(this, 1, -5.5, 66, 99.5));
        this.goalSelector.a(2, new PathfinderGoalLookAtPlayer(this, EntityHuman.class, 8.0F));
        this.goalSelector.a(8, new PathfinderGoalFloat(this));
    }
}
