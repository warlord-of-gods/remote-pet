package me.welcomehyunseo.remotepet;

import net.minecraft.server.v1_15_R1.EntityInsentient;
import net.minecraft.server.v1_15_R1.PathfinderGoal;

import java.util.EnumSet;

public class PathfinderGoalWalkToDestination extends PathfinderGoal {
    private final EntityInsentient a;  // entity

    private final double f;  // entity speed

    private double c; // x of destination
    private double d; // y of destination
    private double e; // z of destination

    public PathfinderGoalWalkToDestination(
            EntityInsentient a,
            double speed,
            double x,
            double y,
            double z
    ) {
        this.a = a;
        this.f = speed;
        this.c = x;
        this.d = y;
        this.e = z;
        this.a(EnumSet.of(Type.MOVE));
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void e() {
        this.a.getNavigation().a(this.c, this.d, this.e, this.f);
    }

    @Override
    public boolean b() {
        return !this.a.getNavigation().m();
    }
}
