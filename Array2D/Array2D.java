public class Array2D{

    // Displaying a 2D Array - row-wise traversal
    public static void display(int arr[][]){
        int num_rows = arr.length;
        int num_cols = arr[0].length;
        for(int i = 0; i < num_rows ; i++){
            for(int j = 0; j < num_cols ; j++){
                System.out.printf("%d\t",arr[i][j]);
            }
            System.out.println();
        }
    }

    // Displaying a 2D Array - column-wise traversal
    public static void ColumnDisplay(int arr[][]){
        int num_rows = arr.length;
        int num_cols = arr[0].length;
        for(int j = 0;j<num_cols;j++){
            for(int i = 0; i<num_rows;i++){
                System.out.printf("%d\t",arr[i][j]);
            }
        System.out.println();
        }
    } 

    // Traversing with Enhanced for loop
    public static void EnhancedForLoop(int arr[][]){
        int num_rows = arr.length;
        int num_cols = arr[0].length;
        for(int[] row : arr){
            for(int col : row){
                System.out.printf("%d\t",col);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){{
        int[][] arr = {
        {1,  2,  3},
        {4,  5,  6},
        {7,  8,  9},
        {10, 11, 12}
    };
    
    EnhancedForLoop(arr);
    }
}}