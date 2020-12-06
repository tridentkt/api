package trident.api.world.biome

enum class MinecraftBiomeType {
    Overworld, Nether, End
}

/**
 * This represents biomes found in vanilla Minecraft.
 */
enum class MinecraftBiome(val type: MinecraftBiomeType, override val label: String) : Biome {
    DeepForest(MinecraftBiomeType.Overworld, "Deep Forest"),
    DarkForestHills(MinecraftBiomeType.Overworld, "Deep Forest Hills"),
    DeepColdOcean(MinecraftBiomeType.Overworld, "Deep Forest Ocean"),
    DeepFrozenOcean(MinecraftBiomeType.Overworld, "Deep Frozen Ocean"),
    DeepLukewarmOcean(MinecraftBiomeType.Overworld, "Deep Lukewarm Ocean"),
    DeepOcean(MinecraftBiomeType.Overworld, "Deep Ocean"),
    DeepWarmOcean(MinecraftBiomeType.Overworld, "Deep Warm Ocean"),
    Desert(MinecraftBiomeType.Overworld, "Desert"),
    DesertHills(MinecraftBiomeType.Overworld, "Desert Hills"),
    DesertLakes(MinecraftBiomeType.Overworld, "Desert Lakes"),
    ErodedBadlands(MinecraftBiomeType.Overworld, "Eroded Badlands"),
    FlowerForest(MinecraftBiomeType.Overworld, "Flower Forest"),
    Forest(MinecraftBiomeType.Overworld, "Forest"),
    FrozenOcean(MinecraftBiomeType.Overworld, "Frozen Ocean"),
    FrozenRiver(MinecraftBiomeType.Overworld, "Frozen River"),
    GiantSpruceTaiga(MinecraftBiomeType.Overworld, "Giant Spruce Taiga"),
    GiantSpruceTaigaHills(MinecraftBiomeType.Overworld, "Giant Spruce Taiga Hills"),
    GiantTreeTaiga(MinecraftBiomeType.Overworld, "Giant Tree Taiga"),
    GiantTreeTaigaHills(MinecraftBiomeType.Overworld, "Giant Tree Taiga Hills"),
    GravellyMountains(MinecraftBiomeType.Overworld, "Gravelly Mountains"),
    IceSpikes(MinecraftBiomeType.Overworld, "Ice Spikes"),
    Jungle(MinecraftBiomeType.Overworld, "Jungle"),
    JungleEdge(MinecraftBiomeType.Overworld, "Jungle Edge"),
    JungleHills(MinecraftBiomeType.Overworld, "Jungle Hills"),
    LukewarmOcean(MinecraftBiomeType.Overworld, "Lukewarm Ocean"),
    ModifiedBadlandsPlateau(MinecraftBiomeType.Overworld, "Modified Badlands Plateau"),
    ModifiedGravellyMountains(MinecraftBiomeType.Overworld, "Modified Gravelly Mountains"),
    ModifiedJungle(MinecraftBiomeType.Overworld, "Modified Jungle"),
    ModifiedJungleEdge(MinecraftBiomeType.Overworld, "Modified Jungle Edge"),
    ModifiedJungleBadlandsPlateau(MinecraftBiomeType.Overworld, "Modified Jungle Badlands Plateau"),
    MountainEdge(MinecraftBiomeType.Overworld, "Mountain Edge"),
    Mountains(MinecraftBiomeType.Overworld, "Mountains"),
    MushroomFieldShore(MinecraftBiomeType.Overworld, "Mushroom Field Shore"),
    MushroomFields(MinecraftBiomeType.Overworld, "Mushroom Fields"),
    Badlands(MinecraftBiomeType.Overworld, "Badlands"),
    BadlandsPlateau(MinecraftBiomeType.Overworld, "Badlands Plateau"),
    BambooJungle(MinecraftBiomeType.Overworld, "Bamboo Jungle"),
    BambooJungleHills(MinecraftBiomeType.Overworld, "Bamboo Jungle Hills"),
    BasaltDeltas(MinecraftBiomeType.Overworld, "Basalt Deltas"),
    Beach(MinecraftBiomeType.Overworld, "Beach"),
    BirchForest(MinecraftBiomeType.Overworld, "Birch Forest"),
    BirchForestHills(MinecraftBiomeType.Overworld, "Birch Forest Hills"),
    ColdOcean(MinecraftBiomeType.Overworld, "Cold Ocean"),
    WoodedBadlandsPlateau(MinecraftBiomeType.Overworld, "Wooded Badlands Plateau"),
    WoodedHills(MinecraftBiomeType.Overworld, "Wooded Hills"),
    WoodedMountains(MinecraftBiomeType.Overworld, "Wooded Mountains"),
    Ocean(MinecraftBiomeType.Overworld, "Ocean"),
    Plains(MinecraftBiomeType.Overworld, "Plains"),
    River(MinecraftBiomeType.Overworld, "River"),
    Savanna(MinecraftBiomeType.Overworld, "Savanna"),
    SavannaPlateau(MinecraftBiomeType.Overworld, "Savanna Plateau"),
    ShatteredSavanna(MinecraftBiomeType.Overworld, "Shattered Savanna"),
    ShatteredSavannaPlateau(MinecraftBiomeType.Overworld, "Shattered Savanna Plateau"),
    SnowyBeach(MinecraftBiomeType.Overworld, "Snowy Beach"),
    SnowyMountains(MinecraftBiomeType.Overworld, "Snowy Mountains"),
    SnowyTaiga(MinecraftBiomeType.Overworld, "Snowy Taiga"),
    SnowyTaigaHills(MinecraftBiomeType.Overworld, "Snowy Taiga Hills"),
    SnowyTaigaMountains(MinecraftBiomeType.Overworld, "Snowy Taiga Mountains"),
    SnowyTundra(MinecraftBiomeType.Overworld, "Snowy Tundra"),
    StoneShore(MinecraftBiomeType.Overworld, "Stone Shore"),
    SunflowerPlains(MinecraftBiomeType.Overworld, "Sunflower Plains"),
    Swamp(MinecraftBiomeType.Overworld, "Swamp"),
    SwampHills(MinecraftBiomeType.Overworld, "Swamp Hills"),
    Taiga(MinecraftBiomeType.Overworld, "Taiga"),
    TaigaHills(MinecraftBiomeType.Overworld, "Taiga Hills"),
    TaigaMountains(MinecraftBiomeType.Overworld, "Taiga Mountains"),
    TallBirchForest(MinecraftBiomeType.Overworld, "Tall Birch Forest"),
    TallBirchHills(MinecraftBiomeType.Overworld, "Tall Birch Hills"),
    WarmOcean(MinecraftBiomeType.Overworld, "Warm Ocean"),

    CrimsonForest(MinecraftBiomeType.Nether, "Crimson Forest"),
    NetherWastes(MinecraftBiomeType.Nether, "Nether Wastes"),
    SoulSandValley(MinecraftBiomeType.Nether, "Soul Sand Valley"),
    WarpedForest(MinecraftBiomeType.Nether, "Warped Forest"),

    EndBarrens(MinecraftBiomeType.End, "End Barrens"),
    EndHighlands(MinecraftBiomeType.End, "End Highlands"),
    EndMidlands(MinecraftBiomeType.End, "End Midlands"),
    TheEnd(MinecraftBiomeType.End, "The End"),
    TheVoid(MinecraftBiomeType.End, "The Void"),
    SmallEndIslands(MinecraftBiomeType.End, "Small End Islands");

    companion object {
        val overworld = values().filter { it.type == MinecraftBiomeType.Overworld }
        val nether = values().filter { it.type == MinecraftBiomeType.Nether }
        val end = values().filter { it.type == MinecraftBiomeType.End }
    }
}
