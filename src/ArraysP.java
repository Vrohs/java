import java.util.*;

public class ArraysP {

    public static Scanner scan = new Scanner(System.in);


    public static void printArr() {


        int length = scan.nextInt();

        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.print(Arrays.toString(arr));
    }

    public static void print2dArr() {


        int size = scan.nextInt();

        int[][] two_arr = new int[size][];

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < row; col++) {

                two_arr[row][col] = scan.nextInt();

            }

        }


        scan.close();


        System.out.print(Arrays.toString(two_arr));
    }
}


