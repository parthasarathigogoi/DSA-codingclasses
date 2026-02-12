import java.util.*;
class simpleinrestreturn{
    public static int result(int p,int r,int t){
        int a=p*r*t/100;
        return a;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int r=sc.nextInt();
        int t=sc.nextInt();
        int c=result(p,r,t);
        System.out.println(c);
    }
}