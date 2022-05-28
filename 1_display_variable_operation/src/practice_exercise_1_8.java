public class practice_exercise_1_8 {
	public static void main(String[] args) {
		int x = 2;
		System.out.println("x初期値="+x);
		
		for(int i = 0; i<3; i++) {
			if(i == 0) {
				x = x * 2;
				System.out.println("xの2倍⁼"+x);
			}else if(i == 1) {
				x = x *3;
				System.out.println("xの3倍="+x);
			}else {
				x = x *4;
				System.out.println("xの4倍="+x);
			}
		}
	}

}
 