package net.jrake.minecraftmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jrake.minecraftmod.MinecraftMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //Space below here is where we will register the items and can assign them attributes. Just add any new items here using "public static final".
    public static final Item FIRE_FLOWER = registerItem("fire_flower", new Item(new Item.Settings()));




    //Function that will register the items we list above
    public static Item registerItem(String name, Item item){

        return Registry.register(Registries.ITEM, Identifier.of(MinecraftMod.MOD_ID, name), item);
    }

    //Function called to register Mod Items
    public static void registerModItems() {

    }
}
