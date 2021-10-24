/**
 * 
 * @author zhangwenqing
 *
 */
public class Notice {
	public static void main(String[] args) {
	//constant optimization
		short a = 5;
		short b = 8;
		// short + short --> int + int --> int
		// short result = a + b; // 错误写法！左侧需要是int类型
		
		short result = 5 + 8;
		System.out.println(result);
		
		short result2 = (short)(5 + a + 8); // 18
	}

}
