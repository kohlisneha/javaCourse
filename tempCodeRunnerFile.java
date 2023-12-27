public class PatternWithWhile{
    public static void main(String args[]){
        int i=0;
        while(i<5){
            int j=0;
            while(j<i){
            System.out.print(i);
            j++;
            }
            System.out.println();
            i++;
        }
    }
}