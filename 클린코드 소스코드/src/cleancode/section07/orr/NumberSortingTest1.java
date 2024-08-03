package cleancode.section07.orr;


public class NumberSortingTest1 {

	public static void main(String[] args) {
		int[] array = { 0, 3, 5, 2, 6, 7, 8, 9, 1, 4 };
		sortArray(array);
	}

	private static void sortArray(int[] array) {
		System.out.println("배열 내용");
		for (int v : array) {
			System.out.print(v + " ");
		}
		
		System.out.println("\n---------------------------\n");
		
		int[] sortedArray = new int[array.length];
		int temp;
		try {
			if (array.length > 0) {
				if (sortedArray.length > 0) {
					if (sortedArray.length == array.length) {
						for (int i = 0; i < array.length; i++) {
							for (int k = i + 1; k < array.length; k++) {
								if (array[i] > array[k]) {
									temp = array[i];
									array[i] = array[k];
									array[k] = temp;
								}
							}
						}

						for (int i = 0; i < array.length; i++) {
							sortedArray[i] = array[i];
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("배열 내용");
		for (int v : sortedArray) {
			System.out.print(v + " ");
		}

	}
}

