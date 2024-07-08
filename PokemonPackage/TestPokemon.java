package PokemonPackage;

import java.util.ArrayList;

public class TestPokemon {
    public static void main(String[] args) {
        // Create an array of 5 Pokemons
        ArrayList<Pokemon> pokemons = new ArrayList<>();
        // Create 5 Pokemons and store them in the array
        pokemons.add(new Sport("Sport", 70.5f, 1.8f, 2, 120));
        pokemons.add(new Stay("Stay", 65.3f, 1.75f, 2, 5.5f));
        pokemons.add(new Sea("Sea", 50.0f, 1.2f, 4));
        pokemons.add(new Cruising("Cruising", 55.0f, 1.5f, 4));
        pokemons.add(new Sport("Sport", 68.0f, 1.85f, 2, 110));

        // Display the array of Pokemons
        for (Pokemon pokemon : pokemons) {
            System.out.println(pokemon);
        }
    }
}
