//Solid Rectangle

// Expected Output:

// *****
// *****
// *****
// *****

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

// *****
// *   *
// *   *
// *****

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


//Half Pyramid

// Expected Output:

// * 
// **
// ***
// ****


class Half_Pyramid{
    public static void main(String args[]){
        int n = 4;
        
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }

        // or

        // int tmp = 1;
        // for(int row = 1; row <= n; row++){
        //     System.out.println("*".repeat(tmp));
        //     tmp++;
        // }
    }
}


//Inverted Half Pyramid

// Expected Output:

// ****
// ***
// **
// * 

class Inverted_Half_Pyramid{
    public static void main(String args[]){
        int n = 4;
        
        for(int row = 1; row <= n; row++){
            for(int col = n; col >= row; col--){
                System.out.print("*");
            }
            System.out.println();
        }

        // or

        // for(int row = n; row >= 1; row--){
        //     for(int col=1; col<=row; col++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // or

        // int tmp=n;
        // for(int row = 1; row <= n; row++){
        //     System.out.println("*".repeat(tmp));
        //     tmp--;
        // }
    }
}


//Inverted Half Pyramid

// Expected Output:

//    *
//   **
//  ***
// ****

class Inverted_Half_Pyramid_rotateby380deg{
    public static void main(String args[]){
        int n = 4;
        
        // outer loop
        for(int i = 1; i <= n; i++){
            // inner loop - space print
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            // inner loop - star print
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // or

        // int tmp = n;
        // for(int row = 1; row <= n; row++){
        //     for(int col=1; col <= n; col++){
        //         if(col>=tmp){
        //             System.out.print("*");
        //         } else{
        //             System.out.print(" ");
        //         }
        //     }
        //     tmp--;
        //     System.out.println();
        // }
    }
}