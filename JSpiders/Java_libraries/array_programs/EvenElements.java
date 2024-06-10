import java.util.Scanner;
public class EvenElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }
    }
}
