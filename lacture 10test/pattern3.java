import java.util.*;
class pattern3{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=n-1;
        int num=1;
        int row=1;
        while(row<=n){
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=num){
                System.out.print(" "+j);
                j++;
            }
            System.out.println();
            num+=2;
            space--;
            row++;
        }
    }
}