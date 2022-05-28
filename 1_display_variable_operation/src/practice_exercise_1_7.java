public class practice_exercise_1_7 {
	public static void main(String[] args) {
		int x = 3;
		int y = 7;
		int z ;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		z = x;
		x = y;
		y = z;
		
		System.out.println("x="+x+", y="+y);
		
	}
}
