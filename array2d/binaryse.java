import java.util.*;
class binaryse{
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][]arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        int mid=arr[0][0]+arr[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==mid){
                    
                }
            }
        }