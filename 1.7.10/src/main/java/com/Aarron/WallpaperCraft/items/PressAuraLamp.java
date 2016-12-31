package com.Aarron.WallpaperCraft.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.Aarron.WallpaperCraft.creativeTab.Tab;


	public class PressAuraLamp extends Item {
		public PressAuraLamp() {
			setUnlocalizedName("pressauralamp");
			setTextureName("wp:pressauralamp");
			setContainerItem(this);
			setCreativeTab(Tab.WPtab);
		}

		@Override
		public void addInformation(ItemStack itemStack, EntityPlayer player, List tooltipLines, boolean advancedTooltips) {
			tooltipLines.add("Combine this with any solid colored block to apply the Aura pattern and make it glow!");
		
		}
		
		@Override 
		public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemstack) {
			
	     return false;
	     
	    }

}
