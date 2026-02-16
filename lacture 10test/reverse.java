import java.util.*;
class reverse{
    public static int reverse(int n){

        int sign = n < 0 ? -1 : 1;
        n = Math.abs(n);
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev * sign;

    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=reverse(n);
        System.out.println(a);
        
        
    }
}