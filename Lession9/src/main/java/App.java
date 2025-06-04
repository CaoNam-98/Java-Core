public class App {
    public static void main(String[] args) {
        // 1. Mảng 1 chiều/Java Dimension Array
        int[] arrA;
        String[] arrB = new String[3];

        arrA = new int[]{1, 2, 3, 4, 5};
        arrB = new String[]{"A", "B", "C", "D"};

        long[] arrC = {10, 20, 30};

        System.out.println("----- Array A -----");
        for (int i = 0; i < arrA.length; i++) {
            System.out.println(arrA[i]);
        }

        System.out.println("----- Array B với for bình thường -----");
        // Cách 1 để loop
        for (int i = 0; i < arrB.length; i++) {
            System.out.println(arrB[i]);
        }

        System.out.println("----- Array B với forEach dùng với mảng string -----");
        // Cách 2 để loop với forEach
        for(String str: arrB) {
            System.out.println(str);
        }

        System.out.println("----- Array C -----");
        for (int i = 0; i < arrC.length; i++) {
            System.out.println(arrC[i]);
        }

        // Mảng 2 chiều/ Multidimensional Array
        int[][] xArr = new int[3][3]; // column/row
        xArr[0][0] = 1;
        xArr[0][1] = 2;
        xArr[0][2] = 3;

        xArr[1][0] = 4;
        xArr[1][1] = 5;
        xArr[1][2] = 6;

        xArr[2][0] = 7;
        xArr[2][1] = 8;
        xArr[2][2] = 9;

        System.out.println("--- xArr ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(xArr[i][j]);
            }
            System.out.println();
        }

        int[][] yArr = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        System.out.println("--- yArr ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(yArr[i][j]);
            }
            System.out.println();
        }

        // 3. Mảng răng cưa/Jagged array
        // Mảng 2 chiều
        int arr[][] = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[5];
        arr[2] = new int[2];

        // Tạo mảng răng cưa
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = count++;

        // in ra mảng
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();//new line
        }

        // 4. Clone array
        int[] originalArray = {1, 2, 3, 4, 5};

        // Clone mảng
        int[] clonedArray = originalArray.clone();

        // In cả hai mảng
        System.out.println("Mảng gốc: ");
        for (int i : originalArray) {
            System.out.print(i + " ");
        }

        System.out.println("\nMảng clone: ");
        for (int i : clonedArray) {
            System.out.print(i + " ");
        }

        // Thay đổi giá trị trong mảng gốc và kiểm tra mảng clone
        originalArray[0] = 100;

        System.out.println("\n\nSau khi thay đổi mảng gốc:");
        System.out.println("Mảng gốc: ");
        for (int i : originalArray) {
            System.out.print(i + " ");
        }

        System.out.println("\nMảng clone: ");
        for (int i : clonedArray) {
            System.out.print(i + " ");
        }

        // 5. Clone mảng nhiều chiều
        int[][] originalArray1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Clone mảng
        // int[][] clonedArray1 = originalArray1.clone();

        // Deep copy
        int[][] clonedArray1 = new int[originalArray1.length][];
        for (int i = 0; i < originalArray1.length; i++) {
            clonedArray1[i] = originalArray1[i].clone();
        }

        // In mảng gốc
        System.out.println("\n\nMảng gốc(1): ");
        for (int[] row : originalArray1) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // Thay đổi giá trị trong mảng gốc
        originalArray1[0][0] = 100;

        System.out.println("\nSau khi thay đổi mảng gốc:");
        System.out.println("Mảng gốc(2): ");
        for (int[] row : originalArray1) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println("Mảng clone: ");
        for (int[] row : clonedArray1) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
