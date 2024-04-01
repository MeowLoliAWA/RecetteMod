package com.sakimeow.recettemod.registry;

import com.sakimeow.recettemod.Recettemod;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class RecetteItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Recettemod.MODID);

    public static final RegistryObject<Item> SWEET = ITEMS.register("sweet",() -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MACARONE = ITEMS.register("macarone",() -> new Item(new Item.Properties()
            .food(new FoodProperties.Builder().nutrition(5).saturationMod(4)
                    .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED,30*20,2),1).build())));
    public static final RegistryObject<Item> SWEET_SWORD = ITEMS.register("sweet_sword",()->new SwordItem(RecetteTiers.SWEETS,2,1,new Item.Properties()));
}
