
class EvenElementsArray {
	public static void main(String[] args) {
		int[] arr = { 12, 23, 45, 56, 23, 8 };

		getEvenElements(arr);
	}

	public static void getEvenElements(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}

