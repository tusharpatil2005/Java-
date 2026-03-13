package Array;

public class Binary_Search {
   public static int binarySearch(int num[], int key){
    int start = 0;
    int end = num.length - 1;
        
    while(start <= end){
        int mid = (start + end) / 2;

        if(num[mid] == key){
            return mid;
        }

        if(num[mid] < key){
            start = mid + 1;// ✅ move right
        } else {
            end = mid - 1;   // ✅ move left
        }
    }
    return -1;
}

public static void main(String[] args) {
    int num[] = {10,25,35,45,56,78,89,90};
    int key = 56;

    int result = binarySearch(num, key);

    if(result == -1){
        System.out.print("Not exist");
    }else{
        System.out.print("key is at index : " + result);
    }
}
}

// output
// key is at index : 4

// Binary Search Algorithm
// 1. Set start = 0, end = n-1
// 2. Find mid = (start + end) / 2
// 3. If arr[mid] == key → return mid
// 4. If arr[mid] < key → start = mid + 1
// 5. If arr[mid] > key → end = mid - 1
// 6. Repeat until start <= end
// 7. If not found → return -1