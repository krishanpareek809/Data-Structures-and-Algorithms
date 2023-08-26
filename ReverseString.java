public class ReverseString {
    public static void main(String[] args) {

    // using normal string and loop
        // String kp = "Krishan";
        // String ans = "";
        // char ch;
    
        // for(int i=0; i<kp.length(); i++){
        //     ch = kp.charAt(i);
        //     ans = ch + ans;
        // }

        // System.out.println(ans);



    // using normal array of characters and loop
        // char[] kp = {'K', 'r', 'i', 's', 'h', 'a', 'n'};

        // int l = kp.length;
        // int a = Math.floorDiv(l, 2);
        // char temp;

        // for(int i=0; i<a; i++){
        //     temp = kp[i];
        //     kp[i] = kp[l-i-1];
        //     kp[l-i-1] = temp; 
        // }
        // System.out.println(kp);



    // using StringBuilder class
        StringBuilder sb = new StringBuilder("Krishan");

        int l = sb.length();
        int a = Math.floorDiv(l, 2);

        for(int i=0; i<a; i++){
            int front = i;
            int back = l-i-1;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
