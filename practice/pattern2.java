import java.util.*;
public class pattern2{
    public static void main (String []args){
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
            int val=row;
            while(j<=num){
                System.out.print(val+" ");
                if(j<=num/2){
                    val++;
                }
                else{
                    val--;
                }
                

                
                
                j++;

            }
       
            System.out.println();
            space--;
            num+=2;
            row++;
        }
    }
}