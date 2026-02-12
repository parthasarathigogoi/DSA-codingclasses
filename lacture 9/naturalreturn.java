import java.util.*;
class naturalreturn{
    public static int sum(int n){
        int a=(n*n+1)/2;
        return a;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=sum(n);
        System.out.println(b);
    }
}