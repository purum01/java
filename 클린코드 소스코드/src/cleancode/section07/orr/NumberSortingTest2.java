package cleancode.section07.orr;


public class NumberSortingTest2 {

	public static void main(String[] args) {
		int[] array = { 0, 3, 5, 2, 6, 7, 8, 9, 1, 4 };
		printArray(array);
		System.out.println("\n---------------------------\n");
		int[] sortedArray = sortArray(array);
		printArray(sortedArray);
	}

	private static int[] sortArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int k = i + 1; k < array.length; k++) {
				if (array[i] > array[k]) {
					int temp = array[i];
					array[i] = array[k];
					array[k] = temp;
				}
			}
		}
		return array;
	}

	private static void printArray(int[] sortedArray) {
		System.out.println("배열 내용");
		for (int v : sortedArray) {
			System.out.print(v + " ");
		}
	}
}
