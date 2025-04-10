package models.names;

public enum AttackName {
    // Grass
    LeafBlade("Leaf Blade", "Grass", "Physical", 90),
    GigaDrain("Giga Drain", "Grass", "Special", 75),
    EnergyBall("Energy Ball", "Grass", "Special", 80),
    VineWhip("Vine Whip", "Grass", "Physical", 45),
    RazorLeaf("Razor Leaf", "Grass", "Physical", 55),
    SolarBeam("Solar Beam", "Grass", "Special", 120),
    SeedBomb("Seed Bomb", "Grass", "Physical", 80),

    // Fire
    Flamethrower("Flamethrower", "Fire", "Special", 90),
    FireBlast("Fire Blast", "Fire", "Special", 110),
    FirePunch("Fire Punch", "Fire", "Physical", 75),
    Ember("Ember", "Fire", "Special", 40),
    HeatWave("Heat Wave", "Fire", "Special", 95),
    FlameWheel("Flame Wheel", "Fire", "Physical", 60),
    LavaPlume("Lava Plume", "Fire", "Special", 80),

    // Water
    Surf("Surf", "Water", "Special", 90),
    HydroPump("Hydro Pump", "Water", "Special", 110),
    WaterGun("Water Gun", "Water", "Special", 40),
    AquaTail("Aqua Tail", "Water", "Physical", 90),
    BubbleBeam("Bubble Beam", "Water", "Special", 65),
    Scald("Scald", "Water", "Special", 80),
    Waterfall("Waterfall", "Water", "Physical", 80),

    // Electric
    Thunderbolt("Thunderbolt", "Electric", "Special", 90),
    Thunder("Thunder", "Electric", "Special", 110),
    Spark("Spark", "Electric", "Physical", 65),
    ThunderShock("ThunderShock", "Electric", "Special", 40),
    WildCharge("Wild Charge", "Electric", "Physical", 90),
    Discharge("Discharge", "Electric", "Special", 80),
    VoltTackle("Volt Tackle", "Electric", "Physical", 120),

    // Psychic
    Psybeam("Psybeam", "Psychic", "Special", 65),
    Psychic("Psychic", "Psychic", "Special", 90),
    ZenHeadbutt("Zen Headbutt", "Psychic", "Physical", 80),
    Confusion("Confusion", "Psychic", "Special", 50),
    FutureSight("Future Sight", "Psychic", "Special", 120),
    Extrasensory("Extrasensory", "Psychic", "Special", 80),
    PsychoCut("Psycho Cut", "Psychic", "Physical", 70),

    // Fighting
    CloseCombat("Close Combat", "Fighting", "Physical", 120),
    KarateChop("Karate Chop", "Fighting", "Physical", 50),
    BrickBreak("Brick Break", "Fighting", "Physical", 75),
    CrossChop("Cross Chop", "Fighting", "Physical", 100),
    FocusPunch("Focus Punch", "Fighting", "Physical", 150),
    DrainPunch("Drain Punch", "Fighting", "Physical", 75),
    MachPunch("Mach Punch", "Fighting", "Physical", 40),

    // Dark
    Bite("Bite", "Dark", "Physical", 60),
    Crunch("Crunch", "Dark", "Physical", 80),
    DarkPulse("Dark Pulse", "Dark", "Special", 80),
    NightSlash("Night Slash", "Dark", "Physical", 70),
    FoulPlay("Foul Play", "Dark", "Physical", 95),
    Thief("Thief", "Dark", "Physical", 60),
    Assurance("Assurance", "Dark", "Physical", 60),

    // Steel
    IronTail("Iron Tail", "Steel", "Physical", 100),
    FlashCannon("Flash Cannon", "Steel", "Special", 80),
    MetalClaw("Metal Claw", "Steel", "Physical", 50),
    BulletPunch("Bullet Punch", "Steel", "Physical", 40),
    SteelWing("Steel Wing", "Steel", "Physical", 70),
    SmartStrike("Smart Strike", "Steel", "Physical", 70),
    IronHead("Iron Head", "Steel", "Physical", 80),

    // Dragon
    DragonClaw("Dragon Claw", "Dragon", "Physical", 80),
    DragonPulse("Dragon Pulse", "Dragon", "Special", 85),
    Outrage("Outrage", "Dragon", "Physical", 120),
    DragonTail("Dragon Tail", "Dragon", "Physical", 60),
    DracoMeteor("Draco Meteor", "Dragon", "Special", 130),
    Twister("Twister", "Dragon", "Special", 40),
    DragonBreath("Dragon Breath", "Dragon", "Special", 60);

    private final String attackName;
    private final String type;
    private final String damageType;
    private final int power;

    AttackName(String attackName, String type, String damageType, int power) {
        this.attackName = attackName;
        this.type = type;
        this.damageType = damageType;
        this.power = power;
    }

    public String getAttackName() {
        return attackName;
    }

    public String getType() {
        return type;
    }

    public String getDamageType() {
        return damageType;
    }

    public int getPower() {
        return power;
    }
}
