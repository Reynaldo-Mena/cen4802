public class Main {

    public static void main(String[] args) {
        int n = 10;
        int result = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }

    /**
     * Gets the nth number in the fibonacci sequence using recursive method.
     *
     * @param n position in the fibonacci sequence
     * @return the nth fibonacci number
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
