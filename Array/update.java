package Array;

public class update {

     // update method to update the marks by adding 1 to each mark
    public static void update(int mark[]){
        for(int i=0; i<mark.length; i++){
            mark[i] = mark[i] + 1;
            
        }
    }
    public static void main(String[] args) {
        int mark[] = {95,96,78};
        
        update(mark);
        for(int i=0; i<mark.length; i++){
           System.out.print("marks: "+ mark[i]);
        }
        System.out.println();
    }
}


// output
// marks: 96marks: 97marks: 79
/* Algorithm (Update Array)
      1. Start
      2. Take an array of marks
      3. Traverse the array and update each mark by adding 1
      4. Print the updated marks
      5. Stop
   */

      //tushar