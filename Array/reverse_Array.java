package Array;

public class reverse_Array {
     public static void reverseArray(int num[]){
        int start = 0;
        int end = num.length-1;
        
        while(start <= end){
            int temp = num[end];
            num[end] = num[start];
            num[start] = temp;
            
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        int num[] = {10,25,35,45};
        reverseArray(num);
        for(int i=0; i<num.length; i++){
            
            System.out.print(num[i]+" ");
        }
        
        
    }
}

// output
// 45 35 25 10

/* Algorithm (Reverse Array - Short & Easy)
      1. Start
      2. Take array
      3. Set start = 0, end = n-1
      4. While start <= end
         a. Swap arr[start] and arr[end]
         b. Increment start, Decrement end
      5. Stop
   */