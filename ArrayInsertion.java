// import java.util.Scanner;
// public class ArrayInsertion
// {
   
//     public static void main(String[] args) {
//        int n=3;
//        int a[][] = new int[n][n];
//        int b[][] = new int[n][n];
//        System.out.println("a at 20 ");
       
//        for(int i = 0; i< n; i++){
//            for(int j =0; j<n; j++){
//                System.out.println("a[][]"+a[i][j]);
//            }
//        }
       
//        a[0][2] = 10;
//        System.out.println("A after the insertion at a[][]:");
//        for(int i=0;i<n;i++){
//         for(int j=0;j<n;j++){
//             System.out.println(a[i][j]);
//         }
//        }
           
//     }
// }



import java.util.Scanner;
public class ArrayInsertion{
    public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size of  values ");
        n=s.nextInt();
        int a[][]=new int[n][n];
        int b[][]=new int[n][n];
        System.out.println("enter the values for array");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("enter the value for a["+i+"]["+j+"]:");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("values for array a for insertion are");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                
                System.out.println(a[i][j]);
            }
        }
        System.out.println("after insertion");
        System.out.println("enter the value for insertion");
        int c=sc.nextInt();

        
        
        
            }
}