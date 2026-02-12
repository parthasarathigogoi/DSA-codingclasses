import java.util.*;
class simpleintrest{
    public static void result(double p,double t,double r){
        
        double a=p*r*t/100;
        System.out.println(a);
    }
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        double r=8.25;
        double p=sc.nextInt();
        double t=sc.nextInt();
        result(p,t,r);
    }
}