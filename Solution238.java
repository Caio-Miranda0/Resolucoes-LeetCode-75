/**
 * Exercise 238 - Medium but easy - Product of array except self
 * 
 * @author Caio-Miranda0
 */

public class Solution238 {

	/**
	 * A lógica é simples:
	 * 
	 * para cada posição de nums, criamos uma variável product que recebe o elemento
	 * neutro da multiplicação.
	 * 
	 * Um laço aninhado é responsável por percorrer, como pano de fundo, todas as
	 * posiçoes de nums
	 * 
	 * Toda vez que ele encontra uma posição j que não seja a posição atual do
	 * primeiro laço, ele faz o produto daql posição pelo acumulado em product.
	 * 
	 * @param nums
	 * @return product of array except self
	 */
	public static int[] productExceptSelf(int[] nums) {
		int[] answer = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			int product = 1;
			for (int j = 0; j < nums.length; j++) {
				if (j != i) {
					product *= nums[j];
				}
			}
			answer[i] = product;
		}

		return answer;
	}
}
