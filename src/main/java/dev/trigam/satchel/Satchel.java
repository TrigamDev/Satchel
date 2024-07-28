package dev.trigam.satchel;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Satchel implements ModInitializer {
	public static final String ModId = "collections";
    public static final Logger LOGGER = LoggerFactory.getLogger("satchel");

	public static Identifier id (String path) {
		return Identifier.of(Satchel.ModId, path);
	}

	@Override
	public void onInitialize() {}
}