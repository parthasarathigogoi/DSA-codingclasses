import java.util.*;
class minimum{
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][]arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int mini=arr[0][0];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]<mini){
                    mini=arr[i][j];
                }

            }
            
        }
        System.out.println(mini);
    }
}