package lab2;

public class Fibonacci {
    public static int getFibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return getFibonacci(n - 2) + getFibonacci(n - 1);
    }
    public static void main(String args[]) {
        int n = 10;
        
        for (int i = 0; i < n; i++) {
            System.out.print(getFibonacci(i) + " ");
        }
    }
}