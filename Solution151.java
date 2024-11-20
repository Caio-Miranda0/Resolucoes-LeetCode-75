import java.util.ArrayList;
import java.util.List;

/**
 * Exercise 151 - Medium - Reverse words in a String.
 * 
 * @author Caio-Miranda0
 */

public class Solution151 {

	public static String reverseWords(String str) {
		// aux serve para ir capturando valores válidos e adicionando na lista
		// instanciada abaixo.
		String aux = "";

		List<String> words = new ArrayList<>();

		// Caminhando sobre a String posição por posição.
		for (int i = 0; i < str.length(); i++) {

			// Eu só capturo valores válidos.
			if (str.charAt(i) != ' ') {
				aux += str.charAt(i);

				// Quando eu não estive na última posição da String e o caracter da próxima
				// posição for um espaço vazio, adicione na lista o que foi concatenado em aux
				// até o presente momento e logo em seguida 'esvazie' aux.
				if (i != str.length() - 1 && str.charAt(i + 1) == ' ') {
					words.add(aux);
					aux = "";
				}

				// Se eu estiver na última posição, não terá um próximo caracter, então
				// simplesmente faça parte da lógica anterior.

				// Não há o perigo de eu concatenar espaços vazios da String original, pois o
				// primeiro controle de fluxo garante que eu só concatene valores válidos.
				if (i == str.length() - 1) {
					words.add(aux);
					aux = "";
				}

			}
		}

		// Imprima na ordem inversa e vá colocando os espaços em branco, exceto na
		// última posição.
		for (int i = words.size() - 1; i >= 0; i--) {
			if (i != 0) {
				aux += words.get(i) + " ";
			} else {
				aux += words.get(i);
			}
		}

		return aux;
	}
}
