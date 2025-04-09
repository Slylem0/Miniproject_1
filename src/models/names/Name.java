package models.names;

public enum Name {
    // Grass
    Bayleef("Grass"), Chikorita("Grass"), Leafeon("Grass"), Sceptile("Grass"), Tangela("Grass"),
    // Fire
    Arcanine("Fire"), Blaziken("Fire"), Charizard("Fire"), Flareon("Fire"), Ninetales("Fire"),
    // Water
    Blastoise("Water"), Milotic("Water"), Starmie("Water"), Vaporeon("Water"), Wartortle("Water"),
    // Electric
    Zapdos("Electric"), Electivire("Electric"), Jolteon("Electric"), Luxray("Electric"), Raichu("Electric"),
    // Psychic
    Alakazam("Psychic"), Espeon("Psychic"), Gardevoir("Psychic"), Metagross("Psychic"), Mrmime("Psychic"),
    // Fighting
    Conkeldurr("Fighting"), Hariyama("Fighting"), Hitmonlee("Fighting"), Lucario("Fighting"), Machamp("Fighting"),
    // Dark
    Darkcry("Dark"), Bisharp("Dark"), Houndoom("Dark"), Umbreon("Dark"), Zoroark("Dark"),
    // Steel
    Aggron("Steel"), Melmetal("Steel"), Mawile("Steel"), Dialga("Steel"), Steelix("Steel"),
    // Dragon
    Dragonite("Dragon"), Flygon("Dragon"), Garchomp("Dragon"), Salamence("Dragon"), Druddigon("Dragon");

    private final String type;

    Name(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
