import java.util.Scanner;
public class Palindrome{

    public static boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;

        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        if(isPalindrome(a)){
            System.out.println("The string "+a+" is a palindrome");
        }
        else{
            System.out.println("The string "+a+" is not a palindrome");
        }


    }
}