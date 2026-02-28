import java.util.*;
class binary{
    public static void main(String []args){
        int []arr={4,5,6,7,8,0,1,2};
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int n=arr.length;
        int s=arr[0];
        int e=arr[n-1];
        while(s<e){
            int mid=(s+e)/2;
            if(arr[mid]==target){
                System.out.print(mid);
                return ;

            }else if(arr[mid]>target){
                e=mid-1;
            }else{
                s=mid+1;
            }
            

        }
    }
}