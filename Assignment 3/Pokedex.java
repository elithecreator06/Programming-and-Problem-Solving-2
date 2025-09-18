import java.util.ArrayList;

public class Pokedex {
    private ArrayList <Pokemon> myPokedex = new ArrayList<Pokemon>();

    public void addToDex(Pokemon p){
        myPokedex.add(p);
    }


    public String toString(){
        String pokemonsCaught = "";
        for(Pokemon p : myPokedex){
            pokemonsCaught += p.toString() + "\n";
        }
        return pokemonsCaught;
    }
}
