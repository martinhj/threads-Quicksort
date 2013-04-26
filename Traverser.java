import java.lang.Comparable;
class Traverser<K extends Comparable> implements Runnable{
	/** 
	 * Constructor for a runnable that will devide the array until the number
	 * of objects in the array is below 100. If it is, find the least of these
	 * numbers and return it.
	 */
	Traverser() {

	}
	/**
	 * Method that devides an array in two and calls itself with the two new 
	 * arrays as arguments and continues this until the length of the array is
	 * below 100. Then it will find the least of these and return it.
	 */
	public K run() {
		return null;
	}
}