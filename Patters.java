//Solid Rectangle

// Expected Output:

// * * * * *
// * * * * *
// * * * * *
// * * * * *

class Solid_Rectangle{
    public static void main(String args[]){
        String symbol = "*";
        for(int row = 1; row <= 4; row++){
            for(int col = 1; col <= 5; col++){
                System.out.print(symbol+" ");
            }
            System.out.println();
        }
    }
}

//Hollow Rectangle

// Expected Output:

// * * * * *
// *       *
// *       *
// * * * * *

// Not Clear !!!!!!!!!

class Hollow_Rectangle{
    public static void main(String args[]){
        int n = 4;
        int m = 5;

        // outer loop
        for(int row = 1; row <= n; row++){
            // inner loop
            for(int col =1; col <= m; col++){
                if(row==1 || row==n || col==1 || col==n){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}