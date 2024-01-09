public class Wrapper{
    public static void main(String args[]){
        int a=10;
        Integer b=Integer.valueOf(a);
        int c=15,d=13;
        Integer cInteger=Integer.valueOf(c);//autoboxing
        Integer dInteger=Integer.valueOf(d);
        System.out.println(b.max(dInteger,b));
        System.out.println(cInteger.max(b.max(dInteger,b),cInteger));

        System.out.println(cInteger.min(b.min(dInteger,b),cInteger));
        int v=b.intValue();

    }
}