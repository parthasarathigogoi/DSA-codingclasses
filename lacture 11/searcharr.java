import java.util.*;
class searcharr{
    public static void searcharr(int target,int[] arr){
        for(int j=0;j<=4;j++){
            if(arr[j]==target){
                System.out.println("find");
                return;
            }
            
        }

        System.out.println("not found");

    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("target==");
        int target=sc.nextInt();
        int arr[]=new int[5];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        searcharr(target,arr);

    }
}