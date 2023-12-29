//array - homogenous data, continuous memory location

//declare - datatype variableName
//memory allocate - variableName = new(Keyword) datatype[Size];
//initialize variable
//use
//[] - array
import java.util.Scanner;
public class Array
{
    public static void main(String args[]) {
       
        String name;
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello World "+a[4]);
        for(int i = 0; i< a.length; i++){
            System.out.println("Enter the value to save at "+i+" position");
            a[i] = sc.nextInt();
        }
       
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}
