
public class Ex6_3_2_Maximum_Value {
	public static void main(String[] args) {
		int[] values = new int[1000];

		// Assign each spot in the array to a random number between -1000000 and 1000000
		// Hint: (int)(Math.random() * 2000001) - 1000000; generates a number in the
		// correct range

		// Your code here

		// Find the maximum value in the array
		int max = maxValue(values);
		System.out.println("The largest value in the array is: " + max);

	}

	// POST: returns the largest value in the array
	public static int maxValue(int[] arr) {
		// Complete this method
	}
}
