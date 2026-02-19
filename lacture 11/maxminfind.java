import java.util.*;
class maxminfind{
    public static void maxminfind(int arr[]){
        for(int j=0;j<=4;j++){
            if(arr[0]>arr[j]){
                System.out.println(arr[0]);
            }
            else if(arr[1]>arr[j]){
                System.out.println(arr[1]);
            }
            else if(arr[2]>arr[j]){
                System.out.println(arr[2]);
            }
            else if(arr[3]>arr[j]){
                System.out.println(arr[3]);
            }
            else{
                System.out.println(arr[4]);
            }
        }

    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int []arr=new int[5];
        for (int i=0;i<=arr.length;i++){
            arr[i]=sc.nextInt();
        }
        maxminfind(arr[]);
    }
}