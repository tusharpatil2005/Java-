package Array;

public class subarray {
public static void subarray(int num[]){
        int ts=0;
        for(int i=0; i<num.length; i++){
            int start = i;
            for(int j=0; j<num.length; j++){
                int end =j;
                for(int k=start; k<end; k++){
                System.out.print(" "+num[k]);
            }
            ts++;
            System.out.println();
            
            }
        }
        System.out.println("total sub array: "+ts);
    }
    public static void main(String[] args) {
        int num[] = {2,4,5,6,7};
        subarray(num);
    }
}

// output
//  2
//  2 4
//  2 4 5
//  2 4 5 6
//  2 4 5 6 7
//  4
//  4 5
//  4 5 6
//  4 5 6 7
//  5
//  5 6
//  5 6 7
//  6
//  6 7
//  7
// total sub array: 15
/* Algorithm (Subarray)
      1. Start
      2. Take an array of numbers
      3. Traverse the array using two nested loops to generate all possible subarrays
      4. Print each subarray and count the total number of subarrays
      5. Stop
   */

   

