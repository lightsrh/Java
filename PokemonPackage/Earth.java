package PokemonPackage;

abstract class Earth extends Pokemon {
    int numberOfLegs;

    public Earth(String name, float weight, float size, int numberOfLegs) {
        super(name, weight, size);
        this.numberOfLegs = numberOfLegs;
    }

    public float speed(int numberOfLegs, float size) {
        return numberOfLegs * size * 3;
    }
}
