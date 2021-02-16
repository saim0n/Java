import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int[] array = new int[] {11,22,33,44,55};
        System.out.println(array[2]);

        int[] a;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of array:");
        n = in.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter a [ "+ i + "] = ");
            a[i] = in.nextInt();
        }
        for (int j = 0; j < n; j++) {
            System.out.println(a[j]);
         }
    }
}
