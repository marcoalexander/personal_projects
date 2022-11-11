public class playground{
	public static int x = 1;
	public static int y = 2;
	public static void main(String[] args) {
		

		now();
		System.out.println(x);
	}

	public static void times(){
		x = x * y;
	}

	public static void then(){
		x = 2;
		times();
	}

	public static void now(){
		y = 3;
		then();
	}
}