import java.util.ArrayList;
class Main {
	final int DEVIDE_BY = 64 * 128;
	// Array to be sorted.
	//Integer tall [] = new Integer [Integer.MAX_VALUE / DEVIDE_BY];
	ArrayList theNumbers = new ArrayList<Integer>(Integer.MAX_VALUE / DEVIDE_BY);
	long time;
	public Main() {
		initialSetup();
		new FindLeast<Integer>(theNumbers);
	}
	public static void main (String [] args) {
		new Main();
	}
	void initialSetup() {
		// Fill array with all sorts of numbers.
		System.out.print("Number of places in the array to be sorted: ");
		System.out.println(Integer.MAX_VALUE / DEVIDE_BY);
		System.out.println("The current time in milliseconds before we start"
			+ " to fill the array: ");
		System.out.println(time = System.currentTimeMillis());
		for (int i = 0; i < Integer.MAX_VALUE / DEVIDE_BY; i++)
			theNumbers.add(
				new Integer((int) (Math.random() * Integer.MAX_VALUE)));
		System.out.println("Milliseconds after we have filled the array");
		System.out.println(System.currentTimeMillis() - time);
		System.out.println("The arrays size: " + theNumbers.size());
		System.out.println("Finished filling the array, let's move on.");

	}
}