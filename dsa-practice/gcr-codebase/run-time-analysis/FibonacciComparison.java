public class FibonacciComparison {

    static int fibonacciRecursive(int n){
        if(n <= 1){
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    static int fibonacciIterative(int n){
        if(n <= 1){
            return n;
        }

        int a = 0;
        int b = 1;
        int sum = 0;

        for(int i = 2;i<=n;i++){
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args){

        int n = 30;

        long startRecursive = System.nanoTime();
        fibonacciRecursive(n);
        long endRecursive = System.nanoTime();

        System.out.println("Recursive Time (ns): " + (endRecursive - startRecursive));

        long startIterative = System.nanoTime();
        fibonacciIterative(n);
        long endIterative = System.nanoTime();

        System.out.println("Iterative Time (ns): " + (endIterative - startIterative));
    }
}
