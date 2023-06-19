import java.util.Scanner;

class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        int res = 0;
        while (x > 0) {
            x = x / 10;
            res++;
        }
        System.out.println("Total no. of digits in x is: " + res);
    }
}

// Time Complexity = Theta(d) d = number of digits