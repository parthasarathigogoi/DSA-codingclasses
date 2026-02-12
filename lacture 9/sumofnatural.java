import java.util.*;
class sumofnatural{
    public static void sum(int n){
        int a=(n*n+1)/2;
        System.out.println(a);
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sum(n);
    }
}