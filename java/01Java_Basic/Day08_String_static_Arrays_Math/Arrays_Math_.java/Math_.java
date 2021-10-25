public class Math_ {
    public static void main(String[] args) {
        // get absolute value
        System.out.println(Math.abs(3.14)); // 3.14
        System.out.println(Math.abs(0)); // 0
        System.out.println(Math.abs(-2.5)); // 2.5
        System.out.println("================");

        // get ceil value
        System.out.println(Math.ceil(3.9)); // 4.0
        System.out.println(Math.ceil(3.1)); // 4.0
        System.out.println(Math.ceil(3.0)); // 3.0
        System.out.println("================");

        // get floor value
        System.out.println(Math.floor(30.1)); // 30.0
        System.out.println(Math.floor(30.9)); // 30.0
        System.out.println(Math.floor(31.0)); // 31.0
        System.out.println("================");

        //get the most approachable value
        System.out.println(Math.round(20.4)); // 20
        System.out.println(Math.round(10.5)); // 11

        //practise---print number of the absolute value who is more than 6 or less than 2.1  between -10.8 and 5.9
        int count = 0; 

        double min = -10.8;
        double max = 5.9;
        
        for (int i = (int) min; i < max; i++) {
            int abs = Math.abs(i); // absolute
            if (abs > 6 || abs < 2.1) {
                System.out.println(i);
                count++;
            }
        }

        System.out.println("总共有：" + count); // 9 
    }
}
