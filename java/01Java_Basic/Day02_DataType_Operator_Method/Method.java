/**
 * 
 * @author zhangwenqing
 *
 */
public class Method {
	public static void main(String[] args) {
		farmer(); //invoke method of farmer
		seller(); //invoke method of seller
		cook(); // invoke method of cook
		me(); //invoke method of me
	}
	
	//cook
	public static void cook( ) { 
		System.out.println("wash veg");
		System.out.println("cut veg");
		System.out.println("cook veg");
		System.out.println("decorate veg");
	}
	
	// me
	public static void me() {
		System.out.println("eat");
	}
	
	// seller
	public static void seller() {
		System.out.println("tranmit to market");
		System.out.println("increase the price");
		System.out.println("anounce");
		System.out.println("sell to cook");
	}
	
	// farmer
	public static void farmer() {
		System.out.println("sow");
		System.out.println("water");
		System.out.println("fertilizer");
		System.out.println("disinsection");
		System.out.println("reap");
		System.out.println("sell");
	}

}
