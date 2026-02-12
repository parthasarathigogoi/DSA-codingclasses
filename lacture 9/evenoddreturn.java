import java.util.*;
class evenoddreturn{
    public static int check(int a){
        int b =a%2;
        return b;
        
        
    }
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=check(a);
        if(c==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }

}