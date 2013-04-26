import java.util.ArrayList;
class FindLeast <K extends Comparable> {
	//private K [] array;
	final static int MAX_ARRAY_LENGTH = 100;
	FindLeast(ArrayList<K> array) {
		//this.array = array;
		findLeast(array);//(this.array);
		K n = array.get(0);
		for (int i = 1; i < array.size(); i++)
			if (n.compareTo(array.get(i)) > 0) n = array.get(i);
		System.out.println("Linear least: " + n);

	}
	private K findLeast(ArrayList<K> array) {
		ArrayList arrayPart1;
		ArrayList arrayPart2;
		int newLength;
		if (array.size() > MAX_ARRAY_LENGTH) {
			newLength = array.size()/2;

			arrayPart1 = fillArray(array, newLength, 0, false);
			// the length of this array is set the old length - the new length
			// to get all numbers if the length of the old array were uneven.
			arrayPart2 = fillArray(array, newLength, 16777215, false);
			//arrayPart2 = fillArray(array, array.size() - newLength, newLength);
			System.out.println("First array: " + arrayPart1.size());
			System.out.println("Second array: " + arrayPart2.size());

		}
		return null;
	}
	private ArrayList<K> fillArray(ArrayList<K> oldArray, int length, int start, boolean print) {
		System.out.println("The old array's size: " + oldArray.size());
		System.out.println("Point to start: " + start);
		ArrayList<K> newArray = new ArrayList<K>(length);
		System.out.println("The new array's size: " + newArray.size());
		for (int i = start; i < length; i++) {
			newArray.add(i, oldArray.get(start + i));
			if (print) {
				System.out.println(oldArray.get(start + i));
			}
		}
		System.out.println("The new array's size: " + newArray.size());
		return newArray;
	}
}