import java.util.ArrayList;
class FindLeast <K extends Comparable> {
	//private K [] array;
	final static int MAX_ARRAY_LENGTH = 100;
	FindLeast(ArrayList<K> array) {
		//this.array = array;
		findLeast(array);//(this.array);
		K n = array.get(0);
		K m = array.get(0);
		for (int i = 1; i < array.size(); i++) {
			if (n.compareTo(array.get(i)) > 0) n = array.get(i);
			if (m.compareTo(array.get(i)) < 0) m = array.get(i);
		}
		System.out.println("Linear least: " + n);
		System.out.println("Linear last: " + m);

	}
	private K findLeast(ArrayList<K> array) {
		ArrayList arrayPart1;
		ArrayList arrayPart2;
		int newLength;
		if (array.size() > MAX_ARRAY_LENGTH) {
			newLength = array.size()/2;

			arrayPart1 = fillArray(array, newLength, 0);
			// the length of this array is set the old length - the new length
			// to get all numbers if the length of the old array were uneven.
			System.out.println(array.size() - newLength);
			arrayPart2 
			= fillArray(array, array.size() - newLength, newLength);
			//arrayPart2 = fillArray(array, array.size() - newLength, newLength);
			System.out.println("First array: " + arrayPart1.size());
			System.out.println("Second array: " + arrayPart2.size());

		}
		return null;
	}
	private ArrayList<K> fillArray(ArrayList<K> oldArray, int length, int start) {
		System.out.println("The old array's size: " + oldArray.size());
		System.out.println("Point to start: " + start);
		ArrayList<K> newArray = new ArrayList<K>(length);
		System.out.println("The new array's size: " + newArray.size());
		for (int i = 0; i < length; i++) {
			newArray.add(0, oldArray.get(start + i));
		}
		System.out.println("The new array's size: " + newArray.size());
		return newArray;
	}
}