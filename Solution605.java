
/**
 * Exercise 605 - Easy - Can Place Flowers.
 * 
 * @author Caio-Miranda0
 * 
 */

public class Solution605 {

	/**
	 * Resumo: 1 - Precisamos saber se estamos na primeira ou última posição do
	 * jardim.
	 * 
	 * 2 - Essas posições tem casos particulares de verificação.
	 * 
	 * 3 - De resto, precisamos saber se a atual posição e nossa volta estão vazios
	 * para poder plantar algo.
	 * 
	 * 4 - A ideia é plantar exatamente TODAS as sementes.
	 * 
	 * 5 - Uma variável auxiliar registra a cada vez que planto uma semente.
	 * 
	 * 
	 * @param jardim
	 * @param qtdNovasFlores
	 * @return um valor boolean true se posso plantar a quantidade total de novas
	 *         flores, false caso não.
	 */

	public static boolean possoPlantar(int[] jardim, int qtdNovasFlores) {

		int sementesPlantadas = 0;

		for (int i = 0; i < jardim.length; i++) {
			// Quando estou na primeira porção do jardim não tenho um anterior.
			if (i == 0) {
				if (jardim[i] == 0 && jardim[i + 1] == 0) {
					sementesPlantadas++;
				}
			}

			// Quando estou no miolo do jardim, tenho anterior, o atual e o posterior.
			if (i > 0 && i < jardim.length - 1) {
				if (jardim[i - 1] == 0 && jardim[i] == 0 && jardim[i + 1] == 0) {
					sementesPlantadas++;
				}
			}

			// Quando estou na última, não tenho posterior.
			if (i == jardim.length - 1) {
				if (jardim[i - 1] == 0 && jardim[i] == 0) {
					sementesPlantadas++;
				}
			}
		}

		// Só imprimo true se plantar TODAS as sementes.
		if (sementesPlantadas == qtdNovasFlores) {
			return true;
		} else {
			return false;
		}
	}
}
