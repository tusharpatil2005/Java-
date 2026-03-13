package Array;

public class PairofArray {
    public static void PairofArray(int num[]){
        for(int i = 0; i < num.length; i++){
            int current = num[i];
            for(int j = i + 1; j < num.length; j++){
                System.out.print("(" + current + "," + num[j] + ") ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int num[] = {10,25,35,45};
        PairofArray(num);
    }
}

// output
// (10,25) (10,35) (10,45)  
// (25,35) (25,45)  
// (35,45)

/* Algorithm (Pair of Array - Short & Easy)
      1. Start
      2. Take array
      3. Traverse array from index 0 to n-1
         a. For each element, traverse the remaining elements to form pairs
         b. Print the pairs
      4. Stop
   */