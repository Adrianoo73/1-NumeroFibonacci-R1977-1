public class Fibonacci {
    public static void main(String[] args) {
        int n = 55; // AQUI PUEDE CAMBIAR EL VALOR QUE QUIERE CALCULAR
        int result = fibonacciIterativo(n);
        System.out.println("El " + n + "numero de Fibonacci es: " + result);
    }

    public static int fibonacciIterativo(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}