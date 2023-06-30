public class LCM {
    static int lcm(int a, int b){
        int res = Math.max(a, b);
        while(true){
            if(res%a==0 && res%b==0){
                return res;
            }
            res++;
        }
    }

    public static void main(String[] args) {
        System.out.println(lcm(4,6));
    }
}

// Time Complexity = O(a*b - max(a,b))