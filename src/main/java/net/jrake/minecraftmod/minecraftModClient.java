package net.jrake.minecraftmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.jrake.minecraftmod.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class minecraftModClient implements ClientModInitializer
{

    @Override
    public void onInitializeClient()
    {
        //Rendering for fire flower to make transparent
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FIRE_FLOWER_BLOCK, RenderLayer.getCutout());
    }
}
