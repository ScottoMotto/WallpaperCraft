package Aarron.WallpaperCraft.blocks.fancytiles;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import Aarron.WallpaperCraft.blockStates.BlockStates;
import Aarron.WallpaperCraft.blockStates.BlockTypes2;
import Aarron.WallpaperCraft.blocks.IMetaBlock2;


public class FancyTilesCyan extends IMetaBlock2<BlockTypes2> {

	public FancyTilesCyan() {
		super(Material.ROCK, "fancytilescyan");
		this.setSoundType(SoundType.STONE);
		this.setHardness(1.25F);
	}

	@Override
	protected BlockTypes2 getDefaultStateVariant() {
		return BlockTypes2.Zero;
	}

	@Override
	protected BlockTypes2 fromMeta(int meta) {
		return BlockTypes2.fromMeta(meta);
	}

	@Override
	protected PropertyEnum<BlockTypes2> getVariantEnum() {
		return BlockStates.WPblocks2;
	}
}