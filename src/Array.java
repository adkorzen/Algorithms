public class Array {

	public static double max(double[] array) {
		if (array.length == 0) {
			throw new RuntimeException();
		}
		double max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
	
	public static double min(double[] array) {
		if (array.length == 0) {
			throw new RuntimeException();
		}
		double min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
}
