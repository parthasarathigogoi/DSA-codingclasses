import java.util.*;
class wave{
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int [][]arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int i=0;
        int j=0;
        while(i<n){
            if(j%2==0){
                System.out.print(arr[i][j]+" ");
                i++;
            }
                for(j=n-1;j>=0;j--){

                    System.out.print(arr[i][j]+" ");
                }
                i++;
                
            
        }
    }
}