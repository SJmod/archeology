package net.mcreator.archeology.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.state.Property;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.archeology.block.BonesondirtBlock;
import net.mcreator.archeology.block.BoneOnDirtControllerBlock;
import net.mcreator.archeology.ArcheologyMod;

import java.util.Map;

public class BoneOnDirtControllerUpdateTickProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ArcheologyMod.LOGGER.warn("Failed to load dependency x for procedure BoneOnDirtControllerUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ArcheologyMod.LOGGER.warn("Failed to load dependency y for procedure BoneOnDirtControllerUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ArcheologyMod.LOGGER.warn("Failed to load dependency z for procedure BoneOnDirtControllerUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ArcheologyMod.LOGGER.warn("Failed to load dependency world for procedure BoneOnDirtControllerUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = (double) (-2);
		for (int index0 = 0; index0 < (int) (4); index0++) {
			sy = (double) (-1);
			for (int index1 = 0; index1 < (int) (2); index1++) {
				sz = (double) (-2);
				for (int index2 = 0; index2 < (int) (4); index2++) {
					if (((!((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz)))).getBlock() == Blocks.AIR))
							&& (!((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz))))
									.getBlock() == BoneOnDirtControllerBlock.block)))) {
						if ((Math.random() < 0.7)) {
							{
								BlockPos _bp = new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz));
								BlockState _bs = BonesondirtBlock.block.getDefaultState();
								BlockState _bso = world.getBlockState(_bp);
								for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
									Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
									if (_property != null && _bs.get(_property) != null)
										try {
											_bs = _bs.with(_property, (Comparable) entry.getValue());
										} catch (Exception e) {
										}
								}
								world.setBlockState(_bp, _bs, 3);
							}
						}
					}
					sz = (double) (sz + 1);
				}
				sy = (double) (sy + 1);
			}
			sx = (double) (sx + 1);
		}
		sx = (double) (-4);
		for (int index3 = 0; index3 < (int) (8); index3++) {
			sy = (double) (-4);
			for (int index4 = 0; index4 < (int) (8); index4++) {
				sz = (double) (-4);
				for (int index5 = 0; index5 < (int) (8); index5++) {
					if (((!((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz)))).getBlock() == Blocks.AIR))
							&& ((!((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz))))
									.getBlock() == BonesondirtBlock.block))
									&& (!((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz))))
											.getBlock() == BoneOnDirtControllerBlock.block))))) {
						if ((Math.random() < 0.3)) {
							{
								BlockPos _bp = new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz));
								BlockState _bs = BonesondirtBlock.block.getDefaultState();
								BlockState _bso = world.getBlockState(_bp);
								for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
									Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
									if (_property != null && _bs.get(_property) != null)
										try {
											_bs = _bs.with(_property, (Comparable) entry.getValue());
										} catch (Exception e) {
										}
								}
								world.setBlockState(_bp, _bs, 3);
							}
						}
					}
					sz = (double) (sz + 1);
				}
				sy = (double) (sy + 1);
			}
			sx = (double) (sx + 1);
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
			BlockState _bs = Blocks.AIR.getDefaultState();
			BlockState _bso = world.getBlockState(_bp);
			for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
				Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
				if (_property != null && _bs.get(_property) != null)
					try {
						_bs = _bs.with(_property, (Comparable) entry.getValue());
					} catch (Exception e) {
					}
			}
			world.setBlockState(_bp, _bs, 3);
		}
	}
}
