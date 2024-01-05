import java.util.Scanner;
public class LocationFind{
    public static int Location(int arr[]){
            int maxIndex=0;
            int maxVal=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>maxVal){
                    maxVal=arr[i];
                    maxIndex=i;
                }
            }
            return maxIndex;

    }
    public static void main(String args[]){
         int n;
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the size of array");
         n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the values");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=Location(arr);
        System.out.println("The Result Is "+result);

    }
}