import java.util.*;
class max3return{
    public static int max(int a, int b,int c){
        if (a>b && a>c){
            return 1;
        }
        else if(b>a && b>c){
            return 2;
        }
        else{
            return 3;
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int result=max(a,b,c);
        if (result==1){
            System.out.println("a is max");
        }
        else if(result==2){
            System.out.println("b is max");
        }
        else{
            System.out.println("c is max");
        }
    }
}