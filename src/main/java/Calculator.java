public class Calculator {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        Integer res1 = c.add(5, 3);
        System.out.println(res1);
        Integer res2 = c.minus(6, 1);
        System.out.println(res2);
        Integer res3 = c.multiply(6, 2);
        System.out.println(res3);
        Integer res4 = c.divide(6, 3);
        System.out.println(res4);
    }

    public int add(Integer a, Integer b){
        return a + b;
    }

    public int minus(Integer a, Integer b){
        return a - b;
    }

    public int multiply(Integer a, Integer b){
        return a * b;
    }

    public int divide(Integer a, Integer b){
        if (b == 0){
            System.out.println("divisor can not be 0");
            return 0;
        }else{
            return a / b;
        }

    }
}
