import java.util.Scanner;

public class Deletionarray {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the values:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Your array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nEnter the location of the element to delete:");
        int d = sc.nextInt();

        for (int i = d; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
        n--; 

        System.out.println("After deletion, your array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
