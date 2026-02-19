import java.util.*;
class pattern6{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=n-1;
        int star=1;
        int row=1;
        while(row<=n){
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j=1;
            int num=star;
            while(j<=star){
                System.out.print(num+" ");
                j++;
                num++;
            }
            System.out.println();
            row++;
            if(row<=n/2+1){
            
                star+=2;
                space--;
            }
            else{
                star-=2;
                space++;
            }
        }

        
    }
}