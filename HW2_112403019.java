public class HW2_112403019 {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        rotate(matrix1);
        printMatrix(matrix1);

        System.out.println("--------------------------------");

        int[][] matrix2 = {
                {15, 3, 19, 32, 1, 11},
                {22, 8, 27, 17, 26, 4},
                {10, 29, 20, 21, 6, 18},
                {5, 23, 28, 33, 9, 2},
                {24, 16, 30, 7, 14, 12},
                {13, 25, 31, 34, 36, 35}
        };
        rotate(matrix2);
        printMatrix(matrix2);

        System.out.println("--------------------------------");

        int[][] matrix3 = {
                {76, 4, 55, 82, 24, 13, 64, 19, 43, 48},
                {42, 10, 87, 66, 3, 53, 27, 58, 45, 79},
                {92, 50, 98, 5, 20, 100, 11, 36, 60, 21},
                {90, 29, 15, 84, 23, 70, 77, 26, 96, 57},
                {89, 68, 41, 71, 34, 1, 54, 73, 2, 37},
                {97, 6, 44, 91, 75, 63, 14, 56, 62, 80},
                {46, 81, 85, 78, 18, 17, 52, 94, 31, 30},
                {86, 47, 67, 33, 9, 7, 22, 83, 74, 12},
                {32, 28, 65, 40, 39, 95, 61, 35, 88, 59},
                {25, 38, 72, 16, 93, 8, 69, 49, 51, 99}
        };
        rotate(matrix3);
        printMatrix(matrix3);
    }
    private static void rotate(int[][] matrix) {
        int size = matrix.length;
        if(size % 2 != 0){//判斷size是奇數還是偶數
            size = size / 2;
            for (int i = 0; i < size; i++) {//循環0-(size-1)
                for (int j = 0; j <= size; j++) {//循環0-size
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[matrix.length - 1 - j][i];
                    matrix[matrix.length - 1 - j][i] = matrix[matrix.length - 1 - i][matrix.length - 1 - j];
                    matrix[matrix.length - 1 - i][matrix.length - 1 - j] = matrix[j][matrix.length - 1 - i];
                    matrix[j][matrix.length - 1 - i] = temp;
                }
            }
        }
        else{
            size = size / 2;
            for (int i = 0; i < size; i++) {//循環0-(size-1)
                for (int j = 0; j < size; j++) {//循環0-(size-1)
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[matrix.length - 1 - j][i];
                    matrix[matrix.length - 1 - j][i] = matrix[matrix.length - 1 - i][matrix.length - 1 - j];
                    matrix[matrix.length - 1 - i][matrix.length - 1 - j] = matrix[j][matrix.length - 1 - i];
                    matrix[j][matrix.length - 1 - i] = temp;
                }
            }
        }
    }
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%4d ", num);
            }
            System.out.println();
        }
    }
}
