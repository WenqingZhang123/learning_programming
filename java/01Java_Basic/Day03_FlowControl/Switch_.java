public class Switch_ {
    public static void main(String[] args) {
        //Switch
		int num = 10;
		
		switch (num) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Tuesday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Data is error");
				break; 
        }


        //Practice
        int numb = 2;
		switch (numb ){
			case 1:
				System.out.println("Hello to you");
				break;
			case 2:
				System.out.println("Hello to me");
				// break;
			case 3:
				System.out.println("Hello to everybody");
				break;
			default:
				System.out.println("If say hello to him, say hello to me");
				break;
        }
	}
}
