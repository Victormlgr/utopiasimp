
package net.mcreator.utopiaasimpserver.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.utopiaasimpserver.item.SimpcardItem;
import net.mcreator.utopiaasimpserver.UtopiaASimpServerModElements;

@UtopiaASimpServerModElements.ModElement.Tag
public class UtopiaSimpModItemGroup extends UtopiaASimpServerModElements.ModElement {
	public UtopiaSimpModItemGroup(UtopiaASimpServerModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabutopia_simp_mod") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SimpcardItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
