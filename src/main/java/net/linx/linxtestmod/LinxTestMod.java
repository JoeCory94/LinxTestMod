package net.linx.linxtestmod;

import net.fabricmc.api.ModInitializer;

import net.linx.linxtestmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LinxTestMod implements ModInitializer {
	public static final String MOD_ID = "linxtestmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("linxtestmod");

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}