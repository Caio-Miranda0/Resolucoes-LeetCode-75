import java.util.ArrayList;
import java.util.List;

/**
 * Exercise 1431 - Easy - Kids with the greatest number of candies
 * 
 * @author Caio-Miranda0
 */

public class Solution1431 {

	/**
	 * Primeiro passo: encontramos o maior número de doces existente entre as
	 * crianças.
	 * 
	 * Segundo passo: percorremos o array com a qtd de doces das crianças e
	 * verificamos se ao somar a nossa qtd de doces extras resulta naquela criança
	 * ter o maior número de doces.
	 * 
	 * Caso ela fique, true; else, false.
	 * 
	 * Obs: pode-se usar o método estático de Array.sort para encontrar o maior
	 * número de doces dentre as crianças, mas preferi fazer na mão.
	 * 
	 * @param kidsCandies
	 * @param xCandie
	 * @return uma lista que verifica se cada criança fica ou não com o maior número
	 *         de doces.
	 */
	public List<Boolean> greatestCandies(int[] kidsCandies, int xCandie) {
		int maior = kidsCandies[0];
		for (int daVez : kidsCandies) {
			if (daVez > maior) {
				maior = daVez;
			}
		}

		List<Boolean> verify = new ArrayList<>();
		for (int i = 0; i < kidsCandies.length; i++) {
			if (kidsCandies[i] + xCandie >= maior) {
				verify.add(true);
			} else {
				verify.add(false);
			}
		}
		return verify;
	}
}
