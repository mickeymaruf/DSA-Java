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


//Half Pyramid with Numbers

// Expected Output:

// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

class Half_Pyramid_with_Numbers {
    public static void main(String args[]){
        int n = 5;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

//Inverted Half Pyramid with Numbers

// Expected Output:

// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1

class Inverted_Half_Pyramid_with_Numbers {
    public static void main(String args[]){
        int n = 5;

        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= n-i+1; j++){
                System.out.print(j+" ");
            }
            // for(int j = 1; j <= i; j++){
            //     System.out.print(j+" ");
            // }
            System.out.println();
        }
    }
}


//Floyd's Triangle

// Expected Output:

// 1
// 2  3
// 4  5  6
// 7  8  9  10
// 11 12 13 14 15

class Floyds_Triangle {
    public static void main(String args[]){
        int n = 5;
        int tmp = 1;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(tmp+" ");
                tmp++;
            }
            System.out.println();
        }
    }
}


//0-1 Triangle

// Expected Output:

// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

class ZeroOne_Triangle {
    public static void main(String args[]){
        int n = 5;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                int sum = i + j;
                if(sum % 2 == 0){ //even
                    System.out.print(1+" ");
                }else{ //odd
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}