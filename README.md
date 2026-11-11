# Somsom Visuals 1.0.0

Fabric client mod project targeting Minecraft 1.21.11. It adds a compact dark HUD with purple accents: player/server/FPS header, online-player list, active potion effects and timers, a basic held-item cooldown status, and player coordinates.

There are no KillAura or Speed modules.

## Build

Requires JDK 21 and internet access for Gradle to download Minecraft/Fabric dependencies.

Run:

```bash
./gradlew build
```

The output JAR will be in `build/libs/`.

This is a reconstructed starter project, not a verified build. The original uploaded JAR contained only a compiled class, so its previous features could not be reliably recovered. StaffList currently shows the online player list; actual staff detection is server-specific and is not implemented.
