package net.jrake.minecraftmod.block;

import net.jrake.minecraftmod.MinecraftMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.component.type.SuspiciousStewEffectsComponent;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks
{
    //Blocks ------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static final Block CONTAINER = registerBlock("container", new Block(
            AbstractBlock.Settings.create()
                    .strength(5f)
                    .sounds(BlockSoundGroup.ANVIL)
                    .pistonBehavior(PistonBehavior.NORMAL)
                    .mapColor(MapColor.WHITE)
                    .hardness(.25f)
                    .nonOpaque()));

    //Flowers -----------------------------------------------------------------------------------------------------------------------------------------------------------------

        //Creating the block BUT we can also copy from existing blocks
    public static final FlowerBlock WATER_FLOWER_BLOCK = registerFlowerBlock("water_flower_block", new FlowerBlock(SuspiciousStewEffectsComponent.DEFAULT,
            AbstractBlock.Settings.create()
                    .strength(5f)
                    .ticksRandomly()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.CHERRY_SAPLING)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .noCollision()
                    .mapColor(MapColor.DARK_RED)));
    public static final FlowerBlock FIRE_FLOWER_BLOCK = registerFlowerBlock("fire_flower_block", new FlowerBlock(SuspiciousStewEffectsComponent.DEFAULT,
            AbstractBlock.Settings.create()
                    .strength(5f)
                    .ticksRandomly()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.CHERRY_SAPLING)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .noCollision()
                    .mapColor(MapColor.DARK_RED)));


//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //Helper Methods
    private static FlowerBlock registerFlowerBlock(String name, FlowerBlock block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK,Identifier.of(MinecraftMod.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK,Identifier.of(MinecraftMod.MOD_ID, name), block);
    }

    //Since this is a block, you need to initialize the corresponding item with it as well
    private static void registerBlockItem(String name, Block block)
    {
        //call .net Minecraft registry
        Registry.register(Registries.ITEM, Identifier.of(MinecraftMod.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    public static void registerBlocks()
    {
        // not a nescessity but nice to have
        MinecraftMod.LOGGER.info("Registering ModBlocks for "+ MinecraftMod.MOD_ID);

        // adding to the block list
        /*
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries ->
        {
            entries.add(ModBlocks.FIRE_FLOWER_BLOCK);
        });

         */

    }
}
