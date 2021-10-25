public class Break_Continue_DeadLoop {
    public static void main(String[] args) {
        //Break
		for (int i = 1; i <= 10; i++) {
			// It will interrupt loop after 3 times 
			if (i == 4) {
				break; 
			}
			System.out.println("Hello" + i);
		}

        //Continue
        for (int i = 1; i <= 10; i++) {
			if (i == 4) { 
				continue; // Skip the loop of this time and begin to the next
			}
			System.out.println(i + " floor is reached!");
		}

        //DeadLoop
        /* while (true) {
			System.out.println("I Love Java!");
		}
		
		System.out.println("Hello"); */

        //Mutiple loop
        for (int hour = 0; hour < 24; hour++) { // The outside loop controls the hours

			for (int minute = 0; minute < 60; minute++) { // The inner loop controls the minutes
				System.out.println(hour + "点" + minute + "分");
			}

		}
	}
}
