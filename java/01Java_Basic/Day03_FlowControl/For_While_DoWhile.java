public class For_While_DoWhile {
    public static void main(String[] args) {
        //for
		for (int i = 1; i <= 100; i++) {
			System.out.println("I was wrong, and forgive me " + i);
		}
		System.out.println("Programme is terminated!");

        //for_practise 
        for (int i = 1; i <= 10; i++) {
			System.out.println("I was wrong！" + i);
		}
		System.out.println("=================");
		
		int a = 1;
		while (a<= 10) { 
			System.out.println("I was wrong! " + a); 
			a++; 
		}

        //for VS do_while
        for (int i= 1; i<= 10; i++) {
			System.out.println("Forgive you and it is cold on the ground" + i);
		}
		System.out.println("===============");
		
		int b= 1; 
		do {
			System.out.println("Forgive you and it is cold on the ground！" + b); 
			b++; 
		} while (b<= 10);
        System.out.println(b); 

        //Practise
        int sum = 0; 
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("The result is " + sum);
	}
}
