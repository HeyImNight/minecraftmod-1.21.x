package net.jrake.minecraftmod;

import net.fabricmc.api.ModInitializer;

import net.jrake.minecraftmod.block.ModBlocks;
import net.jrake.minecraftmod.item.ModItemGroups;
import net.jrake.minecraftmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinecraftMod implements ModInitializer {
	public static final String MOD_ID = "minecraftmod";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		//Call to register Item Groups
		ModItemGroups.registerItemGroups();

		//Call to register all items in the Mod from the "ModItems" class.
		ModItems.registerModItems();

		//Call to register Blocks
		ModBlocks.registerBlocks();

	}


}