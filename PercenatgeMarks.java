import  java.util.Scanner;
public class PercenatgeMarks{
    public static void main(String args[]){
        double phy,chem,bio,comp,mth,marks;
        Scanner sc=new Scanner(System.in);
        phy=sc.nextDouble();
        chem=sc.nextDouble();
        bio=sc.nextDouble();
        comp=sc.nextDouble();
        mth=sc.nextDouble();
        double sum = phy+chem+bio+mth+comp;
        System.out.println("Sum = "+sum);
      marks=((phy+chem+bio+mth+comp)/500)*100;
    // 100 marks for each test
     System.out.println("marks"+marks);
        if(marks>=90){
            System.out.println("Grade A ");

        }
        else if(marks>=80){
            System.out.println("Grade B");
        }
        else if(marks>=70){
            System.out.println("Grade C");
        }
        else if(marks>=60){
            System.out.println("Grade D");
        }
        else if(marks>=40){
            System.out.println("Grade E");
        }
        else if(marks<40){
            System.out.println("Grade F");
        }
    }
}