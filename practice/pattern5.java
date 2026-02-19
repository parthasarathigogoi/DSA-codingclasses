import java.util.*;
public class pattern5{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int space=n-1;
        int star=n;
        int row=1;
        while(row<=n){
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j=1;
            
            while(j<=star){
                if(row==1||row==n||j==1||j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

                j++;
            }
            System.out.println();
            row++;
            space--;
        }
    }
}