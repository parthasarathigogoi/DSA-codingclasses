import java.util.*;
class findnum{
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=5;
        int [][]arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int i=0;
        int j=n-1;
        while(i<n && j>=0){
            if(target==arr[i][j]){
                System.out.println(i+""+j);
                break;
            }else if(target>arr[i][j]){
                i++;
            }else if(target<arr[i][j]){
                j--;
            }
        }
    }
}