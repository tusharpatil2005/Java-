package Pattern_Problems;

public class pattern04 {
    public static void pattern(int n){
        
        int counter = 1;
        //line 
        for(int i=1; i<=n; i++){
            //counter
            for(int j=1; j<=i; j++){
                System.out.print(counter);
                System.out.print(" ");
                counter++;
            }
            //space
            for(int k=1; k<=n-i+1; k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        pattern(5);
    }

}

/* 

1      
2 3     
4 5 6    
7 8 9 10   
11 12 13 14 15  

 */