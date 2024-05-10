package exerciciodois;

import java.util.ArrayList;
import java.util.List;

import exercicioum.Animal;
import exercicioum.Cachorro;
import exercicioum.Gato;

public class Classe_base {

	public static void main(String[] args) {
		List<Animal> animais = new ArrayList<>();
		 animais.add(new Cachorro());
		 animais.add(new Gato());

	}

}
