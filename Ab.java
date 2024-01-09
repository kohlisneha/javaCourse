import java.util.Scanner;
public class Ab{
    public static void main(String args[]){
    String s="Sneha kohli kk";
    String a[]=s.split(" ");
    
    for(int i=0;i<a.length-1;i++){
        System.out.print(a[i].charAt(0)+".");
    }
    System.out.println(a[a.length-1]);

    }

}