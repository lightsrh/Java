package PokemonPackage;

public class Stay extends Earth {
    float watchTV;

    public Stay(String name, float weight, float size, int numberOfLegs, float watchTV) {
        super(name, weight, size, numberOfLegs);
        this.watchTV = watchTV;
    }

    @Override
    public String toString() {
        return "I am the " + this.getClass().getSimpleName() + " pokemon, my weight is " + this.weight + " kg, my speed is " + this.speed(this.numberOfLegs, this.size) + " km/h, I have " + this.numberOfLegs + " legs, my height is " + this.size + "m, I watch TV " + this.watchTV + " hours a day";
    }
}
