/*
public class PrintDivisors {
    
    static void printDivisors(int n){
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        printDivisors(25);
    }
}
*/

// Time Complexity = Theta(n)
// Auxiliary Space = Theta(1)


// Efficient Method 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrintDivisors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n to print it's all divisors: ");
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                list.add(i);
                if(n/i!=i){
                    list.add(n/i);
                }
            }
        }
        Collections.sort(list);
        for(int element: list){
            System.out.print(element+" ");
        }
    }
}

// Time Complexity = O(sqrt(n))