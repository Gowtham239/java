import java.util.*;

class TwoDArrays {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int m = input.nextInt();
        System.out.print("Enter number of columns: ");
        int n = input.nextInt();

        int[][] matrix1 = new int[m][n];
        // int[][] matrix2 = new int[m][n];
        int[] diagonal = new int[matrix1.length];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }

        
        //diagonal values
        for(int i=0; i<matrix1.length; i++) {
            for(int j=i; j<=i; j++) {
                diagonal[i] = matrix1[i][j];
            }
        }
        
        System.out.println(Arrays.toString(diagonal));

        input.close();
    }
}