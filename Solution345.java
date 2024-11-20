import java.util.ArrayList;
import java.util.List;

/**
 * Exercise 345 - Easy - Reverse vowels of a String.
 * 
 * @author Caio-Miranda0
 */

public class Solution345 {

	/**
	 * Resumo:
	 * 
	 * Quebramos a String de parâmetro em um Array de caracteres. Coletamos as
	 * vogais de trás pra frente, guardamos elas, e marcamos um X no lugar de onde
	 * elas foram removidas.
	 * 
	 * Tendo as vogais na ordem invertida, substituimos os lugares marcados com X
	 * com as respectivas vogais.
	 * 
	 * @param word
	 * @return uma String com as vogais na ordem inversa.
	 */
	public static String reverseVowels(String word) {
		char[] wordSeparated = word.toCharArray();

		// Coletando as vogais e armazenando na lista de vogais.
		// Marcamos os lugares de onde elas foram removidas com X.

		List<String> vowels = new ArrayList<>();
		for (int i = wordSeparated.length - 1; i >= 0; i--) {

			String aux = String.valueOf(wordSeparated[i]);
			if (aux.equalsIgnoreCase("a")) {
				wordSeparated[i] = 'x';
				vowels.add(aux);
			}
			if (aux.equalsIgnoreCase("e")) {
				wordSeparated[i] = 'x';
				vowels.add(aux);
			}
			if (aux.equalsIgnoreCase("i")) {
				wordSeparated[i] = 'x';
				vowels.add(aux);
			}
			if (aux.equalsIgnoreCase("o")) {
				wordSeparated[i] = 'x';
				vowels.add(aux);
			}
			if (aux.equalsIgnoreCase("u")) {
				wordSeparated[i] = 'x';
				vowels.add(aux);
			}
		}

		// Criando a String de saída com as vogais na ordem inversa.
		// Basicamente percorremos o array wordSeparated na ordem crescente dos índices
		// e sempre que inserimos a vogal no lugar marcado com X, atualizamos a posição
		// da lista.

		String saida = "";
		int j = 0;
		for (int i = 0; i < wordSeparated.length; i++) {
			switch (wordSeparated[i]) {
			case 'x':
				wordSeparated[i] = vowels.get(j).charAt(0);
				j++;
				saida += String.valueOf(wordSeparated[i]);
				break;
			default:
				saida += String.valueOf(wordSeparated[i]);
				continue;
			}

		}

		return saida;
	}
}
