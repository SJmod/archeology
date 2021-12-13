package net.mcreator.archeology.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.archeology.ArcheologyMod;

import java.util.Map;

public class InfoStickEntitySwingsItemProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ArcheologyMod.LOGGER.warn("Failed to load dependency entity for procedure InfoStickEntitySwingsItem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(
					new StringTextComponent((("XP: ") + "" + (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).experienceLevel : 0)))),
					(false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(
					new StringTextComponent(
							(("Food: ") + "" + (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).getFoodStats().getFoodLevel() : 0)))),
					(false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(
					new StringTextComponent(
							(("Creative: ") + "" + (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).abilities.isCreativeMode : false)))),
					(false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(
					new StringTextComponent(
							(("Absorption: ") + "" + (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).getAbsorptionAmount() : 0)))),
					(false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(
					new StringTextComponent(
							(("Fly speed: ") + "" + (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).abilities.getFlySpeed() : 0)))),
					(false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent(
					(("Saturation: ") + "" + (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).getFoodStats().getSaturationLevel() : 0)))),
					(false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(
					new StringTextComponent(
							(("Walk speed: ") + "" + (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).abilities.getWalkSpeed() : 0)))),
					(false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(
					new StringTextComponent((("Health: ") + "" + (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1)))),
					(false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((("Yaw: ") + "" + ((entity.rotationYaw)))), (false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((("Pitch: ") + "" + ((entity.rotationPitch)))), (false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(
					new StringTextComponent(
							(("Armour value: ") + "" + (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getTotalArmorValue() : 0)))),
					(false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((("Oxygen: ") + "" + ((entity.getAir())))), (false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent(
					(("Max Health: ") + "" + (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMaxHealth() : -1)))), (false));
		}
	}
}
