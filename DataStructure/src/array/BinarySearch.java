package array;

public class BinarySearch {

	public int search(int[] nums, int target) {
		int left = 0; // Coloco uma referência ao primeiro índice.
		int right = nums.length - 1; // Coloco uma referência ao último índice.

		while (left <= right) {

			int mid = (left + right) / 2; // Coloco uma referência ao índice do meio.
			if (nums[mid] == target) { // Verifico se o valor esperado está no meio do array.
				return mid;
			} else if (nums[mid] < target) { // Verifico se o valor esperado está à direita.
				left = mid + 1;
			} else { // Verifico se o valor esperado está à esquerda.
				right = mid - 1;
			}
		}
		return -1;
	}

}
