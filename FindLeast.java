class FindLeast <K extends Comparable> {
	//private K [] array;
	FindLeast(K [] array) {
		//this.array = array;
		findLeast(array);//(this.array);
		K n = array[0];
		for (int i = 1; i < array.length; i++)
			if (n.compareTo(array[i]) > 0) n = array[i];
		System.out.println(n);

	}
	K findLeast(K [] array) {
		return null;
	}
}