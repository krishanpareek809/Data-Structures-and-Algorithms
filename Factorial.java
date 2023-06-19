import java.util.Scanner;

public class Factorial {

    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }

    static int factorial_iterative(int n){
        if (n==0 || n==1){
            return 1;
        }
        else{
            int product = 1;
            for (int i=1; i<=n; i++){
                product *= i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        x = sc.nextInt();
        System.out.println("Factorial of x is: " + factorial(x));
        System.out.println("Factorial of x is: " + factorial_iterative(x));
    }
}
