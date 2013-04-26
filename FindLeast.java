class FindLeast <K extends Comparable> {
	//private K [] array;
	final static int MAX_ARRAY_LENGTH = 100;
	FindLeast(K [] array) {
		//this.array = array;
		findLeast(array);//(this.array);
		K n = array[0];
		for (int i = 1; i < array.length; i++)
			if (n.compareTo(array[i]) > 0) n = array[i];
		System.out.println(n);

	}
	private K findLeast(K [] array) {
		K [] arrayPart1;
		K [] arrayPart2;
		int newLength;
		if (array.length > MAX_ARRAY_LENGTH) {
			newLength = array.length/2;

			arrayPart1 = fillArray(array, newLength, 0);
			// the length of this array is set the old length - the new length
			// to get all numbers if the length of the old array were uneven.
			arrayPart2 = fillArray(array, array.length - newLength, newLength);

		}
		return null;
	}
	private K[] fillArray(K [] oldArray, int length, int start) {
		Object [] newArray = new Object [length];
		for (int i = start; i < length; i++)
			newArray[i] = oldArray[start + i];
		return (K []) newArray;

	}
}