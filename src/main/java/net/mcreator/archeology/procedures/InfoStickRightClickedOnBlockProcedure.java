package net.mcreator.archeology.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.block.IGrowable;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.BlockState;

import net.mcreator.archeology.ArcheologyMod;

import java.util.Map;

public class InfoStickRightClickedOnBlockProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ArcheologyMod.LOGGER.warn("Failed to load dependency entity for procedure InfoStickRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ArcheologyMod.LOGGER.warn("Failed to load dependency x for procedure InfoStickRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ArcheologyMod.LOGGER.warn("Failed to load dependency y for procedure InfoStickRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ArcheologyMod.LOGGER.warn("Failed to load dependency z for procedure InfoStickRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ArcheologyMod.LOGGER.warn("Failed to load dependency world for procedure InfoStickRightClickedOnBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent(
					(("Bonemeal-able: ") + "" + (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() instanceof IGrowable)))),
					(false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent(
					(("Fluid: ") + "" + (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() instanceof FlowingFluidBlock)))),
					(false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent(
					(("Fluid source: ") + "" + (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getFluidState().isSource())))),
					(false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity)
					.sendStatusMessage(
							new StringTextComponent((("Waterloggable: ") + ""
									+ (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() instanceof IWaterLoggable)))),
							(false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(
					new StringTextComponent((("Valid position: ") + "" + (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
							.isValidPosition(world, new BlockPos((int) x, (int) y, (int) z)))))),
					(false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(
					new StringTextComponent(
							(("Harvest level: ") + "" + ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getHarvestLevel())))),
					(false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((("Hardness: ") + "" + ((world
					.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlockHardness(world, new BlockPos((int) x, (int) y, (int) z)))))),
					(false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent(
					(("Light level: ") + "" + ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getLightValue())))), (false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((("Opacity: ") + ""
					+ ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getOpacity(world, new BlockPos((int) x, (int) y, (int) z)))))),
					(false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((("Enchant bonus: ") + "" + ((world
					.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getEnchantPowerBonus(world, new BlockPos((int) x, (int) y, (int) z)))))),
					(false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(
					new StringTextComponent((("Solid: ") + "" + ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).isSolid())))),
					(false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((("Direction: ") + "" + ((new Object() {
				public Direction getDirection(BlockPos pos) {
					try {
						BlockState _bs = world.getBlockState(pos);
						DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
						if (property != null)
							return _bs.get(property);
						return Direction.getFacingFromAxisDirection(
								_bs.get((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis")),
								Direction.AxisDirection.POSITIVE);
					} catch (Exception e) {
						return Direction.NORTH;
					}
				}
			}.getDirection(new BlockPos((int) x, (int) y, (int) z)))))), (false));
		}
	}
}
