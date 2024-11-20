import java.util.Scanner;

/**
 * Exercise 1071 - MDC das Strings.
 * 
 * @author Caio-Miranda0
 */

public class Solution1071 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();

		System.out.println(mdcString(a, b));

		sc.close();
	}

	/**
	 * Utiliza algoritmo de euclides para calcular o MDC entre dois números.
	 * 
	 * @param a
	 * @param b
	 * @return o máximo divisor comum entre o tamanho das strings.
	 */
	public static int euclidesMdc(String a, String b) {

		int tamanhoA = a.length();
		int tamanhoB = b.length();
		int temp = 0;

		while (tamanhoB != 0) {
			temp = tamanhoB;
			tamanhoB = tamanhoA % tamanhoB;
			tamanhoA = temp;
		}
		return temp;
	}

	/**
	 * Basicamente avaliamos se a string é a mesma ao concatenar a + b e b + a;
	 * 
	 * Isso garante que podemos recortar a string de 0 até MDC do tamanho.
	 * 
	 * O MDC é usado para avaliar em quantas partes iguais podemos dividir as
	 * strings.
	 * 
	 * Se o MDC for 4, significa que podemos fracionar essas strings em n partes de
	 * tamanho 4 u.m.
	 *
	 * 
	 * @param a
	 * @param b
	 * @return o MDC das Strings.
	 */
	public static String mdcString(String a, String b) {
		String transf1 = a + b;
		String transf2 = b + a;

		if (transf1.equals(transf2)) {
			return a.substring(0, euclidesMdc(a, b));
		} else {
			return "";
		}
	}
}
