package Array;

public class linear_search {
   public static int linear_search(int num[], int key){
        for(int i = 0; i < num.length; i++){
            if(num[i] == key){
                return i;
            }
        }
        return -1;  // ✅ after loop
    }

    public static void main(String[] args) {
        int num[] = {10,20,85,69,78,45,79};
        int key = 78;

        int index = linear_search(num, key);

        if(index == -1){
            System.out.println("not found");
        } else {
            System.out.println("key is at index : " + index);
        }
    }
}


// output
// key is at index : 4


/* Algorithm (Linear Search - Short & Easy)
      1. Start
      2. Take array and key
      3. Traverse array from index 0 to n-1
      4. If array[i] == key → return index
      5. If loop ends → return -1
      6. Stop
   */