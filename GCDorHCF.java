public class GCDorHCF {
    
    static int gcd(int a, int b){
        int res = Math.min(a, b);
        while(res>0){
            if(a%res==0 && b%res==0){
                break;
            }
            res--;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(gcd(7,13)); 
    }
}


// Time complexity = O(min(a,b))