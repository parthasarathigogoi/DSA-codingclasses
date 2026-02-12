import java.util.*;
class maxnumreturn{
    public static int max(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
        
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=max(a,b);
        if(c==1){
            System.out.println("a is max");
        }
        else{
            System.out.println("b is max");
        }



    }
}