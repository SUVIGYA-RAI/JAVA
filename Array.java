public class Array {
    public static void main(String[] args) {
        // int[] numbers = new int[5];  
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(arr[2]);
        System.out.println(arr.length); 

        // Multidimensional array 
        int[][] matrix = new int[3][3];
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(matrix[1][2]);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // enhanced version for loop
        for (int num : arr) {
            System.out.println(num);
        }

        // iterating 2D loop
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        void printNumbers(int... numbers) {  // ... represnts varagrs which allows passing variable number of arguments
            for (int num : numbers) {
                System.out.println(num);
            }
        }
        printNumbers(1, 2, 3, 4, 5);
    }
}
