package Array;

public class Largest_number {

    public static int largestnumber(int num[], int largest){
        for(int i=0; i<num.length; i++){
            if(num[i]>largest){
                largest = num[i];
            }
        }
        return largest;
    }
    public static int smallestnumber(int num[], int smallest){
        for(int i=0; i<num.length; i++){
            if(num[i]<smallest){
                smallest = num[i];
            }
        }
        return smallest;
    }
    
    public static void main(String[] args) {
        int num[] = {14,25,63,98,45,63,98,41,49,86};
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int result = largestnumber(num,largest);
        int resultsmall = smallestnumber(num,smallest);
        System.out.println("largest no is : " +result);
        System.out.println("smallest no is : " +resultsmall);
    }
}



// output
// largest no is : 98   
// smallest no is : 14

/* Algorithm (Largest Number - Short & Easy)
      1. Start
      2. Take array and largest
      3. Traverse array from index 0 to n-1
      4. If array[i] > largest → largest = array[i]
      5. If loop ends → return largest
      6. Stop
   */

/* Algorithm (Smallest Number - Short & Easy)
      1. Start
      2. Take array and smallest
      3. Traverse array from index 0 to n-1
      4. If array[i] < smallest → smallest = array[i]
      5. If loop ends → return smallest
      6. Stop
   */
