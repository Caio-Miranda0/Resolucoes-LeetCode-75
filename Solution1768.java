import java.util.Scanner;

/**
 * Number 1768 - Easy - Merge Strings Alternately
 * 
 * @author Caio-Miranda0
 */
public class Solution1768 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String palavra1 = sc.next();
		String palavra2 = sc.next();

		/**
		 * Para o caso único em que o tamanho das duas variáveis do tipo String são
		 * iguais, simplesmente imprimimos os índices correspondentes em ambas,
		 * garantindo que palavra1 seja sempre impressa primeiro.
		 */
		if (palavra1.length() == palavra2.length()) {

			for (int i = 0; i < palavra1.length(); i++) {
				System.out.print(String.valueOf(palavra1.charAt(i)) + String.valueOf(palavra2.charAt(i)));
			}

		}

		/**
		 * limiteImpressao = para casos diferentes do fluxo anterior, é importante saber
		 * até qual posição é possível imprimir as string de maneira alternada.
		 * 
		 * limiteImpressao garante o valor mínimo inteiro que ambas strings possuem,
		 * possibilitando acessar os índices para imprimir alternadamente conforme
		 * enunciado.
		 * 
		 * Depois que realizamos a impressão alternada, precisamos imprimir o resto da
		 * string da variável de maior tamanho.
		 * 
		 * Fazemos esse processo para os casos em que palavra1 > palavra2 e palavra2 > palavra1
		 */

		int limiteImpressao = Math.min(palavra1.length(), palavra2.length());

		if (palavra1.length() > palavra2.length()) {
			for (int i = 0; i < limiteImpressao; i++) {
				System.out.print(String.valueOf(palavra1.charAt(i)) + String.valueOf(palavra2.charAt(i)));
			}
			for (int i = limiteImpressao; i < palavra1.length(); i++) {
				System.out.print(String.valueOf(palavra1.charAt(i)));
			}
		}

		if (palavra2.length() > palavra1.length()) {
			for (int i = 0; i < limiteImpressao; i++) {
				System.out.print(String.valueOf(palavra1.charAt(i)) + String.valueOf(palavra2.charAt(i)));
			}
			for (int i = limiteImpressao; i < palavra2.length(); i++) {
				System.out.print(String.valueOf(palavra2.charAt(i)));
			}
		}

		sc.close();
	}

}
