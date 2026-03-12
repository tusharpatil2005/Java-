package Pattern_Problems;

public class pattern03 {
        public static void pattern(int n){
        //line 
        for(int i=1; i<=n; i++){
            for(int j=1; j<=5-i+1; j++){
                System.out.print(j);
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
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1

 */