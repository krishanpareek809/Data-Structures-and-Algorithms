public class trailingZeroesInFactorial{

    // Naive Method        // Time Complexity = Theta(n)
    /*
    static int fact(int n){
        int fact = 1;
        for(int i=2;i<=n;i++){
            fact *= i;
        }

        int res = 0;
        while(fact%10==0){
            res++;
            fact = fact/10;
        }

        return res;
    }
    public static void main(String[] args) {
        System.out.println(fact(12));
    }
    */

    // Efficient Method    // Time Complexity = Theta(log n)        
    static int countTrailingZeroes(int n){
        int res = 0;
        for(int i=5;i<=n;i=i*5){
            res=res+(n/i);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(countTrailingZeroes(100));
    }
}