import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int temp = n;
        int rev = 0;

        while(temp!=0){
            int ld = temp%10;
            rev = rev*10 + ld;
            temp = temp/10;
        }

        if(rev==n){
            System.out.println(n + " is a Palindrome number");
        } else {
            System.out.println(n + " is not a Palindrome number");
        }
    }
}


// Time Complexity = Theta(d) d = number of digits