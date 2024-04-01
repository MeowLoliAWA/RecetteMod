package com.sakimeow.recettemod.registry;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class RecetteTiers {
    public static final ForgeTier SWEETS = new ForgeTier(3,500,1f,3f,24, BlockTags.NEEDS_IRON_TOOL
    ,()-> Ingredient.of(RecetteItems.SWEET.get()));
}
