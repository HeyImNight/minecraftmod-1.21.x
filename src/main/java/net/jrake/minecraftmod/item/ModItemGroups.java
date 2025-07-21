package net.jrake.minecraftmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.jrake.minecraftmod.MinecraftMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    //List any items under here using "entries.add(ModItems.ModItem)" to add to this Item Group
    public static final ItemGroup MINECRAFT_MOD_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MinecraftMod.MOD_ID, "minecraft_mod_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.FIRE_FLOWER))
                    .displayName(Text.translatable("Minecraft Mod Items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.FIRE_FLOWER);

                    }).build());

    //If you want to create a new group just copy the code above except for the entries added.


    public static void registerItemGroups(){
        MinecraftMod.LOGGER.info("Registering Item Groups for " + MinecraftMod.MOD_ID);
    }
}
