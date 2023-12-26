// public class NumbersPattern{
//     public static void main(String args[]){
//         int i=0;
      
//         do{
//             int j=0;
//             do{
//                 System.out.print("*");
//                 j++;
//             }while(j<i);
//             System.out.print("\n");
//              i++;
//         }while(i<5);
//     }
// }
public class NumbersPattern{
    public static void main(String args[]){
        int i=0;
        do{ int j=1;
           do{
            System.out.print(j);
            j++;
           }
        while(j<i);
        System.out.print("\n");
        i++;
    }while(i<5);
}
}