public class NaturalSumRecursion {

    static void sum(int n, int sum){
        if(n<1){
            System.out.println(sum);
            return;
        }
        
        sum(n-1,sum+n);
    }

    public static void main(String[] args) {
        sum(4,0);
    }
}