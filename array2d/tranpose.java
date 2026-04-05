import java.util.*;
class tranpose{
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int [][]arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<j){

                
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
                }
            }
        }
        for(int k=0;k<n;k++){
            for(int l=0;l<n;l++){
                System.out.print(arr[k][l]+" ");
            }
            System.out.println();
        }
    }
}

