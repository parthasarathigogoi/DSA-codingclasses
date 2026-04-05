import java.util.*;
class searchl{
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int trget=4;
        int [][]arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==trget){
                System.out.print(i+" "+j);
                }
            }
        }
    }
}