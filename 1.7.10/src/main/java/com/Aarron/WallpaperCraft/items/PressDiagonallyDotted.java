package com.Aarron.WallpaperCraft.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.Aarron.WallpaperCraft.creativeTab.Tab;

	public class PressDiagonallyDotted extends Item {
		public PressDiagonallyDotted() {
			setUnlocalizedName("pressdiagonallydotted");
			setTextureName("wp:pressdiagonallydotted");
			setContainerItem(this);
			setCreativeTab(Tab.WPtab);
		}

		@Override
		public void addInformation(ItemStack itemStack, EntityPlayer player, List tooltipLines, boolean advancedTooltips) {
			tooltipLines.add("Combine this with any solid colored block to apply the Diagonally Dotted pattern.");
		
		}
		
		@Override 
		public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemstack) {
			
	     return false;
	     
	    }

}