// Naive Method

/*
public class Prime {
    
    static boolean isPrime(int n){
        if(n==1) return false;
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(4));
    }
}
*/

// Time Complexity => Worst Case = O(n) => If n is prime
//                    Best Case = Theta(1) => constant time



// Efficient Method

public class Prime{
    static boolean isPrime(int n){
        if(n==1) return false;
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(37));
    }
}

// Time Complexity = O(√n)