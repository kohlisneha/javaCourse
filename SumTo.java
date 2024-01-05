public class SumTo{

    public static int Sum(int first,int last){
        int sum=0;
        if(first<=last){
            for(int i=first;i<=last;i++){
                sum+=i;
            }

        }
        else{
            for(int i=first;i>=last;i--){
                sum+=i;
            }
        }
        return sum;

    }


    public static void main(String args[]){
        System.out.println(Sum(4,7));
        System.out.println(Sum(-3,1));
        System.out.println(Sum(7,4));
        System.out.println(Sum(9,9));

    }
}