package net.jrake.minecraftmod;

import com.jcraft.jorbis.Block;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.jrake.minecraftmod.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class minecraftModClient implements ClientModInitializer
{

    @Override
    public void onInitializeClient()
    {
        //Rendering for flower to make transparent
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                ModBlocks.FIRE_FLOWER_BLOCK,
                ModBlocks.WATER_FLOWER_BLOCK);
    }
}
