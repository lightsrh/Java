package PokemonPackage;

public class Sea extends Water {
    public Sea(String name, float weight, float size, int numberOfFins) {
        super(name, weight, size, numberOfFins);
    }

    @Override
    public float speed(int numberOfFins, float weight) {
        return weight / 25 * numberOfFins;
    }
}
