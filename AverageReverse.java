// import java.util.Scanner;
// public class AverageReverse{
//     public static void main(String args[]){
//         int a;
//         System.out.println("enter the number");
//         Scanner sc=new Scanner(System.in);
//         a=sc.nextInt();
//         int sum=0;
//         for(int i=a;i>=1;i--){
//             System.out.println(i);
//             sum+=i;
//         }
//         int avg=(sum/a);
//         System.out.println("The average of numbers are");
//         System.out.println(avg);
//     }
// }


// ----Method Second-----

import java.util.Scanner;
public class AverageReverse{
 private void Reverse(){
    System.out.println("enter the number");
 }


    public static void main(String args[]){

int a;

AverageReverse ar=new AverageReverse();
ar.Reverse();
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
int sum=0;
        for(int i=a;i>=1;i--){
            System.out.println(i);
            sum+=i;
        }
        int avg=(sum/a);
        System.out.println("The average of numbers are");
        System.out.println(avg);



    }
}

