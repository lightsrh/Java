package PokemonPackage;

public class Sport extends Earth {
    int heartRate;

    public Sport(String name, float weight, float size, int numberOfLegs, int heartRate) {
        super(name, weight, size, numberOfLegs);
        this.heartRate = heartRate;
    }

    @Override
    public String toString() {
        return "I am the " + this.getClass().getSimpleName() + " pokemon, my weight is " + this.weight + " kg, my speed is " + this.speed(this.numberOfLegs, this.size) + " km/h, I have " + this.numberOfLegs + " legs, my height is " + this.size + "m, my heart rate is " + this.heartRate + " beats per minute";
    }
}
