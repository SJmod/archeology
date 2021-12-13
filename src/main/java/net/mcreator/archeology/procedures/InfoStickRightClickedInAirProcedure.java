package net.mcreator.archeology.procedures;

import net.minecraftforge.fml.server.ServerLifecycleHooks;

import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.Minecraft;

import net.mcreator.archeology.ArcheologyMod;

import java.util.Map;

public class InfoStickRightClickedInAirProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ArcheologyMod.LOGGER.warn("Failed to load dependency entity for procedure InfoStickRightClickedInAir!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ArcheologyMod.LOGGER.warn("Failed to load dependency x for procedure InfoStickRightClickedInAir!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ArcheologyMod.LOGGER.warn("Failed to load dependency y for procedure InfoStickRightClickedInAir!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ArcheologyMod.LOGGER.warn("Failed to load dependency z for procedure InfoStickRightClickedInAir!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ArcheologyMod.LOGGER.warn("Failed to load dependency world for procedure InfoStickRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(
					new StringTextComponent((("Moon factor: ") + "" + ((world.getDimensionType().getMoonPhase(world.func_241851_ab()))))), (false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((("Biome noise: ") + "" + ((Biome.INFO_NOISE.noiseAt(x, z, (true)))))),
					(false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(
					new StringTextComponent((("Sky visible: ") + "" + ((world.canBlockSeeSky(new BlockPos((int) x, (int) y, (int) z)))))), (false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(
					new StringTextComponent(
							(("World surface height: ") + "" + ((world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z))))),
					(false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(
					new StringTextComponent((("Ocean floor height: ") + "" + ((world.getHeight(Heightmap.Type.OCEAN_FLOOR, (int) x, (int) z))))),
					(false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((("Biome temp: ") + ""
					+ ((world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getTemperature(new BlockPos((int) x, (int) y, (int) z)) * 100.f)))),
					(false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((("World spawn: ") + "" + ((world.getWorldInfo().getSpawnX())) + ""
					+ (", ") + "" + ((world.getWorldInfo().getSpawnY())) + "" + (", ") + "" + ((world.getWorldInfo().getSpawnZ())))), (false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent(
					(("Dimension ID: ") + "" + ((world instanceof World ? (((World) world).getDimensionKey()) : World.OVERWORLD)))), (false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((("Time: ") + "" + ((world.getWorldInfo().getDayTime())))), (false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((("Time: ") + "" + ((world.getWorldInfo().getDayTime())))), (false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(
					new StringTextComponent((("Light level: ") + "" + ((world.getLight(new BlockPos((int) x, (int) y, (int) z)))))), (false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(
					new StringTextComponent((("Is day: ") + "" + (((world instanceof World) ? ((World) world).isDaytime() : false)))), (false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((("Is raining: ") + "" + (world.getWorldInfo().isRaining()))), (false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((("Players in world: ") + "" + ((world.getPlayers().size())))),
					(false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((("Players online: ") + ""
					+ ((world.isRemote()
							? Minecraft.getInstance().getConnection().getPlayerInfoMap().size()
							: ServerLifecycleHooks.getCurrentServer().getCurrentPlayerCount())))),
					(false));
		}
	}
}
