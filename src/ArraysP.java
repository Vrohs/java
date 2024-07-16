import java.util.*;

public class ArraysP {


    public static void printArr() {

        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();

        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = scan.nextInt();
        }

        scan.close();


        System.out.print(Arrays.toString(arr));
    }
}
