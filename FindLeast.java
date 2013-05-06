import java.util.concurrent.CountDownLatch;
class FindLeast{
	final static int MAX_ARRAY_LENGTH = 100000000;
	FindLeast(int [] array) {
		System.out.println("Recursive least: " + findLeast(array));
	}
	private int findLeast(int [] array) {
		int [] arrayPart1;
		int [] arrayPart2;
		int newLength;
		int leastInFirstArray;
		int leastInSecondArray;
		int leastNumber = -1;
		
		if (array.length > MAX_ARRAY_LENGTH) {
			newLength = array.length / 2;
			arrayPart1 = fillArray(array, newLength, 0);
			arrayPart2 = fillArray(array, array.length - newLength, newLength);
			//leastInSecondArray = findLeast(arrayPart2);
			CountDownLatch b = new CountDownLatch(2);
			FindLeastService fls2 = new FindLeastService(arrayPart2, b);
			FindLeastService fls1 = new FindLeastService(arrayPart1, b);
			new Thread(fls2).start();
			new Thread(fls1).start();
			try {
				b.await();
			} catch (InterruptedException e) {
				System.exit(2);
			}
			//System.out.println(fls1.getLeastNumber());
			//System.out.println(fls2.getLeastNumber());
			leastInSecondArray = fls2.getLeastNumber();
			leastInFirstArray = fls1.getLeastNumber();
			if (leastInSecondArray <= leastInFirstArray) 
				return leastInSecondArray;
			if (leastInFirstArray < leastInSecondArray) 
				return leastInFirstArray;
		}
		if (array.length <= MAX_ARRAY_LENGTH) {
			int n = array[0];
			for (int i = 0; i < array.length; i++) {
				if (n > array[i]) n = array[i];
			}
			return n;
		}
		return -1;
	}
	public void run() {}

	private int [] fillArray(int [] oldArray, int length, int start) {
		//System.out.println("The old array's size: " + oldArray.length);
		//System.out.println("Point to start: " + start);
		int [] newArray = new int[length];
		for (int i = 0; i < length; i++)
			newArray[i] = oldArray[start + i];
		//for (int i = start; i < length; i++)
		//System.out.println("The new array's size: " + newArray.length);
		return newArray;
	}
	private class FindLeastService implements Runnable {
		int [] array;
		int leastNumber;
		CountDownLatch latch;
		FindLeastService(int [] array, CountDownLatch latch) {
			this.array = array;
			this.latch = latch;
		}
		public void run() {
			leastNumber = findLeast(array);
			latch.countDown();
		}
		int getLeastNumber() {
			return leastNumber;
		}
	}
}