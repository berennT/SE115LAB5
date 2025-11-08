import java.util.Scanner;
public class Main {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }

    public static int sumdigit(int m) {
        if (m < 10) {
            return m;
        } else {
            return (m % 10 + sumdigit(m / 10));
        }
    }

    public static int pow(int base, int power) {
        if (power == 0) {
            return 1;
        } else {
            return (base * pow(base, power - 1));
        }
    }

    public static int fibonacci(int x) {
        if (x == 1) {
            return 0;
        } else if (x == 2) {
            return 1;
        } else {
            return (fibonacci(x - 1) + fibonacci(x - 2));
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number for the factorial function");
        int n = sc.nextInt();
        System.out.println("result is: " + factorial(n));
        System.out.println("Please enter a number to calculate the sum of it's digits");
        int m = sc.nextInt();
        System.out.println("result is: " + sumdigit(m));
        System.out.println("Please enter the base");
        int base = sc.nextInt();
        System.out.println("Please enter the power");
        int power = sc.nextInt();
        System.out.println("result is: " + pow(base, power));
        System.out.println("Please enter the number of fibonacci numbers you want to see");
        int x = sc.nextInt();
        int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            arr[i] = fibonacci(i + 1);
            System.out.println(arr[i]);
        }

    }
}

