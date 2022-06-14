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
                System.out.print(symbol);
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

class Hollow_Rectangle{
    public static void main(String args[]){

    }
}