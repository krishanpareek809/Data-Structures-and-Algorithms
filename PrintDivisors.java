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

// Time Complexity = Theta(n)
// Auxiliary Space = Theta(1)