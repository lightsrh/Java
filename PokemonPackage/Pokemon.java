package PokemonPackage;

abstract class Pokemon {
    String name;
    float weight;
    float size;

    public Pokemon(String name, float weight, float size) {
        this.name = name;
        this.weight = weight;
        this.size = size;
    }

    @Override
    public abstract String toString();
}
