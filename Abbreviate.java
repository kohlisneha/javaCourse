import java.util.Scanner;
public class Abbreviate{
    public static void main(String args[]){
    String s="sneha kohli";
    String a[]=s.split(" ");
    a[0]="sneha";
    a[1]="kohli";
    System.out.println(a[0].charAt(0)); 
    }

}