import java.util.*;
class apseries{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("a=");
        int a=sc.nextInt();
        
        System.out.print("d=");
        int d=sc.nextInt();
        for(int i=1 ; i<=50 ; i++){
            System.out.println(a);
            a=a+d;
        }

        
       
    }
}
