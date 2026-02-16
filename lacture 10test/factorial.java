import java.util.*;
class factorial{
    public static long factorial(int n){
        long result = 1L;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        long fact = factorial(n);
        System.out.println(fact);
    }
}