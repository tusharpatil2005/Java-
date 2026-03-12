package Pattern_Problems;

public class pattern02 {
    public static void pattern(int n){
        //line 
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=4-i; j++){
                System.out.print(" ");
            }
            //star
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(4);
    }


}

/* 
   *
  **
 ***
****

 */