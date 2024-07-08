package PokemonPackage;

abstract class Water extends Pokemon {
    int numberOfFins;

    public Water(String name, float weight, float size, int numberOfFins) {
        super(name, weight, size);
        this.numberOfFins = numberOfFins;
    }

    public float speed(int numberOfFins, float weight) {
        return weight / 25 * numberOfFins;
    }

    @Override
    public String toString() {
        return "I am the " + this.getClass().getSimpleName() + " pokemon, my weight is " + this.weight + " kg, my speed is " + this.speed(this.numberOfFins, this.weight) + " km/h, I have " + this.numberOfFins + " fins";
    }
}
