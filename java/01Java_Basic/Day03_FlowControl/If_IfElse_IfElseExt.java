public class If_IfElse_IfElseExt {
	public static void main(String[] args) {
        //if
		System.out.println("Nice weather, walk in path, find a club");
		int age = 19;
		if (age >= 18) {
			System.out.println("Get into bar, begin to be high！");
			System.out.println("Have bad guys, ready to fight");
			System.out.println("Win and leave");
		}
		System.out.println("Go home for dinner");

        //if_else
        int num = 666;
		
		if (num % 2 == 0) { 
			System.out.println("even");
		} else {
			System.out.println("odd");
		}

        //if_else_ext
        int x = -10;
		int y;
		if (x >= 3) {
			y = 2 * x + 1;
		} else if (-1 < x && x < 3) {
			y = 2 * x;
		} else {
			y = 2 * x - 1;
		}
		System.out.println("The result is " + y);

        //practise
        int score = 120;
		if (score >= 90 && score <= 100) {
			System.out.println("Brilliant");
		} else if (score >= 80 && score < 90) {
			System.out.println("Merit");
		} else if (score >= 70 && score < 80) {
			System.out.println("Good");
		} else if (score >= 60 && score < 70) {
			System.out.println("Pass");
		} else if (score >= 0 && score < 60) {
			System.out.println("Fail");
		} else { // deal with unreasonable situation
			System.out.println("Data is error");
		}

        //Max
        int a = 105;
		int b = 20;
		
		
		// int max = a > b ? a : b;
		
		// use if
		int max;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		
		System.out.println("Max is " + max);
	}
}