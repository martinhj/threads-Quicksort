class FindLeastLinear {
	FindLeastLinear(int [] array) {
		// Linear least
		for (int i = 1; i < array.length; i++) {
			if (n > array[i]) n = array[i];
			if (m < array[i]) m = array[i];
		}
		System.out.println("Linear least: " + n);
		System.out.println("Linear last: " + m);
	}
}