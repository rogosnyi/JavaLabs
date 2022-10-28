// C5 = 1
// C7 = 3
// С11 = 4
// C = Bт
// int elements
// Обчислити суму найбільших елементів в рядках матриці з парними номерами
// та найменших елементів в рядках матриці з непарними номерами


public class lab2 {
    public static void main(String args[]){

        int original[][]={
                {2, 4, 15, 11},
                {18, 7, 3, 13},
                {6, 2, 14, 1},
                {21, 16, 8, 3}
        };

        int transpose[][]=new int[4][4];

        for(int i=0; i<original.length; i++){
            for(int j=0; j<original[i].length; j++){
                transpose[i][j]=original[j][i];
            }
        }

        System.out.println("Task1:\nOriginal matrix:");
        matrixPrint(original);

        System.out.println("Transparent matrix:");
        matrixPrint(transpose);

        System.out.println("Task 2:");
        minMaxNum(transpose);
    }

    private static void matrixPrint(int[][] matrix) {
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void minMaxNum (int[][] matrix) {
        int row = matrix[0].length;
        int col = matrix.length;

        int maxSum = 0;
        int minSum = 0;

        for (int i = 0; i < row; i++) {
            if (i % 2 == 0) {
                int max = matrix[i][0];
                for (int j = 1; j < col; j++) {
                    if (matrix[i][j] > max) max = matrix[i][j];
                }
                System.out.println(max + " - Max number in " + i + " row ");
                maxSum += max;
            } else {
                int min = matrix[i][0];
                for (int j = 1; j < col; j++) {
                    if (matrix[i][j] < min) min = matrix[i][j];
                }
                System.out.println(min + " - Min number in " + i + " row ");
                minSum += min;
            }
        }
        System.out.println();
        System.out.println("Max numbers sum: " + maxSum);
        System.out.println("Min numbers sum: " + minSum);
    }
}

