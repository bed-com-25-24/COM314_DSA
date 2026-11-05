public class TimeMeasure{

 
 public static int fib(int n) {
    if (n <= 1) {
        return n;
    }

    int a = 0;
    int b = 1;

    for (int i = 2; i <= n; i++) {
        int next = a + b;
        a = b;
        b = next;
    }

    return b;
}

public static void main(String args[]){
 
    long t0 = System.currentTimeMillis();  
    long res = fib(45);
    long timeElapsed = (System.currentTimeMillis() - t0);  
    System.out.printf("fib(45) = %d\n\nTime = %d\n", res, timeElapsed);
    }
}