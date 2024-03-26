public class FibonacciFast {
    
    /* By using memoisation this makes the fibonacci finding much faster as previous values aren't thrown out 
        use a cache to store last fibonacci values
    */
    private static long[] fibonacciCache;
    public static void main(String[] args) {
        int n = 50;

        fibonacciCache = new long[n + 1];

        System.out.println(fibonaccifast(n));
    }

    public static long fibonaccifast(int n){
        if (n <= 1)
            return n;
        
        if (fibonacciCache[n] != 0)
            return fibonacciCache[n];
            
        long nthFibonacciNumber = fibonaccifast(n - 1) + fibonaccifast(n - 2);

        fibonacciCache[n] = nthFibonacciNumber;

        return nthFibonacciNumber;
    }
}
