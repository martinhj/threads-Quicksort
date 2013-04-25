class Main {
	public static void main (String [] args) {
		final int DEVIDE_BY = 16;
		int tall [] = new int [Integer.MAX_VALUE / DEVIDE_BY];
		System.out.println(Integer.MAX_VALUE / DEVIDE_BY);
		System.out.println(System.currentTimeMillis());
		for (int i = 0; i < Integer.MAX_VALUE / DEVIDE_BY; i++)
			tall[i] = i;
		System.out.println(System.currentTimeMillis());
		for (int i = 0; i < Integer.MAX_VALUE / DEVIDE_BY; i++)
			tall[i] = (int) (Math.random() * Integer.MAX_VALUE);

		System.out.println(System.currentTimeMillis());
	}
}