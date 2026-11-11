package com.somsom.visuals;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SomsomVisualsClient implements ClientModInitializer {
    public static final String MOD_ID = "somsom-visuals";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("Somsom Visuals mod initialized!");
    }
}
