public class OperationsOnArrays{

    // Search
    /*
    static int search(int x, int ...arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(x==arr[i]){
                return i;
            }
        }
        return -1;
    }
    */


    // Insert
    // static int insert(int x, int position){
    //     int arr[] = new int[5];
    //     arr[0] = 2;
    //     arr[1] = 5;
    //     arr[2] = 7;
    //     arr[3] = 3;

    //     int n = arr.length;
    //     int index = position - 1;
    //     // for(int i=n-1; i>=index; i--){
    //     //     arr[i+1] = arr[i];
    //     // }

    //     arr[index] = x;
    //     return n+1;
    // }


    // Delete
    static int delete(int x){
        int arr[] = {3,8,12,5,6};
        int i;
        int n=arr.length;

        for(i=0; i<n; i++){
            if(arr[i]==x) break;
        }

        for(int j=i; j<n-1; j++){
            arr[j] = arr[j+1];
        }

        return n-1;
    }


    public static void main(String[] args) {
        // System.out.println(search(2,9,7,8,2,4,1,2,5));    // Search
        // System.out.println(insert(4,5));    // Insert
        System.out.println(delete(12));      // Delete
    }
}

// Time Complexity
// Insert = O(n)
// Search = O(n) for unsorted, O(log n) for sorted
// Delete = O(n)