package Pattern_Problems;

public class pattern06 {
        public static void pattern(int n){
        
        // part 01
        for(int i = 1; i<=n; i++){
            //star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        //part 02
        
        for(int i = n; i>=1; i--){
            //star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
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
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *

 */