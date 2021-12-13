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
		boolean orebelow = false;
		orebelow = (boolean) (false);
		if ((Math.random() < 0.2)) {
			orebelow = (boolean) (true);
		}
		sx = (double) (-3);
		for (int index0 = 0; index0 < (int) (6); index0++) {
			sy = (double) (-3);
			for (int index1 = 0; index1 < (int) (6); index1++) {
				sz = (double) (-3);
				for (int index2 = 0; index2 < (int) (6); index2++) {
					if (((!((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz)))).getBlock() == Blocks.AIR))
							&& (!((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz))))
									.getBlock() == BoneOnDirtControllerBlock.block)))) {
						if ((((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz))))
								.getMaterial() == net.minecraft.block.material.Material.EARTH)
								|| (((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz))))
										.getMaterial() == net.minecraft.block.material.Material.ROCK)
										|| ((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz))))
												.getMaterial() == net.minecraft.block.material.Material.ORGANIC)))) {
							if ((Math.random() < 0.8)) {
								if ((Math.random() < 0.75)) {
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
								} else {
									{
										BlockPos _bp = new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz));
										BlockState _bs = Blocks.COARSE_DIRT.getDefaultState();
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
						}
					}
					sz = (double) (sz + 1);
				}
				sy = (double) (sy + 1);
			}
			sx = (double) (sx + 1);
		}
		sx = (double) (-5);
		for (int index3 = 0; index3 < (int) (10); index3++) {
			sy = (double) (-5);
			for (int index4 = 0; index4 < (int) (10); index4++) {
				sz = (double) (-5);
				for (int index5 = 0; index5 < (int) (10); index5++) {
					if (((!((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz)))).getBlock() == Blocks.AIR))
							&& ((!((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) sy)))
									.getBlock() == BonesondirtBlock.block))
									&& (!((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz))))
											.getBlock() == BoneOnDirtControllerBlock.block))))) {
						if ((((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz))))
								.getMaterial() == net.minecraft.block.material.Material.EARTH)
								|| (((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz))))
										.getMaterial() == net.minecraft.block.material.Material.ROCK)
										|| ((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz))))
												.getMaterial() == net.minecraft.block.material.Material.ORGANIC)))) {
							if ((Math.random() < 0.35)) {
								if ((Math.random() < 0.35)) {
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
								} else if ((Math.random() < 0.5)) {
									{
										BlockPos _bp = new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz));
										BlockState _bs = Blocks.COARSE_DIRT.getDefaultState();
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
								} else {
									{
										BlockPos _bp = new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz));
										BlockState _bs = Blocks.GRASS_PATH.getDefaultState();
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
						}
					}
					sz = (double) (sz + 1);
				}
				sy = (double) (sy + 1);
			}
			sx = (double) (sx + 1);
		}
		sx = (double) (-7);
		for (int index6 = 0; index6 < (int) (14); index6++) {
			sy = (double) (-7);
			for (int index7 = 0; index7 < (int) (14); index7++) {
				sz = (double) (-7);
				for (int index8 = 0; index8 < (int) (14); index8++) {
					if (((!((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz)))).getBlock() == Blocks.AIR))
							&& ((!((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) sy)))
									.getBlock() == BonesondirtBlock.block))
									&& (!((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz))))
											.getBlock() == BoneOnDirtControllerBlock.block))))) {
						if ((((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz))))
								.getMaterial() == net.minecraft.block.material.Material.EARTH)
								|| (((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz))))
										.getMaterial() == net.minecraft.block.material.Material.ROCK)
										|| ((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz))))
												.getMaterial() == net.minecraft.block.material.Material.ORGANIC)))) {
							if ((Math.random() < 0.15)) {
								if ((Math.random() < 0.1)) {
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
								} else if ((Math.random() < 0.3)) {
									{
										BlockPos _bp = new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz));
										BlockState _bs = Blocks.COARSE_DIRT.getDefaultState();
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
								} else {
									{
										BlockPos _bp = new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz));
										BlockState _bs = Blocks.GRASS_PATH.getDefaultState();
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
						}
					}
					sz = (double) (sz + 1);
				}
				sy = (double) (sy + 1);
			}
			sx = (double) (sx + 1);
		}
		if ((orebelow == (true))) {
			sx = (double) (-7);
			for (int index9 = 0; index9 < (int) (14); index9++) {
				sy = (double) (-10);
				for (int index10 = 0; index10 < (int) (14); index10++) {
					sz = (double) (-7);
					for (int index11 = 0; index11 < (int) (14); index11++) {
						if (((!((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz)))).getBlock() == Blocks.AIR))
								&& ((!((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) sy)))
										.getBlock() == BonesondirtBlock.block))
										&& (!((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz))))
												.getBlock() == BoneOnDirtControllerBlock.block))))) {
							if (((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz))))
									.getMaterial() == net.minecraft.block.material.Material.ROCK)) {
								if ((Math.random() < 0.5)) {
									if ((Math.random() < 0.6)) {
										{
											BlockPos _bp = new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz));
											BlockState _bs = Blocks.COAL_ORE.getDefaultState();
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
									} else if ((Math.random() < 0.5)) {
										{
											BlockPos _bp = new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz));
											BlockState _bs = Blocks.IRON_ORE.getDefaultState();
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
									} else if ((Math.random() < 0.4)) {
										{
											BlockPos _bp = new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz));
											BlockState _bs = Blocks.REDSTONE_ORE.getDefaultState();
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
									} else if ((Math.random() < 0.4)) {
										{
											BlockPos _bp = new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz));
											BlockState _bs = Blocks.GOLD_ORE.getDefaultState();
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
									} else if ((Math.random() < 0.3)) {
										{
											BlockPos _bp = new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz));
											BlockState _bs = Blocks.LAPIS_ORE.getDefaultState();
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
									} else if ((Math.random() < 0.3)) {
										{
											BlockPos _bp = new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz));
											BlockState _bs = Blocks.EMERALD_ORE.getDefaultState();
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
									} else {
										{
											BlockPos _bp = new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz));
											BlockState _bs = Blocks.DIAMOND_ORE.getDefaultState();
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
							}
						}
						sz = (double) (sz + 1);
					}
					sy = (double) (sy + 1);
				}
				sx = (double) (sx + 1);
			}
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
